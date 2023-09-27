import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;

class JenkinsSampleTest {

    @BeforeAll
    static void beforeAllClass() {
        SelenideLogger.addListener("Allure Selenide Listener", new AllureSelenide().savePageSource(true).screenshots(true));
    }

    @Test
    void verifyBasicJenkinsTest() {
//        Configuration.headless = true;
//        Selenide.open("https://www.google.com/");
//        $x("//title[text()='Google']").shouldNotBe(Condition.visible);
    }

    @AfterAll
    static void tearDown() {
        SelenideLogger.removeListener("allure");
    }
}
