package Steps;

import Pages.CheckoutPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckoutSteps {

    private static final String TITLE_PEDIDO = "Noir jacket - L / Red";

    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("verificar se o titulo do pedido esta correto")
    public void verificarSeOTituloDoPedidoEstaCorreto() {
        Assert.assertEquals(checkoutPage.pegarTituloProduto(), TITLE_PEDIDO);
    }
}
