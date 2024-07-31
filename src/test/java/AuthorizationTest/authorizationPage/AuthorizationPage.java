package AuthorizationTest.authorizationPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPage {
    private final By CITY_SELECTOR = By.xpath("//*[contains(text(), 'Нижний Новгород')]");
    private final By TELEPHONE_NUMBER = By.xpath("//input[@name = 'login']");
    private final By PASSWORD = By.xpath("//input[@name = 'password']");
    private final By ENTER_BUTTON = By.xpath("//button[contains(text(),'Войти')]");
    private final By ORDER_BUTTON = By.xpath("//*[@class = 'tabs2-nav-item current']");

    public SelenideElement city() {
        return element(CITY_SELECTOR);
    }

    public void selectCiti() {
        city().click();
    }

    public SelenideElement telephoneNumberLine() {
        return element(TELEPHONE_NUMBER);
    }

    public void enterTelephoneNumber(String telephoneNumber) {
        telephoneNumberLine().setValue(telephoneNumber);

        if (telephoneNumber.isEmpty()) {
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
        SelenideElement element = element(ENTER_BUTTON);
        actions().scrollByAmount(0, 300).perform();
        return element;
    }

    public void getEnterButton() {
        enterButton().click();
    }

    public SelenideElement ordersButton() {
        SelenideElement element = element(ORDER_BUTTON);
        actions().scrollByAmount(0, 200).perform();
        return element;
    }

    public void getOrderButton() {
        ordersButton().click();
        try {
            sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}