package com.adactin.runner;


import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base_class.Baseclass;

import adactin.healper.FileReaderManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/java/com/adactin/feature/Adactin.feature",
			glue= "com/adactin/stepdefinition",dryRun = false,
	monochrome=true, stepNotifications = true, publish=true)
	public class  Adactin_runner {
		
	
    public static  WebDriver d;
    @BeforeClass		
    public static void browser() throws IOException {
String launch=FileReaderManager.getinstance().getCRinstance().launchBrowser();
    d=Baseclass.browser_launch(launch);
		}
		
}
