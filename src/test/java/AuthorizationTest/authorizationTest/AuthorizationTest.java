package AuthorizationTest.authorizationTest;

import AuthorizationTest.authorizationPage.AuthorizationPage;
import AuthorizationTest.authorizationService.AuthorizationService;
import org.testng.annotations.Test;

public class AuthorizationTest {
    private final AuthorizationService aithorizationServise = new AuthorizationService();
    private final AuthorizationPage authorizationPage = new AuthorizationPage();

    @Test
    public void forAuthorizationTest() {
        String telephoneNomber = "9867483424";
        String password = "94949697";

        aithorizationServise.oprnLoginUrl();
        authorizationPage.selectCiti();
        authorizationPage.enterTelephoneNomber(telephoneNomber);
        authorizationPage.enterPassword(password);
        authorizationPage.getEnterButton();
        authorizationPage.getOrderButton();
    }
}