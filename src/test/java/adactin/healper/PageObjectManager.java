package adactin.healper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Adactin_login;

public class PageObjectManager {
	public static WebDriver d;
	Adactin_login al ;
	public Adactin_login getAl() {
		al= new Adactin_login(d);
		return al;
	}
	public PageObjectManager(WebDriver d1) {
	this.d = d1;	
	}
	}
	

