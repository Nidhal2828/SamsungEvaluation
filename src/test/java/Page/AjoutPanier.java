package Page;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class AjoutPanier {
	@FindBy(xpath="/html/body/main/section/nav/div[1]/div[1]/div/div/div[3]/form/div/button")
	WebElement btnacheter;
	@FindBy(css = "button.btn.btn-secondary[data-dismiss='modal']")
	WebElement btncontinuer;
	@FindBy(xpath="/html/body/main/header/div/div[2]/div/div[1]/div/div/div[3]/div[3]/div/div/a/i")
	WebElement btnpanier;
	@FindBy(xpath="/html/body/main/section/div/div/div/div/section/div/div[1]/div/div[2]/ul/li/div/div[2]/div[1]/a")
	WebElement verifproduit;
	
	public AjoutPanier () {
		PageFactory.initElements(Config.driver, this);
	}
	public void ajouterProduitAuPanierEtContinuer() throws InterruptedException {
		
		Thread.sleep(3000);
        btnacheter.click();
		WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btncontinuer));	
        Thread.sleep(3000);
        btncontinuer.click();
	}
		
		public void verifierProduitDansPanier(String expectedProduct) throws InterruptedException {
	        btnpanier.click(); 
	        Thread.sleep(3000); 
	        String actualProductName = verifproduit.getText();
	        Assert.assertEquals(expectedProduct, actualProductName);
	}

}
