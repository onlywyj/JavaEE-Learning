package com.file.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.file.mapper.MyfileMapper;
import com.file.model.Myfile;
import com.file.model.MyfileExample;

@Service
public class FileService {

	@Resource
	private MyfileMapper myfileMapper;
	private MyfileExample myfileExample ;
	
	//插入数据库信息
	public void insert(Myfile myfile) {
		myfileMapper.insert(myfile);
	}
	
	public List<Myfile> getAllFile(){		
		return myfileMapper.selectByExample(myfileExample);
	}
	public void deleteFile(int id) {
		myfileMapper.deleteByPrimaryKey(id);
	}
	//获取文件
	public String getFileNameById(int id) {
		return myfileMapper.selectByPrimaryKey(id).getFilename();
	}
}
