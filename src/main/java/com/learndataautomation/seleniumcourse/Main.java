package com.learndataautomation.seleniumcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://learndataautomation.com");

        driver.findElement(By.name("name")).sendKeys("varun");
        driver.findElement(By.name("mapping_text_20")).sendKeys("pillai");
        driver.quit();
    }
}