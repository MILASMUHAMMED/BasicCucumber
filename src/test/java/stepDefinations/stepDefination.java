package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^Chrome browser is installed$")
    public void chrome_browser_is_installed() throws Throwable {
    	System.out.println("Chrome browser is installed");
    }

    @When("^User launches the chrome browser$")
    public void user_launches_the_chrome_browser() throws Throwable {
    	System.out.println("Chrome browser is launched");
    }

    @Then("^verify the chrome browser in opened$")
    public void verify_the_chrome_browser_in_opened() throws Throwable {
    	System.out.println("Chrome browser in opened");
    }
    
    @Given("^User is on Home Page$")
    public void user_is_on_home_page() throws Throwable {
    	System.out.println("User is on Home Page");
    }

    @When("^User login into the application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_the_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("User login into the application with username and password");
    }

    @Then("^User navigated to Dashboard page$")
    public void user_navigated_to_dashboard_page() throws Throwable {
    	System.out.println("User navigated to Dashboard page");
    }

    @And("^Returns displayed are \"([^\"]*)\"$")
    public void returns_displayed_are_something(String strArg1) throws Throwable {
    	System.out.println("Returns displayed are true or false");
    }
    
    @Given("^User is on SignUp Page$")
    public void user_is_on_signup_page() throws Throwable {
    	System.out.println("User is on SignUp Page");
    }
    
    @Then("^SignUp landing page is filled$")
    public void signup_landing_page_is_filled() throws Throwable {
    	System.out.println("SignUp landing page is filled");
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
       List<List<String>>  obj=data.asLists();
      System.out.println(obj.get(0).get(0));
      System.out.println(obj.get(0).get(1));
      System.out.println(obj.get(0).get(2));
      System.out.println(obj.get(0).get(3));
      System.out.println(obj.get(0).get(4)); 	
    }
    
    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
       System.out.println(username);
       System.out.println(password);
       
    }
}