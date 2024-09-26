package org.example.Step_Def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Sorting;
import org.testng.Assert;

import static org.example.Step_Def.Hooks.driver;

public class TC02_Sorting {
    P02_Sorting Sort = new P02_Sorting();
    @Given("Navigate To URL website")
    public void navigate_to_url_website() {
        driver.navigate().to("https://www.amazon.com/");
    }
    @When("Open Today's Deals")
    public void Open_Today_Deals() {
        Sort.Today_deals_icon().click();
    }
    @When("Apply Filters")
    public void Apply_Filters() {
        Sort.Filter_icon().click();
    }
    @When("Apply Discount Filter")
    public void lApply_Discount_Filter() {
        Sort.Discount_filter().click();
    }
    @Then("Navigate to Fourth Page and Select Item")
    public void selecting_items() {
        String item_name = Sort.Item().getText();
        Assert.assertEquals(item_name,"Blink Outdoor 4 (4th Gen) + Battery Extension Pack — Four-year battery wire-free smart security camera, two-way audio, HD live view, enhanced motion detection — 1 camera system");
    }
}
