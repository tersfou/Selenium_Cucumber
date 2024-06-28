package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class ProductsPage extends BasePage {

	@FindBy(how = How.ID, using = "nopSideBarPusher")
	private static WebElement btnMenu;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a")
	private static WebElement btnCatalog;
	
	@FindBy(how = How.XPATH , using = "//p[normalize-space()='Products']")
	private static WebElement btnProduct ;
	
	@FindBy(how = How.XPATH, using = "//input[@id='SearchProductName']")
	private static WebElement productName;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"SearchCategoryId\"]")
	private static WebElement btnProductCategory;
	
	@FindBy(how = How.XPATH , using = "//button[@id='search-products']")
	private static WebElement btnSearch ;
	
	@FindBy(how = How.XPATH , using = "//a[@class='btn btn-primary']")
	private static WebElement btnAddNew ;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Name']")
	private static WebElement nameNewProduct;
	
	@FindBy(how = How.XPATH , using = "//select[@id='TaxCategoryId']")
	private static WebElement btnSelectTax ;
	
	@FindBy(how = How.XPATH , using = "//button[@name='save']")
	private static WebElement btnSave ;
	
	public ProductsPage() {

		super(Setup.getDriver());

	}
	public static WebElement getBtnSelectTax() {
		return btnSelectTax;
	}
	public static WebElement getBtnSave() {
		return btnSave;
	}
	public static WebElement getBtnMenu() {
		return btnMenu;
	}
	
	public static WebElement getBtnCatalog() {
		return btnCatalog;
	}
	
	public static WebElement getBtnProduct() {
		return btnProduct;
	}
	
	public static WebElement getProductName() {
		return productName;
	}
	
	public static WebElement getBtnProductCategory() {
		return btnProductCategory;
	}
	
	public static WebElement getBtnSearch() {
		return btnSearch;
	}
	
	public static WebElement getBtnAddNew() {
		return btnAddNew;
	}
	
	public static WebElement getNameNewProduct() {
		return nameNewProduct;
	}
	
}
