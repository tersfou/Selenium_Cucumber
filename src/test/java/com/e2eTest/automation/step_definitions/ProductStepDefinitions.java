package com.e2eTest.automation.step_definitions;



import com.e2eTest.automation.page_objects.ProductsPage;
import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefinitions {

	public LoginPage loginPage;
	public SeleniumUtils seleniumUtils;
	public ProductsPage dashbordPage;

	public ProductStepDefinitions() {

		loginPage = new LoginPage();
		seleniumUtils = new SeleniumUtils();
		dashbordPage = new ProductsPage();
	}

	@When("Je clique sur le bouton catalog")
	public void jeCliqueSurLeBoutonCatalog() throws InterruptedException {

		Thread.sleep(3000);
		seleniumUtils.click(ProductsPage.getBtnCatalog());
		
	}

	@When("Je clique sur le bouton products")
	public void jeCliqueSurLeBoutonProducts() throws InterruptedException {
		seleniumUtils.click(ProductsPage.getBtnProduct());
	}

	@When("Je saisis le nom du produit {string}")
	public void jeSaisisLeNomDuProduit(String string) {

	}

	@When("Je saisis la categorie")
	public void jeSaisisLaCategorie() {

	}

	@When("Je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {

	}
	
	@Then("Je verifie le produit {string}")
	public void jeVerifieLeProduit(String string) {
	}
	
	/*Add Product*/
	@When("Je clique sur le bouton add new")
	public void jeCliqueSurLeBoutonAddNew() {
	}










}
