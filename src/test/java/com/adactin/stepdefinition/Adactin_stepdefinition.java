package com.adactin.stepdefinition;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.adactin.pom.Adactin_login;
import com.adactin.runner.Adactin_runner;
import com.base_class.Baseclass;

import adactin.healper.FileReaderManager;
import adactin.healper.PageObjectManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin_stepdefinition extends Baseclass{
	public WebDriver d = Adactin_runner.d;
	PageObjectManager pom = new PageObjectManager(d);
	//Adactin_login a =new Adactin_login(d);
	@Given("Launch the application")
	public void launch_the_application() throws IOException {
	//d.get("https://adactinhotelapp.com/");
String browserurl = FileReaderManager.getinstance().getCRinstance().passurl();
get_url(browserurl);
	}
	@When("User enter below details for login")
	public void user_enter_below_details_for_login(DataTable dataTable) {
    List<Map<String,String>> asMaps = dataTable.asMaps(String.class,String.class);
	 String un = asMaps.get(0).get("Username");   
	 String pass = asMaps.get(0).get("password");
	 inputvalues(pom.getAl().getUser(), un);
	 inputvalues(pom.getAl().getPass(), pass);
	 
//	 WebElement uname = d.findElement(By.id("username"));
//	 uname.sendKeys(un);
//	 WebElement pwd = d.findElement(By.id("password"));
//	 pwd.sendKeys(pass);
	}
	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
	 click_Element(pom.getAl().getButton());
		//WebElement log = d.findElement(By.name("login"));
//	    log.click(); 
//
	}
	@Then("User verifies the login page")
	public void user_verifies_the_login_page() {
    
System.out.println("user verified successfully");
	}




}
