package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");


        WebElement UserName =driver.findElement(By.partialLinkText("event")) ;

        UserName.click();







//        driver.quit();










    }
}
