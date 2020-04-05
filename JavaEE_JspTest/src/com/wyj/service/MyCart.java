package com.wyj.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.wyj.domain.Book;

public class MyCart {
	
	HashMap<String, Book> hm = new HashMap<String, Book>();  
	// 添加书(购买数)的第二个版本  
	public void addBook2(String id){   
		if(hm.containsKey(id)){    //hm已经有了这本书   
		Book book=hm.get(id);    
		int buyNums=book.getBuyNums();    
		book.setBuyNums(buyNums+1);   
		}else{    
			hm.put(id, new BookService().getBookByID(id));   
			}  
	} 
	
	// 添加书(购买数)  
	public void addBook(String id, Book book) {   
		if (hm.containsValue(id)) {
			//如果已经购买过这本书，再次购买，则需要 把buyNums++即可    
			book=hm.get(id);    
			int buyNums= book.getBuyNums();    
			buyNums++; //增加1之后，再次放进去即可    
			book.setBuyNums(buyNums);   
			}else{
				//第一次购买    
				hm.put(id, book);   
				}  
	}  
	
	// 删除书  
	public void deleteBook(String id) {   
		hm.remove(id);  
	}
	
	 // 写一个显示该购物车里所有商品（书）的函数
	public ArrayList showMyCart() {   
		ArrayList<Book> al = new ArrayList<Book>();   
		Book book = new Book();   
		// 遍历HashMap;   
		Iterator it = hm.keySet().iterator();   
		while (it.hasNext()) {    
			// 首先取出key    
			String id = (String) it.next();    
			// 然后取出bean    
			book = hm.get(id);    
			al.add(book);   
			}
		System.out.println(al);
		return al;
		
	}  
	
	// 更新书(其实是更新购买书的数量)  
	public void updateBook(String id, int num) {   
		//取出id对应的那本书  
		Book book=hm.get(id);   
		book.setBuyNums(num);  
		}
	
	// 清空书,清空购物车  
	public void clearBook() {   
		hm.clear();  
	}
	
	//返回购物车中物品的总价格  
	public float getTotalPrice(){   
		float  totalPrice=0.0f;   
		ArrayList<Book> al=new ArrayList<Book>();   
		//得到总价格   I
		Iterator iterator=hm.keySet().iterator();    
		while(iterator.hasNext()){     
			//取出书的编号     
			String bookId=(String)iterator.next();    
			Book book=hm.get(bookId);     
			totalPrice+= book.getBuyNums()*Float.parseFloat( book.getPrice());    
			}   
		return totalPrice; 
	}	
	
}
