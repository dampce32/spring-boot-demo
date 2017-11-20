package org.lys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/*
 * 
Servlet容器默认的Context路径是/
DispatherServlet匹配的路径(servlet-mapping中的url-patterns)是/*
@ComponentScan路径被默认设置为SampleController的同名package，
也就是该package下的所有@Controller，@Service, @Component, @Repository都会被实例化后并加入Spring Context中。
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}