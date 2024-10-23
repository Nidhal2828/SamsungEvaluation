package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class ChoixProduit {
	@FindBy(xpath="/html/body/main/section/div[4]/div/div/div[2]/section/section/div[2]/div/div/div[1]/div/div/div/article/div/div[2]/div[1]/h3/a")
	List<WebElement> produit;
	@FindBy(xpath="/html/body/main/section/div/div/div/div/section/div/div[2]/h1")
	WebElement verifProduit;
	
	public ChoixProduit () {
		PageFactory.initElements(Config.driver, this);
	}
	public void cliquerSurProduit(String nomProduit) throws InterruptedException {
		try{
        for (WebElement produits : produit) {
            if (produits.getText().contains(nomProduit)) {
                produits.click();
               
            }
        }
    }catch (Exception e) {
		// TODO: handle exception
    }
	}
		public void verifierPageProduit(String expectedProduct) throws InterruptedException {
	        Thread.sleep(3000); 
	        String actualProductname = verifProduit.getText();
	        Assert.assertEquals(expectedProduct, actualProductname); 
	    }
}

