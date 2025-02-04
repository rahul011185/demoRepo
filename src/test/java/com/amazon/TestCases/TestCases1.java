package com.amazon.TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestCases1 {
   WebDriver driver;
    @Test
    public void testCase(){
        driver=new ChromeDriver();
        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.28.1");
    }
    @Test
    public void testCase1(){
        driver=new ChromeDriver();
        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.28.1");
    }

}
