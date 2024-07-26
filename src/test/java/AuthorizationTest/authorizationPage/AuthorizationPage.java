package AuthorizationTest.authorizationPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class AuthorizationPage {
    private final By CITY_SELECTOR = By.xpath("//*[contains(text(), 'Нижний Новгород')]");
    private final By TELEPHONE_NOMB = By.xpath("//input[@name = 'login']");
    private final By PASSWORD = By.xpath("//input[@name = 'password']");
    private final By ENTER_BUTTON = By.xpath("//button[contains(text(),'Войти')]");
    private final By ORDER_BUTTON = By.xpath("//*[@class = 'tabs2-nav-item current']");

    public SelenideElement city() {
        return element(CITY_SELECTOR);
    }
    public void selectCiti() {
        city().click();
    }
    public SelenideElement telefoneNumberLine() {return element(TELEPHONE_NOMB);
    }
    public void enterTelephoneNomber(String telephoneNomber) {
        telefoneNumberLine().setValue(telephoneNomber);

        if (telephoneNomber.isEmpty()) {
            System.out.println("Поле не заполнено!");
        } else {
            System.out.println("Поле успешно заполнено");
        }
    }
    public SelenideElement passwordLine() {
        return element(PASSWORD);
    }
    public void enterPassword(String password) {
        passwordLine().setValue(password);
        if (password.isEmpty()) {
            System.out.println("Поле не заполнено!");
        } else {
            System.out.println("Поле успешно заполнено");
        }
    }
    public SelenideElement enterButton() {
        return element(ENTER_BUTTON);
    }
    public void getEnterButton() {
        enterButton().click();
    }
    public SelenideElement ordersButton() {
        return element(ORDER_BUTTON);
    }
    public void getOrderButton() {
        ordersButton().click();
    }
}