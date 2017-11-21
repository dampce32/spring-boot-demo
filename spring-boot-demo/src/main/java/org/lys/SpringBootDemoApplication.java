package org.lys;

import org.lys.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDemoApplication {

//	@Value("${book.author}")
//	private String bookAuthor;
//	@Value("${book.name}")
//	private String bookName;
//
//	@RequestMapping("/")
//	String index() {
//		return "book name is:" + bookName + " and book author is:" + bookAuthor;
//	}
	
	@Autowired
	private AuthorSettings authorSettings; 
	
	@RequestMapping("/")
	public String index(){
		return "author name is "+ authorSettings.getName()+" and author age is "+authorSettings.getAge();
	}


	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringBootDemoApplication.class);
//		app.setBannerMode(Mode.OFF);//关闭显示banner
		app.run(args);
//		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
