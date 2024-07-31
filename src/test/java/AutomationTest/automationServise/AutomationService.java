package AutomationTest.automationServise;

import static com.codeborne.selenide.Selenide.open;

public class AutomationService {
    public String baseUrl = "https://sushi-karate.ru/nn";

    public void openBaseUrl() {
        open(baseUrl);
    }
}