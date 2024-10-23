package TestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utiles;
import Page.AjoutPanier;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutPanierStepDef {

    @Given("Utilisateur est sur la page du produit")
    public void utilisateur_est_sur_la_page_du_produit() throws Exception {
        Config.driver = new ChromeDriver();
        Config.confchrome();
        Config.maximiseWindow();
        Config.driver.get(Utiles.getproprety("produitlink"));  
        AjoutPanier ajoutPanier = new AjoutPanier();  
    }

    @When("Utilisateur clique sur le bouton {string} And Utilisateur clique sur {string}")
    public void utilisateur_clique_sur_le_bouton_and_utilisateur_clique_sur(String acheter, String continuer) throws InterruptedException {
        AjoutPanier ajoutPanier = new AjoutPanier();  
        ajoutPanier.ajouterProduitAuPanierEtContinuer();  
    }

    @Then("Le produit {string} est correctement ajouté au panier")
    public void le_produit_est_correctement_ajouté_au_panier(String nomProduit) throws InterruptedException {
        AjoutPanier ajoutPanier = new AjoutPanier();  
        ajoutPanier.verifierProduitDansPanier(nomProduit);  
        Config.driver.quit();  
    }
}
