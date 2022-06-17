package com.base_class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static  WebDriver d ;
//	public Baseclass1(WebDriver d2) {
//		this.d=d2;
//	}

	public static  WebDriver browser_launch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.drivr", ",//driver//chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			d=new ChromeDriver();}
		
		else if(browser.equalsIgnoreCase("ie")) {
			WebDriverManager.edgedriver().setup();
			d=new EdgeDriver();
		}
		else {
			System.out.println("invalid browser");
		}
		d.manage().window().maximize();
		return d;
		}

//get url from user	
	public static void get_url(String url) {
	d.get(url);
    }

//navigation
   public static void naviga(String url2) {
   d.navigate().to(url2);
   }

//user send data
   public static void inputvalues(WebElement element,String value) {
	element.sendKeys(value);
   }

//click method
   public static void click_Element(WebElement element) {
	element.click();
    }

//get title
   public void get_title() {
	d.getTitle();
	}

//screen shot
   public void scrren_shot() throws IOException {
	TakesScreenshot t= (TakesScreenshot) d;
	File src = t.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\ksant\\eclipse-workspace\\Adactin_project2\\screen\\bug1.png");
    FileUtils.copyFile(src, dest);
    }
}
