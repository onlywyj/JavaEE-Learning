package com.wyj.service;

import java.util.ArrayList;

import com.wyj.domain.Book;
import com.wyj.util.SQLHelper;

public class BookService {

	public ArrayList getAllBooks() {
		String sql = "select * from book where 1=?";
		String[] parameters = { "1" };
		ArrayList al = new SQLHelper().executeQuery2(sql, parameters);
		ArrayList<Book> newal = new ArrayList<Book>(); // 需要进行二次业务封装，因为，al中得到的是对象数组，需要转换成 bookBean(一个Bean就是一个java类).
		for (int i = 0; i < al.size(); i++) {
			Object[] obj = (Object[]) al.get(i);
			Book book = new Book();
			book.setId(obj[0].toString());
			book.setBookname(obj[1].toString());
			book.setAuthor(obj[2].toString());
			book.setPublishHouse(obj[3].toString());
			book.setPrice(obj[4].toString());
			book.setNums(obj[5].toString());
			newal.add(book);
		}
		return newal;
	}

	// 根据Book id ，返回一个bookBean
	public Book getBookByID(String id) {
		String sql = "select * from book where id=?";
		String[] parameters = { id };
		ArrayList al = new SQLHelper().executeQuery2(sql, parameters);
		Book book = new Book();
		// 为了安全起见，使用if
		if (al.size() == 1) {
			Object[] obj = (Object[]) al.get(0);
			book.setId(obj[0].toString());
			book.setBookname(obj[1].toString());
			book.setAuthor(obj[2].toString());
			book.setPublishHouse(obj[3].toString());
			book.setPrice(obj[4].toString());
			book.setNums(obj[5].toString());
		}
		return book;
	}
}
