package com.prop;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProp {

	public static void main(String[] args) throws IOException {
				
		Properties pro = new Properties();
		InputStream file = GetProp.class.getClassLoader().getResourceAsStream("db.properties");
		pro.load(file);
		String name = pro.getProperty("name");
		String pwd = pro.getProperty("pwd");
		System.out.println(name+" "+pwd);

	}

}
