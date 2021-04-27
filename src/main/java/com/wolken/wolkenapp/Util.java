package com.wolken.wolkenapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.Bean.SongBean;

public class Util {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicaioncontext=new ClassPathXmlApplicationContext("context.xml");
		SongBean bean=applicaioncontext.getBean(SongBean.class);
		System.out.println("Song name "+bean.getName());
		System.out.println("from "+bean.getMovie()+" movie");
		System.out.println("rating "+bean.getRating());
		System.out.println("singer "+bean.getSinger());
		System.out.println("composer "+bean.getComposer());
		System.out.println("year "+bean.getYear());

	}

}
