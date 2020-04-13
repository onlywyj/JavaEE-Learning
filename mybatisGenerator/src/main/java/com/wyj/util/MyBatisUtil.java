package com.wyj.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	private static SqlSessionFactory  sqlSessionFactory=null; 	
	static {
		String resource = "sqlMapperConfig.xml";
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			 sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public static SqlSessionFactory getSqlSessionFactory(){
		
		return sqlSessionFactory;
	}		

	//手动提交
	public static SqlSession getSqlSession(){		 
		return  getSqlSessionFactory().openSession();		
	}
	//true 表示创建的SqlSession对象在执行完SQL之后会自动提交事务
	//false 表示创建的SqlSession对象在执行完SQL之后不会自动提交事务，这时就需要我们手动调用sqlSession.commit()提交事务
	public static SqlSession getSqlSession(boolean autoCommit){
		return getSqlSessionFactory().openSession(autoCommit);
	}
}
