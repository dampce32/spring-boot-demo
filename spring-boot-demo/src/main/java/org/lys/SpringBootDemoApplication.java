package org.lys;

import java.util.ArrayList;
import java.util.List;

import org.lys.support.CustomRepositoryFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RestController
@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = CustomRepositoryFactoryBean.class)
@EnableCaching
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
	
//	@Autowired
//	private AuthorSettings authorSettings; 
//	
//	@RequestMapping("/")
//	public String index(){
//		return "author name is "+ authorSettings.getName()+" and author age is "+authorSettings.getAge();
//	}

	
	@RequestMapping("/")
	public String index(Model model){
		Person single = new Person("aa",11);
		
		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person("xx",11);
		Person p2 = new Person("yy",22);
		Person p3 = new Person("zz",33);
		people.add(p1);
		people.add(p2);
		people.add(p3);
		
		model.addAttribute("singlePerson", single);
		model.addAttribute("people", people);
		
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringBootDemoApplication.class);
//		app.setBannerMode(Mode.OFF);//关闭显示banner
		app.run(args);
//		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
