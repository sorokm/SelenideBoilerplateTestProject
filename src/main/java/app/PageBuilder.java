package app;

import app.pages.habr.*;

public class PageBuilder {

    public static MainPage buildLoginPage() {
        return new MainPage();
    }
    public static BookmarksPage buildBookmarksPage() {
        return new BookmarksPage();
    }
    public static SettingsPage buildSettingsPage() {
        return new SettingsPage();
    }
    public static SearchPage buildSearchPage() {
        return new SearchPage();
    }
    public static ProfilePage buildProfilePage() {
        return new ProfilePage();
    }
}
