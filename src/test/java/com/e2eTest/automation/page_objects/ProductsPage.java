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

	public ProductsPage() {

		super(Setup.getDriver());

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
	
}
