import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.awt.SystemColor.text;
import static org.openqa.selenium.By.cssSelector;

public class TestBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/text-box");

        $("#userName").setValue("Ivan Ivanov");
        $("#userEmail").setValue("ivan@ivanov.com");
        $("#currentAddress").setValue("Some address1");
        $("#permanentAddress").setValue("Another address 1");
        $("#submit").click();

        $("#output").shouldHave(text("Ivan Ivanov"), text("ivan@ivanov.com"),
                text("Some address1"), text("Another address 1"));
    }
}





