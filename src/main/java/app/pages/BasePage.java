package app.pages;

import app.AppConfig;
import com.codeborne.selenide.Selenide;
import helpers.Driver;

public abstract class BasePage {

    public BasePage() {
    }

    public void open() {
        String url = AppConfig.baseUrl;
        Selenide.open(url);
        Driver.maximize();
        Driver.setImplicitWait(10);
    }
}
