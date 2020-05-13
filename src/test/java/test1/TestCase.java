package test1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import basic.LazyBean;
import basic.MessageBean;
import basic.ScopeBean;

public class TestCase {
	@Test
	/**
	 * 测试bean的作用域
	 */
	public void test1() { 
		ApplicationContext ac = new ClassPathXmlApplicationContext("basic.xml");
		ScopeBean sb1 = ac.getBean("sb1",ScopeBean.class);
		ScopeBean sb2 = ac.getBean("sb1",ScopeBean.class);
		System.out.println(sb1==sb2);
	}
	
	@Test
	/**
	 * 测试bean的生命周期
	 */
	public void test2() { 
		/**
		 * 因为ApplicationContext接口没有提供关闭容器的方法(close方法),
		 * 所以这里要用ClassPathXmlApplicationContext
		 */
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("basic.xml");
		MessageBean mb1 = ac.getBean("mb1",MessageBean.class);
		System.out.println("mb1:"+mb1);
		
		//关闭Spring容器
		ac.close();
	}
	
	@Test
	/**
	 * 测试bean的延迟加载
	 */
	public void test3() { 
		ApplicationContext ac = new ClassPathXmlApplicationContext("basic.xml");
		
	}
}
