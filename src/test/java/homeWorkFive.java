import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class homeWorkFive {

   @BeforeAll
   static void beforeAll() {
      Configuration.browserSize = "1440x812";
   }

   @Test
   void solutions() {

      open("https://github.com/");
      $(".HeaderMenu-item:nth-child(2) > .HeaderMenu-link").hover();
      $(byText("Enterprise")).click();
      $(".application-main .h1-mktg").shouldHave(text("Build like the best"));


   }
}
