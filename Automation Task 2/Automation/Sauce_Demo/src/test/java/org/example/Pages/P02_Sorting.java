package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.Step_Def.Hooks.driver;

public class P02_Sorting {
    public WebElement Today_deals_icon() {
        return driver.findElement(By.className("nav-a"));
    }

    public WebElement Filter_icon() {
        return driver.findElement(By.xpath("</html/body/div[1]/div[1]/div[41]/div/div[1]/div/div[2]/div[2]/div[1]/div/span[2]/div/label/i"));
    }

    public WebElement Discount_filter() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[41]/div/div[1]/div/div[2]/div[2]/div[4]/div/span[2]/div/label/i"));
    }
    public WebElement Item() {
        return driver.findElement(By.className("a-truncate-cut"));
    }
}
