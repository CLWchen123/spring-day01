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
	 * ����bean��������
	 */
	public void test1() { 
		ApplicationContext ac = new ClassPathXmlApplicationContext("basic.xml");
		ScopeBean sb1 = ac.getBean("sb1",ScopeBean.class);
		ScopeBean sb2 = ac.getBean("sb1",ScopeBean.class);
		System.out.println(sb1==sb2);
	}
	
	@Test
	/**
	 * ����bean����������
	 */
	public void test2() { 
		/**
		 * ��ΪApplicationContext�ӿ�û���ṩ�ر������ķ���(close����),
		 * ��������Ҫ��ClassPathXmlApplicationContext
		 */
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("basic.xml");
		MessageBean mb1 = ac.getBean("mb1",MessageBean.class);
		System.out.println("mb1:"+mb1);
		
		//�ر�Spring����
		ac.close();
	}
	
	@Test
	/**
	 * ����bean���ӳټ���
	 */
	public void test3() { 
		ApplicationContext ac = new ClassPathXmlApplicationContext("basic.xml");
		
	}
}
