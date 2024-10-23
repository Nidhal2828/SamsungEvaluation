package TestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utiles;
import Page.ChoixProduit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChoixProduitStepDef {

    @Given("Utilisateur est sur la page des produits")
    public void utilisateur_est_sur_la_page_des_produits() throws Exception {
        Config.driver = new ChromeDriver();
        Config.confchrome();
        Config.maximiseWindow();
        Config.driver.get(Utiles.getproprety("climatiseurlink")); 
    }

    @When("Utilisateur clique sur le produit nomme {string}")
    public void utilisateur_clique_sur_le_produit_nomme(String nomProduit) throws InterruptedException {
        ChoixProduit choixProduit = new ChoixProduit();
        choixProduit.cliquerSurProduit(nomProduit);
    }

    @Then("Utilisateur est sur la page du produit nomme {string}")
    public void utilisateur_est_sur_la_page_du_produit_nomme(String nomProduit) throws InterruptedException {
        
        ChoixProduit choixProduit = new ChoixProduit();
        
        choixProduit.verifierPageProduit(nomProduit);  
        Config.driver.quit(); 
    }
}
    
   

