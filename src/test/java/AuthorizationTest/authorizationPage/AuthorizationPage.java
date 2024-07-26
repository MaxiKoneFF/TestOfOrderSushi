package AuthorizationTest.authorizationPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class AuthorizationPage {
    private final By City_Selector = By.xpath("//*[contains(text(), 'Нижний Новгород')]");
    private final By TelephoneNomber = By.xpath("//input[@name = 'login']");
    private final By Password = By.xpath("//input[@name = 'password']");
    private final By Enter_Button = By.xpath("//button[contains(text(),'Войти')]");
    private final By Order_Button = By.xpath("//*[@class = 'tabs2-nav-item current']");

    public SelenideElement city() {
        return element(City_Selector);
    }
    public void selectCiti() {
        city().click();
    }
    public SelenideElement telefoneNumberLine() {
        return element(TelephoneNomber);
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
        return element(Password);
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
        return element(Enter_Button);
    }
    public void getEnterButton() {
        enterButton().click();
    }
    public SelenideElement ordersButton() {
        return element(Order_Button);
    }
    public void getOrderButton() {
        ordersButton().click();
    }
}