import helpers.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HabrTests extends BaseTest {
    @Test(priority = 0, description = "Login and logout test",
            dataProvider = "authData", dataProviderClass = DataProviders.class)
    public void loginLogoutTest(String userEmail, String password, String name, String username) {
        app.mainPage.open();
        app.mainPage.login(userEmail, password);

        app.mainPage.clickUserAuthorizedMenuButton();
        Assert.assertEquals(app.mainPage.getNameUserActual(), name);
        Assert.assertEquals(app.mainPage.getUserAuthorizedName(), username);

        app.mainPage.logout();
        app.mainPage.clickUserMenuButton();
        Assert.assertTrue(app.mainPage.authButton.isDisplayed());
    }

    @Test(priority = 1, description = "Add article in bookmarks",
            dataProvider = "article", dataProviderClass = DataProviders.class)
    public void addArticleInFavorites(String userEmail, String password, String articleName) {
        app.mainPage.open();
        Driver.setImplicitWait(10);
        app.mainPage.login(userEmail, password);
        app.mainPage.openSearch();
        app.searchPage.searchArticle(articleName);
        app.searchPage.saveBookmark();
        Driver.refresh();

        app.mainPage.clickUserAuthorizedMenuButton();
        app.mainPage.openBookmarks();
        app.bookmarksPage.openBookmarks();

        Assert.assertEquals(app.bookmarksPage.getArticleNameFromBookmarksActual(), articleName);

        // Восстановление состояния по умолчанию
        app.searchPage.removeBookmark();

        app.mainPage.userAuthorizedMenuButton.click();
        app.mainPage.logout();
    }

    @Test(priority = 2, description = "Update user settings",
            dataProvider = "userProfileSettings", dataProviderClass = DataProviders.class)
    public void userSettings(String userEmail, String password, String name, String description, String gender,
                             String dayOfBirth, String monthOfBirth, String yearOfBirth, String expectedTextAlert,
                             String expectedDayOfBirth, String nameDefault, String descriptionDefault, String genderDefault,
                             String dayOfBirthDefault, String monthOfBirthDefault, String yearOfBirthDefault) {
        app.mainPage.open();
        Driver.setImplicitWait(10);
        app.mainPage.login(userEmail, password);

        app.mainPage.clickUserAuthorizedMenuButton();
        app.mainPage.clickSettingsButton();

        app.settingsPage.setProfileSettingsFields(name, description, gender, dayOfBirth, monthOfBirth, yearOfBirth);
        app.settingsPage.clickSubmitSettingButton();
        Driver.wait(1);
        String alertTextActual = app.settingsPage.getAlertActual();
        Assert.assertEquals(alertTextActual, expectedTextAlert);

        app.mainPage.clickUserAuthorizedMenuButton();
        Assert.assertEquals(app.mainPage.getNameUserActual(), name);

        app.mainPage.clickUsernameLink();
        Assert.assertEquals(app.profilePage.getNameUserProfileActual(), name);
        Assert.assertEquals(app.profilePage.getDescriptionProfileActual(), description);
        Assert.assertEquals(app.profilePage.getDateOfBirthProfileActual(), expectedDayOfBirth);

        // Восстановление состояния по умолчанию
        app.mainPage.clickUserAuthorizedMenuButton();
        app.mainPage.clickSettingsButton();
        app.settingsPage.setProfileSettingsFields(nameDefault, descriptionDefault, genderDefault, dayOfBirthDefault, monthOfBirthDefault, yearOfBirthDefault);
        app.settingsPage.clickSubmitSettingButton();
        app.mainPage.clickUserAuthorizedMenuButton();
        app.mainPage.logout();
    }

}
