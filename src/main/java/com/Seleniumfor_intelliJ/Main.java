package main.java.com.Seleniumfor_intelliJ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.setProperty("webdriver.gecko,driver","C:\\Webdrivers\\marionette");
        WebDriver obj = new FirefoxDriver();
        obj.get("https://www.google.de/");
    }
}
