package com.file.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.file.model.Myfile;
import com.file.service.FileService;

@Controller
public class MyUpload {

	@Resource
	private FileService fileService;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/fileUpload")
	public String fileUpload(String authorName,List<MultipartFile> uploadFile,
			                 HttpServletRequest request) {
		System.out.println(authorName+" "+uploadFile);
		if(!uploadFile.isEmpty()&&uploadFile.size() > 0) {
			for(MultipartFile file:uploadFile) {
				String originalFileName = file.getOriginalFilename();
				String dirPath = "d:\\tmp\\";
				File newfile = new File(dirPath);
				if(!newfile.exists()) {
					newfile.mkdir();
				}
				String newFileName = authorName+"_"+UUID.randomUUID()+"_"+originalFileName;
				try {
					File tmpFile = new File(dirPath+newFileName);
					file.transferTo(tmpFile);	
					//构造出文件对象，插入数据库
					Myfile myfile = new Myfile();
					myfile.setAuthorname(authorName);
					myfile.setFilename(newFileName);
					myfile.setFilesize((int)tmpFile.length()/1024);
					myfile.setFilecount(0);
					fileService.insert(myfile);
				}  catch (Exception e) {					
					e.printStackTrace();
					return "error";
				}
			}
		}		
		return "redirect:getAllFile";
	}
	@RequestMapping("/getAllFile")
	public String getAllFile(Model model) {
		model.addAttribute("allFile", fileService.getAllFile());
		return "success";
	}
	@RequestMapping("/delete")
	public String delete(int id) {
		System.out.println("id="+id);	
		//获取文件名
		String tmp = fileService.getFileNameById(id);
		System.out.println(tmp);
		File file = new File("d:\\tmp\\"+tmp);
		//从磁盘物理删除
		if(file.exists())
			file.delete();
		//之后，才能从数据库删除
		fileService.deleteFile(id);
		return "redirect:getAllFile";
	}
	@RequestMapping("/downLoad")
	public ResponseEntity<byte[]> fileDownLoad(HttpServletRequest request,String filename) throws IOException {
		String path = "d:\\tmp\\";
		File file = new File(path+filename);
		//http响应头
		HttpHeaders headers = new HttpHeaders();
		//通知浏览器以下载的方式打开文件
		headers.setContentDispositionFormData("attachment", filename);
		//以流的形式下载文件
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		//以SpringMVC框架中的ResponseEntity对象封装下载数据
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.OK);
	}
}
