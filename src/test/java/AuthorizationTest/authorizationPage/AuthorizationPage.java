package AuthorizationTest.authorizationPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class AuthorizationPage {
    private final By TelephoneNomber = By.xpath("//imput[@name = 'telephoneNomber']");
    private final By Password = By.xpath("//input{@mame = 'password']");
    private final By Enter_Button = By.xpath("button[contains(text(), 'Войти)]");
    private final By Orders_Button = By.xpath("button[contains(text(), 'Заказы')]");

    public SelenideElement telefoneNumberLine(String telephoneNomber) {
        return element(TelephoneNomber);
    }
    public SelenideElement passwordLine(String password) {
        return element(Password);
    }
    public SelenideElement getEnterButton() {
        return element(Enter_Button);
    }
    public SelenideElement getOrdersButton() {
        return element(Orders_Button);
    }
}