package com.newer.pet.web;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.newer.pet.domain.Category;
import com.newer.pet.mapper.CategoryMapper;

/**
 * 监听器(程序启动就会触发，特定事件发生时，和应用程序的上下文有关系)
 *
 */
@WebListener
public class AppListener implements ServletContextListener{
	SqlSessionFactory factory;
    /**
     * Default constructor. 
     */
    public AppListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     *  应用程序初始化
     */
    public void contextInitialized(ServletContextEvent e)  { 
    	//获得上下文
    	ServletContext application = e.getServletContext();
        
		initSQLSessionFactory(application);
		
		loadCategoryList(application, factory);
    	
    	//从数据库查询获得全局的数据信息
    }
    /**
     * 创建会话工厂（连接数据库）
     * @param application
     */
	private void initSQLSessionFactory(ServletContext application) {
		 //加载数据源(myBatis中的会话工厂就是一个数据源)
		InputStream in;
		try {
			in = Resources.getResourceAsStream("config.xml");
			factory = new SqlSessionFactoryBuilder().build(in);
			//从工厂打开一个会话
			//会话工厂存储在全局作用域(application)
			application.setAttribute(AppInfo.APP_SESSION_FACTORY, factory);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
    
    //加载产品分类列表
	private void loadCategoryList(ServletContext application, SqlSessionFactory factory) {
		SqlSession sqlSession = factory.openSession();
		//会话可以执行各种操作
		CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
		//从数据库查询获得全局的数据信息
		List<Category> categories = categoryMapper.findAll();
		//存储在全局作用域中
		application.setAttribute(AppInfo.APP_CATEGORY_LIST,categories);
		System.out.println("应用上下文初始化完毕："+categories);
		//提交
		sqlSession.commit();
		//关闭会话
		sqlSession.close();
	}
	
}
