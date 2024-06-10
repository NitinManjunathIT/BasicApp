package in.pwskills.nitin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//bug no 130
		System.out.println("Working on high priority task...");

		int data =10;
		String name="change in project source code";
		SpringApplication.run(Application.class, args);
	}

}
