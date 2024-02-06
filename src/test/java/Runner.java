import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner {

	public static void main(String[] args) {


		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.entrata.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
