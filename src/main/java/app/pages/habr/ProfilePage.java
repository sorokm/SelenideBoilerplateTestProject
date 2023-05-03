package app.pages.habr;

import app.pages.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage extends BasePage {

    public SelenideElement nameUserProfile = $(By.xpath("//*[@class='tm-user-card__name tm-user-card__name']"));
    public SelenideElement descriptionProfile = $(By.xpath("//*[@class='tm-user-card__short-info tm-user-card__short-info']"));
    public SelenideElement dateOfBirthProfile = $(By.xpath("//*[@class='tm-description-list tm-description-list tm-description-list_variant-columns'][2]/dd"));

    public ProfilePage() {
        super();
    }

    public String getNameUserProfileActual() {
        return nameUserProfile.getText();
    }

    public String getDescriptionProfileActual() {
        return descriptionProfile.getText();
    }

    public String getDateOfBirthProfileActual() {
        return dateOfBirthProfile.getText();
    }
}
