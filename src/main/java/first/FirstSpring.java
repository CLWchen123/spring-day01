package first;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpring {
	public static void main(String[] args) {
		/**
		 * ����Spring
		 * ApplicationContext��һ���ӿ�,������Spring�����Ļ�������.
		 * ClassPathXmlApplicationContextʵ����ApplicationContext�ӿ�.
		 * ע:������·��ȥ���������ļ�
		 */
		
		//����id��ö�Ӧ�Ķ���,getBean�����ĵ�һ��������bean��id
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
