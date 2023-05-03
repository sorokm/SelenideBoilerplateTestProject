package app;

import app.pages.habr.*;

public class App {

    public MainPage mainPage;
    public BookmarksPage bookmarksPage;
    public ProfilePage profilePage;
    public SearchPage searchPage;
    public SettingsPage settingsPage;

    public App() {
        mainPage = PageBuilder.buildLoginPage();
        bookmarksPage = PageBuilder.buildBookmarksPage();
        profilePage = PageBuilder.buildProfilePage();
        searchPage = PageBuilder.buildSearchPage();
        settingsPage = PageBuilder.buildSettingsPage();
    }
}
