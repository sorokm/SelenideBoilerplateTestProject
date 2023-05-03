package app.pages.habr;

import app.pages.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BookmarksPage extends BasePage {

    public SelenideElement bookmarkSection = $(By.xpath("//*[@class='tm-tabs__tab-item'][3]"));
    public SelenideElement nameArticle = $(By.xpath("//*[@class='tm-title__link']"));

    public BookmarksPage() {
        super();
    }

    public void openBookmarks() {
        bookmarkSection.click();
    }

    public String getArticleNameFromBookmarksActual() {
        return nameArticle.getText();
    }
}
