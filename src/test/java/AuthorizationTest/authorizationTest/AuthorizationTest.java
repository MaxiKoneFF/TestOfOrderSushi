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

        aithorizationServise.openBaseUrl();
        authorizationPage.telefoneNumberLine(telephoneNomber);
        authorizationPage.passwordLine(password);
        authorizationPage.getEnterButton();
        authorizationPage.getOrdersButton();
    }
}