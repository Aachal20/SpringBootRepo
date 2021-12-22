package com.nt;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.beans.WishMessageGenerator;

@SpringBootApplication
public class BootProj01DependencyInjectionApplication {
	@Bean(name="cal")
    public Calendar createCalender() {
		return Calendar.getInstance();   //return GregorianCalender class(sub class of calander class)
    }
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj01DependencyInjectionApplication.class, args);
	 //get target class obj
		WishMessageGenerator generator = ctx.getBean("wmg" , WishMessageGenerator.class);
		//invoke b.method
		String msg=generator.generateWishMessage("raja");
		System.out.println("WishMessage is::" +msg);
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
