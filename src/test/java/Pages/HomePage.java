package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;


public class HomePage extends RunCucumberTest {

    @FindBy(css = "#logo > a")
    private WebElement clicarSimple;

    @FindBy(css = "#product-2 > img")
    private WebElement clicarJacket;

    @FindBy(css = "#minicart > a.checkout")
    private WebElement clicarCheckout;

    public HomePage(){
        PageFactory.initElements(getDriver(),this);
    }
    public void ClicarSimple() {
        clicar(clicarSimple);
    }

    public void ClicarJacket(){ clicar(clicarJacket);}

    public void ClicarCheckout(){ clicar(clicarCheckout);}

}
