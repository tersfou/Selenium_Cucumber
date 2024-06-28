package com.e2eTest.automation.step_definitions;



import com.e2eTest.automation.page_objects.ProductsPage;



import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SelectFromListUtils;
import com.e2eTest.automation.utils.SeleniumUtils;


import io.cucumber.java.en.When;

public class ProductStepDefinitions {

	public LoginPage loginPage;
	public SeleniumUtils seleniumUtils;
	public ProductsPage productsPage;
	public ConfigFileReader configFileReader;
	public SelectFromListUtils selectFromListUtils;

	public ProductStepDefinitions() {

		loginPage = new LoginPage();
		seleniumUtils = new SeleniumUtils();
		productsPage = new ProductsPage();
		configFileReader = new ConfigFileReader();
		selectFromListUtils = new SelectFromListUtils();
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

	@When("Je saisis le nom du produit")
	public void jeSaisisLeNomDuProduit() {

		seleniumUtils.writeText(ProductsPage.getProductName(), configFileReader.getProperties("product.name"));
	}

	@When("Je selectionne une categorie")
	public void jeSelectionneUneCategorie() throws InterruptedException  {

		seleniumUtils.click(ProductsPage.getBtnProductCategory());

		selectFromListUtils.selectDropDownListByIndex(ProductsPage.getBtnProductCategory(), 2);
	}

	@When("Je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {

		seleniumUtils.click(ProductsPage.getBtnSearch());
	}
	

	
	/*Add Product*/
	@When("Je clique sur le bouton add new")
	public void jeCliqueSurLeBoutonAddNew() {
		seleniumUtils.click(ProductsPage.getBtnAddNew());
	}

	@When("Je saisis le nom du nouveau produit")
	public void jeSaisisLeNomDuNouveauProduit() {
		seleniumUtils.writeText(ProductsPage.getNameNewProduct(), configFileReader.getProperties("name.new.product"));

	}
	@When("Je saisis la date de debut disponible")
	public void jeSaisisLaDateDeDebutDisponible() {
	 
	}
	@When("Je saisis la Date de fin disponible")
	public void jeSaisisLaDateDeFinDisponible() {
	  
	}

	@When("Je selectionne un taxe categorie")
	public void jeSelectionneUnTaxeCategorie() {
		seleniumUtils.click(ProductsPage.getBtnSelectTax());

		selectFromListUtils.selectDropDownListByIndex(ProductsPage.getBtnSelectTax(), 2);
	}
	@When("Je clique sur le bouton save")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(ProductsPage.getBtnSave());
	}



}
