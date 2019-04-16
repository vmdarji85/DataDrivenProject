package com.w2a.rough;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.jdbc.JDBCAppender;

public class SampleEntry {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		Logger Mylogger = LogManager.getLogger("LoggerParent");
		// Logger mychildLogger = LogManager.getLogger("LoggerParent.child ");
		/*
		 * Logger logger1child = LogManager.getLogger("child1.childofLogger1"); Logger
		 * Logger1GrandChild = LogManager.getLogger("child1.childofLogger1.GrandChild");
		 * 
		 * System.out.println("logger1's full name is " +
		 * logger1.getParent().getName());
		 * System.out.println("logger1Child's full name is " +
		 * logger1child.getParent().getName());
		 * System.out.println("loggerGrandChild's full name is " +
		 * Logger1GrandChild.getParent().getName());
		 */
		/*
		
	}

	/*
	 * Logger logger4 = LogManager.getLogger("Logger1");
	 * 
	 * 
	 * 
	 * Enumeration loggers = LogManager.getCurrentLoggers();
	 * while(loggers.hasMoreElements()) { logger3.info("Logger name is " +
	 * loggers.nextElement().getClass().getName());
	 * 
	 * }
	 * 
	 * Logger rootLogger = LogManager.getRootLogger(); Logger rootof1 =
	 * logger1.getRootLogger(); if(rootof1.equals(rootLogger) ) {
	 * 
	 * rootof1.info("rootLogger and rootof1 are same objects");
	 * rootof1.info("The root logger name is " + rootLogger.getName());
	 * 
	 * 
	 * } else { rootof1.info("rootLogger and rootof1 are diffrent objects"); }
	 */
		JDBCAppender dbAppender = new JDBCAppender();
		
		dbAppender.setURL("jdbc:mysql://localhost/test");
		dbAppender.setUser("Vivek");
		dbAppender.setPassword("abcd");
		dbAppender.setDriver("com.mysql.jdbc.Driver");
		
		dbAppender.setSql("INSERT INTO LOGS VALUES ('%x', now() ,'%C','%p','%m'");
		
		dbAppender.activateOptions();
		
		Mylogger.addAppender(dbAppender);
		int x=0;
		while(x<11) {
			Mylogger.debug("This is just a log that I want to print " + x);
			x++;
		}
		
}
	
}
