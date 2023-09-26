import com.codeborne.selenide.Condition;
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
    public void setUp() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @Test
    void verifyBasicJenkinsTest() {
        Selenide.open("https://www.google.com/");
        $x("//title[text()='Google']").shouldBe(Condition.visible);
    }

    @AfterAll
    public void tearDown() {
        SelenideLogger.removeListener("allure");
    }
}
