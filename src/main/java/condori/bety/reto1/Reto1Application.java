package condori.bety.reto1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Duration;

//import org
@SpringBootApplication
public class Reto1Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto1Application.class, args);
	}

	@Bean
	public String inicio(){
		System.out.println("Reto1");
		System.out.println("Estudiante: Bety Condori");
		return "";
	}

	@Bean
	public String navegador(){
		System.out.println("Abriendo navegador");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com");
		return "";
	}
}
