package AuthorizationTest.authorizationService;

import static com.codeborne.selenide.Selenide.open;

public class AuthorizationService {
    public String loginUrl = "https://sushi-karate.ru/login";
    public void oprnLoginUrl() {
        open(loginUrl);
    }
}