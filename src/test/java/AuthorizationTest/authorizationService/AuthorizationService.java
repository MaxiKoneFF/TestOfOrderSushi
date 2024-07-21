package AuthorizationTest.authorizationService;

import AuthomatizationTest.authomatizationServise.AuthomatizationServise;

import static com.codeborne.selenide.Selenide.open;

public class AuthorizationService extends AuthomatizationServise {
    public void openBaseUrl() {
        open(baseUrl + "/login");
    }
}