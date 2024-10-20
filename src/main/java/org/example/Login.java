package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");




        WebElement UserName = driver.findElement(By.id("username"));


        UserName.sendKeys("tomsmith");


        WebElement Password = driver.findElement(By.id("password"));

         Password.sendKeys("SuperSecretPassword!");
        WebElement login = driver.findElement(By.className("radius"));

        login.click();

    }
}
