package org.example.Step_Def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.Pages.P01_Search;
import org.testng.Assert;

import static org.example.Step_Def.Hooks.driver;

public class TC01_Search {
    P01_Search login = new P01_Search();
    String name_of_item;
    String name_of_item_in_add_to_card;
    @Given("Navigate to URL website")
    public void navigate_to_url_website() {
        driver.navigate().to("https://www.amazon.com/");
    }

    @When("Search for Car Accessories")
    public void Search_for_Car_Accessories (){
        login.Search_bar().sendKeys("car accessories");
        login.Search_click().click();
    }

    @And("Select the First Item")
    public void Select_the_First_Item (){
      name_of_item = login.name_of_item().getText();
    }
    @And("Add Item to Cart")
    public void Add_Item_to_Cart() {
        login.Add_to_card().click();
    }
    @And("Verify Item in Cart")
    public void Verify_Item_to_Cart() {
       login.Add_to_card_icon().click();
       name_of_item_in_add_to_card = login.name_of_item_in_add_card().getText();
       Assert.assertEquals(name_of_item,name_of_item_in_add_to_card);
    }

}
