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
   void name() {

      open("https://github.com/");
      $(".HeaderMenu-item:nth-child(2) > .HeaderMenu-link").hover();
      $(byText("Enterprise")).click();
      $(".gutter-spacious:nth-child(2) > .col-9-max").shouldHave(text("Build like the best."));


   }
}
