package be.artusvranken.counter.domain;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * the CounterStepDefinitions class defines the code that needs to be executed for each step in the feature files.
 */
public class CounterStepDefinitions {

    private Counter testCounter;

    @Given("^a new Counter$")
    public void InitializeNewCounter() {
        this.testCounter = new Counter();
    }

    @Given("^a new Counter with value (\\d+)$")
    public void InitializeNewCounterWithSuppliedAmount(int amount) {
        this.testCounter = new Counter(amount);
    }


    @When("^we increase the Counter without supplying an amount$")
    public void IncreaseCounter()
    {
        this.testCounter.increase();
    }

    @When("^we increase the Counter with supplied amount (\\d+)$")
    public void IncreaseCounterWithSuppliedAmount(int amount)
    {
        this.testCounter.increase(amount);
    }

    @When("^we decrease the Counter without supplying an amount$")
    public void DecreaseCounter()
    {
        this.testCounter.decrease();
    }

    @When("^we decrease the Counter with supplied amount (\\d+)$")
    public void DecreaseCounterWithSuppliedAmount(int amount)
    {
        this.testCounter.decrease(amount);
    }

    @Then("^the Counter value equals (\\d+)$")
    public void CheckCounterAmount(int amount)
    {
        Assert.assertEquals(amount, this.testCounter.getCount());
    }

    @Then("^the Counter value equals -(\\d+)$")
    public void CheckCounterNegativeAmount(int amount)
    {
        amount = amount * -1;
        Assert.assertEquals(amount, this.testCounter.getCount());
    }
}
