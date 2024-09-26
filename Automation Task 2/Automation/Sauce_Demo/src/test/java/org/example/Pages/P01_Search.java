package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.Step_Def.Hooks.driver;

public class P01_Search {
    public WebElement Search_bar() {
        return driver.findElement(By.id("twotabsearchtextbox"));
    }

    public WebElement Search_click() {
        return driver.findElement(By.id("nav-search-submit-button"));
    }

    public WebElement Add_to_card() {
        return driver.findElement(By.id("a-autoid-3-announce"));
    }
    public WebElement Add_to_card_icon() {
        return driver.findElement(By.id("nav-cart-count"));
    }
    public WebElement name_of_item() {
        return driver.findElement(By.className("a-size-mini a-spacing-none a-color-base s-line-clamp-4"));
    }
    public WebElement name_of_item_in_add_card() {
        return driver.findElement(By.className("a-truncate-cut"));
    }
}