package test.authomatizationServise;

import static com.codeborne.selenide.Selenide.open;

public class AuthomatizationServise {
    public String baseUrl = "https://sushi-karate.ru/nn";
    public void openBaseUrl(){
        open(baseUrl);
    }
}