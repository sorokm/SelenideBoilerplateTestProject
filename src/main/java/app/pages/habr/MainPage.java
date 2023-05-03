package app.pages.habr;

import app.pages.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BasePage {

    public SelenideElement emailField = $(By.xpath("//*[@id='email_field']"));
    public SelenideElement passwordField = $(By.xpath("//*[@id='password_field']"));
    public SelenideElement signInButton = $(By.xpath("//*[@class='button button_wide button_primary']"));
    public SelenideElement authButton = $(By.xpath("//*[@class='tm-user-menu__auth-button']"));
    public SelenideElement userMenuButton = $(By.xpath("//*[@class='tm-dropdown']"));
    public SelenideElement usernameLink = $(By.xpath("//*[contains(@class, 'tm-user-item__username')]"));
    public SelenideElement nameUserMenu = $(By.xpath("//*[@class='tm-user-item__name']"));
    public SelenideElement userAuthorizedMenuButton = $(By.xpath("//*[contains(@data-test-id, 'menu-toggle-user')]"));
    public SelenideElement logoutButton = $(By.xpath("//*[contains(@href, 'logout')]"));
    public SelenideElement bookmarkButtonMenu = $(By.xpath("//*[contains(@href, 'bookmarks/publications/')]"));
    public SelenideElement searchButton = $(By.xpath("//*[@class='tm-header-user-menu__item tm-header-user-menu__search']"));
    public SelenideElement settingsButton = $(By.xpath("//span[contains(text(), 'Profile settings')]"));

    public MainPage() {
        super();
    }

    public void login(String email, String password) {
        userMenuButton.click();
        authButton.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        signInButton.click();
    }

    public String getUserAuthorizedName() {
        return usernameLink.getText();
    }

    public void clickUserAuthorizedMenuButton() {
        userAuthorizedMenuButton.click();
    }

    public void clickUserMenuButton() {
        userMenuButton.click();
    }

    public void logout() {
        logoutButton.click();
    }

    public void clickSettingsButton() {
        settingsButton.click();
    }


    public void clickUsernameLink() {
        usernameLink.click();
    }

    public String getNameUserActual() {
        return nameUserMenu.getText();
    }

    public void openBookmarks() {
        bookmarkButtonMenu.click();
    }

    public void openSearch() {
        searchButton.click();
    }

}
