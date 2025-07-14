package epicode.U4W5D1_SPRING;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class U4W5D1SpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(U4W5D1SpringApplication.class, args);
		epicode.U4W5D1_SPRING.Entities.Menu menu = context.getBean(epicode.U4W5D1_SPRING.Entities.Menu.class);
		menu.printMenu();
	}

}
