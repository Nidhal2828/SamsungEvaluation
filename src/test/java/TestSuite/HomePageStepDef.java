package TestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utiles;
import Page.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

    HomePage homePage;

    @Given("Utilisateur est sur la page daccueil")
    public void utilisateur_est_sur_la_page_daccueil() throws Exception {
        
        Config.driver = new ChromeDriver();
        Config.confchrome(); 
        Config.maximiseWindow();
        Config.driver.get(Utiles.getproprety("webhomelink")); 
        homePage = new HomePage();
    }

    @When("Utilisateur survole le menu {string} And Utilisateur clique sur le sous-menu {string}")
    public void utilisateur_survole_le_menu_and_utilisateur_clique_sur_le_sous_menu(String menuName, String sousMenuName) throws InterruptedException {
        homePage.survolerMenu(menuName);  
        homePage.cliquerSurSousMenu(sousMenuName);  
    }

    @Then("Utilisateur est sur la page {string}")
    public void utilisateur_est_sur_la_page(String expectedTitle) throws InterruptedException {
        homePage.verifierTextePage(expectedTitle);
        Config.driver.quit();  
    }
}
