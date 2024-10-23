package Page;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	@FindBy(xpath="/html/body/main/header/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/ul/li/a/span")
	List<WebElement> menus;
	@FindBy(xpath="/html/body/main/header/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/ul/li[4]/ul/li[1]/ul/li/div[1]/div/ul/li/a")
	List<WebElement> sousmenus;
	@FindBy(xpath="/html/body/main/section/div[1]/div[2]/div/h1")
	WebElement veriftext;
	
	public HomePage () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void survolerMenu(String menuName) throws InterruptedException {
        Actions actions = new Actions(Config.driver);
        for (WebElement menu : menus) {
            if (menu.getText().contains(menuName)) {
                actions.moveToElement(menu).perform();  
                Thread.sleep(3000);  
                
            }
        }
    }

    public void cliquerSurSousMenu(String sousMenuName) throws InterruptedException {
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
        for (WebElement sousmenu : sousmenus) {
            if (sousmenu.getText().contains(sousMenuName)) {
                sousmenu.click();  
            }
        }
		
    }catch (Exception e) {
		// TODO: handle exception
	}
    }
    public void verifierTextePage(String expectedText) throws InterruptedException {
        Thread.sleep(3000);
        String actualText = veriftext.getText();
        Assert.assertEquals(expectedText, actualText);
    }
}
	


