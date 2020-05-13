package first;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpring {
	public static void main(String[] args) {
		/**
		 * 启动Spring
		 * ApplicationContext是一个接口,定义了Spring容器的基本方法.
		 * ClassPathXmlApplicationContext实现了ApplicationContext接口.
		 * 注:依据类路径去查找配置文件
		 */
		
		//依据id获得对应的对象,getBean方法的第一个参数是bean的id
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Apple a1 = ac.getBean("a1",Apple.class);
		System.out.println("a1:"+a1);
		
		Date a2 = ac.getBean("a2",Date.class);
		System.out.println("a2:"+a2);
		
		Calendar call = ac.getBean("call",Calendar.class);
		System.out.println("call:"+call);
		
		Date date2 = ac.getBean("date2",Date.class);
		System.out.println("date2:"+date2);
	}
}
