package day12;

import java.io.IOException;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		Logger log4j= Logger.getRootLogger();
		PatternLayout layout=new PatternLayout("%d %t %p %M %l %F %C- %m %L %n");
		FileAppender appender = new FileAppender(layout, "Test.log");
	
		log4j.addAppender(appender);
		log4j.info("Hey have a good day");
		log4j.warn("Warning");
		System.out.println("Byeee");

	}

}
