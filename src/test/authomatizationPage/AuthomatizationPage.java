package test.authomatizationPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class AuthomatizationPage {
    private final By Menu_Button = By.xpath("button[contains(text(), 'Меню')]");
    private final By Set_Button = By.xpath("button[contains(text(), 'Сеты')]");
    private final By Choose_Set = By.xpath("button[contains(text(), 'Сет Ажиотаж)]");
    private final By Order_Button = By.xpath("button[contains(text(), 'Заказать')]");

    public SelenideElement getMenu_Button(){
        return element (Menu_Button);
    }
    public SelenideElement getSet_Button() {
        return element (Set_Button);
    }
    public SelenideElement getChoose_Set(){
        return element (Choose_Set);
    }
    public SelenideElement getOrder_Button(){
        return element (Order_Button);
    }
}