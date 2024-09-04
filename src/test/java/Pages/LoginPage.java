package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.*;

public class LoginPage extends RunCucumberTest {

    @FindBy(id = "customer_email")
    private WebElement txtEmail;

    @FindBy(id = "customer_password")
    private WebElement txtPass;

    @FindBy(xpath = "//*[@id='customer_login']/div[5]/input")
    private WebElement btnLogin;

    public LoginPage(){
        PageFactory.initElements(getDriver(), this);
    }
    public void digitarEmail() {
        digitar(txtEmail, "cursouniversidadeqa@gmail.com");
    }

    public void digitarSenha() {
        digitar(txtPass, System.getenv("senha"));
    }

    public void clicarBotao() {
        clicar(btnLogin);
    }

}
