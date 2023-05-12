package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.DriversFac;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends DriversFac{
	
	public void abrirNavegador() {
		boolean headless = false;
		WebDriverManager.chromedriver().setup();
		String site = "https://www.drogariasaopaulo.com.br";
		ChromeOptions chromeOptions = new ChromeOptions();
		if(headless) {
		chromeOptions.addArguments("--headless");
		}
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get(site);
	}
		

}
