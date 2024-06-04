package in.pwskills.nitin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		int a =10;
		int b= 20;
		int c= a+b;
		System.out.println(c);
	}

}
