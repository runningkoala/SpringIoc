package test;

import factory.ApplicationContext;
import factory.ClassPathXmlApplicationContext;
import test.boss;

public class test {

    public static void main(String[] args) {
        String[] locations = {"bean.xml"};
        ApplicationContext ctx = 
		    new ClassPathXmlApplicationContext(locations);
        boss boss = (boss) ctx.getBean("boss");
        System.out.println(boss.tostring());
    }
}