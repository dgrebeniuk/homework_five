import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWorkFive {

   @BeforeAll
   static void beforeAll() {
      Configuration.browserSize = "1440x812";
   }

   @Test
   void openEnterprisePage() {

      open("https://github.com/");
      $(".HeaderMenu-item:nth-child(2) > .HeaderMenu-link").hover();
      $(byText("Enterprise")).click();
      $(".application-main .h1-mktg").shouldHave(text("Build like the best"));


   }
}
