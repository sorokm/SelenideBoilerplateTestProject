package app.pages.habr;

import app.pages.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage extends BasePage {
    public SelenideElement searchField = $(By.xpath("//input[@placeholder='Search']"));
    public SelenideElement searchButtonField = $(By.xpath("//*[@class='tm-input-text-decorated__label tm-input-text-decorated__label_after']"));
    public SelenideElement saveBookmarkButton = $(By.xpath("//*[@class='tm-svg-icon__wrapper bookmarks-button__icon']"));
    public SelenideElement removeBookmarkButton = $(By.xpath("//*[@title='Remove from bookmarks']"));

    public SearchPage() {
        super();
    }

    public void searchArticle(String articleName) {
        searchField.sendKeys(articleName);
        searchButtonField.click();
    }

    public void saveBookmark() {
        saveBookmarkButton.click();
    }

    public void removeBookmark() {
        removeBookmarkButton.click();
    }
}