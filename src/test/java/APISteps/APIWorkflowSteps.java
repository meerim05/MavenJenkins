package APISteps;

import io.cucumber.java.en.*;
import io.restassured.specification.RequestSpecification;
import org.junit.runner.Request;
import utils.apiConstants;

import static io.restassured.RestAssured.given;

public class APIWorkflowSteps {
    RequestSpecification request;

    @Given("a request is prepared to create an employee")
    public void a_request_is_prepared_to_create_an_employee() {
       request = given().header(apiConstants.Header_Content_type,apiConstants.Content_type)
                .header(apiConstants.Header_Authorization,GenerateTokenSteps.token);

    }

    @When("a POST call is made to create an employee")
    public void a_post_call_is_made_to_create_an_employee() {


    }

    @Then("the status code for creating an employee is {int}")
    public void the_status_code_for_creating_an_employee_is(Integer int1) {

    }

    @Then("the employee created contains key {string} and value {string}")
    public void the_employee_created_contains_key_and_value(String string, String string2) {

    }

    @Then("the employeeID {string} is stored as a global variable to be used for other calls")
    public void the_employee_id_is_stored_as_a_global_variable_to_be_used_for_other_calls(String string) {

    }


}
