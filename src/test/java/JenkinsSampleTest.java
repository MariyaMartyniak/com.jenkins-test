import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;

class JenkinsSampleTest {

    @Test
    void verifyBasicJenkinsTest() {
        Selenide.open("https://www.google.com/");
        $x("//title[text()='Google']").shouldBe(Condition.visible);
    }
}
