package com.e2eTest.automation.utils;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jdk.internal.org.jline.utils.Log;

/**
 * This class contains all the methods requireed by selenium to perform actions
 * on web element. It is a repository so that same code need to be written again
 */
public class SeleniumUtils extends BasePage {

	/** driver. */
	private static WebDriver driver;

	public SeleniumUtils() {
		super(driver);
		SeleniumUtils.driver = Setup.getDriver();
	}

	/**
	 * method to open specified url
	 * 
	 * @param url to open url
	 */
	public void get(String url) {
		driver.get(url);
	}

	/**
	 * method to navigate to specified page
	 * 
	 * @param url navigation url
	 */
	public void navigate(String url) {
		driver.navigate().to(url);
	}

	/**
	 * method to click on element using Actions class
	 * 
	 * @param element to be clicked
	 */
	public void clickOnElementUsingActions(WebElement element) {
		Actions actions = new Actions(Setup.getDriver());
		actions.moveToElement(element);
		actions.click().perform();
	}

	/**
	 * method to get title of the page
	 * 
	 * @return title
	 */
	public String getTitele() {
		return Setup.getDriver().getTitle();
	}

	/**
	 * method to get page source
	 * 
	 * @return page source
	 */
	public String getPageSource() {
		return Setup.getDriver().getPageSource();
	}

	/**
	 * method to get text from Alert
	 * 
	 * @return alert text
	 */
	public String getAlertText() {
		try {
			Alert alert = Setup.getDriver().switchTo().alert();
			return alert.getText();
		} catch (NoAlertPresentException e) {
			throw new NoAlertPresentException();
		}
	}

	/**
	 * method wait for element to be clickable
	 * 
	 * @param locator
	 */
	public void waitForElementToBeClickable(WebElement elementAttr) {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(elementAttr));
	}

	/**
	 * method to clear field
	 * 
	 * @param element
	 */

	public void clearField(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			Log.info(String.format("The following element could not be cleared", element.getText()));
		}
	}

	/**
	 * method to to click on element
	 * 
	 * @param elementAttr
	 */

	public void click(WebElement elementAttr) {
		if (elementAttr.getClass().getName().contains("By")) {
			waitForElementToBeClickable(elementAttr);
			driver.findElement((By) elementAttr).click();

		} else {
			elementAttr.click();
		}
	}

}