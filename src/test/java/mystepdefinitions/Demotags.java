package mystepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Demotags {

@Given("application is running")
public void application_is_running() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("application is running");
}

@Then("user is able to login")
public void user_is_able_to_login() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("user is able to login");
	
}

@Given("User is searching the product with code")
public void user_is_searching_the_product_with_code() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("User is searching the product with code");
}

@Then("user able to add it to cart")
public void user_able_to_add_it_to_cart() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("user able to add it to cart");
}

@Given("User able to see the items count on cart")
public void user_able_to_see_the_items_count_on_cart() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("user able to see items count on cart");
	
}

@Then("user decides to remove an item")
public void user_decides_to_remove_an_item() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("user decides to remove an item");
}

@Given("user has active order")
public void user_has_active_order() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("user has active order");
	
}

@Then("user verifies the status of the order")
public void user_verifies_the_status_of_the_order() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("user has active order");
}

}
