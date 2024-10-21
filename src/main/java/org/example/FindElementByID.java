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

        WebElement Search_input = driver.findElement(By.id("searchbox_input"));

        Search_input.sendKeys("Panda");
        //here we couldn't find an id the element, so I decide to use the Xpath

        WebElement Click = driver.findElement(By.xpath("//button[@aria-label='Search']"));


        Click.click();

        try {
            // Pausing execution for 5 seconds (5000 milliseconds)
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.navigate().back();

        Search_input.clear();










    }


}
