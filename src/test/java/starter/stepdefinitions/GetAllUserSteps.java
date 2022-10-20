package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetAllUsers;


public class GetAllUserSteps {
    @Steps
    GetAllUsers getAllUsers;

    @Given("I set GET endpoints")
    public void setGetApiEndpoint(){
        getAllUsers.setApiEndpointAllUser();
    }
    @When("I send GET HTTP request")
    public void sendGetHttpRequest(){
        getAllUsers.sendGetHttpRequestAllUser();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode(){
        getAllUsers.validateHttpResponseCode200AllUser();
    }
    @And("I receive valid data for detail user")
    public void receiveValidDataForDetailUser(){
        getAllUsers.validateDataDetailAllUser();
    }
}
