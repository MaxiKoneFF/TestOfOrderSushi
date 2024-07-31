package AutomationTest.automationPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class AutomationPage {
    private final By MENU_BUTTON = By.xpath("//a[contains(text(), 'Меню')]");
    private final By SET_BUTTON = By.xpath("//*[contains(text(), 'Сеты')]");
    private final By CHOOSE_SET = By.xpath("//a[contains(text(), 'сет Ажиотаж')]");
    private final By ORDER_BUTTON = By.xpath("//button[contains(text(), 'Заказать')]");
    private final By BASKET_BUTTON = By.xpath("//*[@class = 'order-nav']");
    private final By DELETE_ORDER_BUTTON = By.xpath("//*[@class = 'delete delete-vue']");

    public SelenideElement menuButton(){
        return element (MENU_BUTTON);
    }
    public void pressMenuButton(){
        menuButton().click();
    }
    public SelenideElement setButton() {
        return element (SET_BUTTON);
    }
    public void pressSetButton() {
        setButton().click();
    }
    public SelenideElement chooseSet(){
        SelenideElement element = element(CHOOSE_SET);
        actions().scrollByAmount(0,500).perform();
        return element;
    }
    public void pressChooseSet(){
        chooseSet().click();
    }
    public SelenideElement orderButton(){
        SelenideElement element = element(ORDER_BUTTON);
        actions().scrollByAmount(0,500).perform();
        return element;
    }
    public void pressOrderButton(){
        orderButton().click();
    }
    public SelenideElement enterBasketButton(){
        return element (BASKET_BUTTON);
    }
    public void enterBasket() {
        enterBasketButton().click();
        try {
            sleep(3000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public SelenideElement enterDeleteOrder() {
        return element(DELETE_ORDER_BUTTON);
    }
    public void pressDeleteButton(){
        enterDeleteOrder().click();
        try {
            sleep(3000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}