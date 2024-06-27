package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.When;

public class LoginOutLineStepDefinitions {

	public LoginPage loginPage;
	public SeleniumUtils seleniumUtils;

	public LoginOutLineStepDefinitions() {

		loginPage = new LoginPage();
		seleniumUtils = new SeleniumUtils();
	}

	@When("Je saisis l'adresse email {string}")
	public void jeSaisisLAdresseEmail(String email) {
		seleniumUtils.writeText(LoginPage.getEmail(), email);
	}
	@When("Je saisis le mot de passe <{string}>")
	public void jeSaisisLeMotDePasse(String mdp) {
		seleniumUtils.writeText(LoginPage.getPassword(), mdp);
	}

}
