package AuthomatizationTest.authomatizationPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class AuthomatizationPage {
    private final By MENU_BUTTON = By.xpath("//a[contains(text(), 'Меню')]");
    private final By SET_BUTTON = By.xpath("//*[contains(text(), 'Сеты')]");
    private final By CHOOSE_SET = By.xpath("//a[contains(text(), 'сет Ажиотаж')]");
    private final By ORDER_BUTTON = By.xpath("//button[contains(text(), 'Заказать')]");

    public SelenideElement menuButton(){
        return element (MENU_BUTTON);
    }
    public void getMenuButton(){
        menuButton().click();
    }
    public SelenideElement setButton() {
        return element (SET_BUTTON);
    }
    public void getSetButton() {
        setButton().click();
    }
    public SelenideElement chooseSet(){
        return element (CHOOSE_SET);
    }
    public void getChoose_Set(){
        chooseSet().click();
    }
    public SelenideElement orderButton(){
        return element (ORDER_BUTTON);
    }
    public void getOrderButton(){
        orderButton().click();
    }
}