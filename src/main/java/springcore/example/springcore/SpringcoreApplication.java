package springcore.example.springcore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringcoreApplication {
    public static final Logger logger = LoggerFactory.getLogger(SpringcoreApplication.class);

    public static void main(String[] args) {
        System.out.println("Welcome to Spring Concept Demo");
        ApplicationContext context = SpringApplication.run(SpringcoreApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println("Demo Bean = " + demoBean.toString());
        System.out.println(context.getBean(HelloRestController.class));
    }
}
