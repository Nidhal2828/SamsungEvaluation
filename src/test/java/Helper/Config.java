package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	public static WebDriver driver;
	public static   Actions action;

	public static void confchrome() {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
}
	public static void maximiseWindow() {
		driver.manage().window().maximize();
	}
	public static void attente(long s) {
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
		
	}
}
