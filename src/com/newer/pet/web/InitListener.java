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

import com.newer.pet.domain.Product;
import com.newer.pet.mapper.ProductMapper;

/**
 * Application Lifecycle Listener implementation class InitListener
 *
 */
/**
 * @author acer
 *
 */
/**
 * @author acer
 *
 */
@WebListener
public class InitListener implements ServletContextListener {
	SqlSessionFactory factory;
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent e)  { 
         //获得数据源
    	factory = getFactory();
    	ServletContext application = e.getServletContext();
    	application.setAttribute(AppInfo.APP_SESSION_FACTORY, factory);
    	//加载全局的数据
    	loadData(application);
    
    }

	private void loadData(ServletContext application) {
		SqlSession sqlSession = factory.openSession();
		// TODO
		
		//框架提供了动态代理
		ProductMapper pm = sqlSession.getMapper(ProductMapper.class);
		List<Product> list =pm.findAll();
		application.setAttribute(AppInfo.APP_PRODUCT_LIST, list);
		System.out.println(list);
		
		sqlSession.commit();
		sqlSession.close();
		
	}

	private SqlSessionFactory getFactory() {
		try {
			InputStream in = Resources.getResourceAsStream("config.xml");
			//使用in创建会话工厂
			return new SqlSessionFactoryBuilder().build(in);
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}
