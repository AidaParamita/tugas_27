package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllUsers {
    protected static String url = "https://reqres.in/api/";

    @Step("I set GET endpoints")
    public String setApiEndpointAllUser(){

        return url + "users";
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequestAllUser(){
        SerenityRest.given()
                .when()
                .get(setApiEndpointAllUser());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200AllUser(){

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail user")
    public void validateDataDetailAllUser(){
        restAssuredThat(response -> response.body("'data'.'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'data'.'first_name'", equalTo("George")));
    }
}
