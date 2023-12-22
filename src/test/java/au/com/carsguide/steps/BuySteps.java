package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BuySteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on “buy+sell” tab")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverOnBuyAndSellLink();

    }

    @And("I click ‘Search Cars’ link")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnCarSearchLink();

    }

    @Then("I navigate to ‘new and used car search’ page")
    public void iNavigateToNewAndUsedCarSearchPage() {

    }

    @And("I select make “<make>”")
    public void iSelectMakeMake(String make) {
new NewAndUsedCarSearchPage().selectMake(make);
    }

    @And("I select model “<model>”")
    public void iSelectModelModel(String model) {
        new NewAndUsedCarSearchPage().selectModel(model);
    }

    @And("I select location “<location>”")
    public void iSelectLocationLocation(String location) {
        new NewAndUsedCarSearchPage().selectCarLocation(location);
    }

    @And("I select price “<price>”")
    public void iSelectPricePrice(String price) {
        new NewAndUsedCarSearchPage().selectCarPrice(price);
    }

    @And("I click on Find My Next Car tab")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCarTab();
    }

    @Then("I should see the make “<make>” in results")
    public void iShouldSeeTheMakeMakeInResults(String iMake) {
        Assert.assertTrue(new NewAndUsedCarSearchPage().getTextFromResults().contains(iMake));
    }

    @And("I click ‘Used’ link")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedCarLink();
    }

    @Then("I navigate to ‘Used Cars For Sale’ page")
    public void iNavigateToUsedCarsForSalePage() {
    }
}
