import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Test
    @DisplayName("Открытие страницы SoftAssertions, проверка наличия примера кода для JUnit5")
    void checkSoftAssertionsContentExampleCodeJUnit5(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();
        $$(".details-reset").findBy(visible).shouldBe(text("SoftAssertions")).click();
        $(".Layout-main").$(byText("3. Using JUnit5 extend test class:")).shouldBe(text("3. Using JUnit5 extend test class:"));
    }
}