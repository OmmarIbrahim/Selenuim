package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FindElementByID {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://duckduckgo.com/");

            WebElement tool = driver.findElement(By.cssSelector(".searchbox_input__bEGm3"));

            tool.sendKeys("Panda");


        try {
            // Pausing execution for 2 seconds (2000 milliseconds)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }











    }


}
