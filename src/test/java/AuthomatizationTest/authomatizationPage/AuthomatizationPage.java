package AuthomatizationTest.authomatizationPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class AuthomatizationPage {
    private final By Menu_Button = By.xpath("//a[contains(text(), 'Меню')]");
    private final By Set_Button = By.xpath("//*[contains(text(), 'Сеты')]");
    private final By Choose_Set = By.xpath("//a[contains(text(), 'сет Ажиотаж')]");
    private final By Order_Button = By.xpath("//button[contains(text(), 'Заказать')]");

    public SelenideElement menuButton(){
        return element (Menu_Button);
    }
    public void getMenuButton(){
        menuButton().click();
    }
    public SelenideElement setButton() {
        return element (Set_Button);
    }
    public void getSetButton() {
        setButton().click();
    }
    public SelenideElement chooseSet(){
        return element (Choose_Set);
    }
    public void getChoose_Set(){
        chooseSet().click();
    }
    public SelenideElement orderButton(){
        return element (Order_Button);
    }
    public void getOrderButton(){
        orderButton().click();
    }
}