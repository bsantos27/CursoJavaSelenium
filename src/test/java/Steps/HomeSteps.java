package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static Runners.RunnerBase.getDriver;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @And("estou na tela inicial")
    public void estouNatelaInicial() {
       homePage.ClicarSimple();
    }

    @When("seleciono a blusa noir jacket")
    public void selecionoABlusaNoirJacket() {
        homePage.ClicarJacket();
    }

    @And("clico no botao do menu checkout")
    public void clicoNoBotaoDoMenuCheckout() throws InterruptedException {
        Thread.sleep(2000);
        getDriver().navigate().to("https://sauce-demo.myshopify.com/cart");
//        homePage.ClicarCheckout();
    }
}
