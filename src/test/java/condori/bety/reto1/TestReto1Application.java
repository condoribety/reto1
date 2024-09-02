package condori.bety.reto1;

import org.springframework.boot.SpringApplication;

public class TestReto1Application {

	public static void main(String[] args) {
		SpringApplication.from(Reto1Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
