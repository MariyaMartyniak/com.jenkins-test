import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.$x;

class JenkinsSampleTest {

    @BeforeAll
    static void beforeAllClass() {
        SelenideLogger.addListener("Allure Selenide Listener", new AllureSelenide().savePageSource(true).screenshots(true));
    }

    @Test
    void verifyBasicJenkinsTest() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void tearDown() {
        SelenideLogger.removeListener("allure");
    }
}
