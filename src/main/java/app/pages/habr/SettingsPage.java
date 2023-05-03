package app.pages.habr;

import app.pages.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class SettingsPage extends BasePage {
    public SelenideElement actualNameField = $(By.xpath("//input[@name='fullname']"));
    public SelenideElement describeYourselfField = $(By.xpath("//*[@class='base-input__input tm-input__input base-input__input_speciality ']"));
    public SelenideElement genderDropDown = $(By.xpath("//select[@name='gender']"));
    public SelenideElement dayOfBirthDropdown = $(By.xpath("//select[@name='birthdayDay']"));
    public SelenideElement monthOfBirthDropdown = $(By.xpath("//select[@name='birthdayMonth']"));
    public SelenideElement yearOfBirthDropdown = $(By.xpath("//select[@name='birthdayYear']"));
    public SelenideElement yooMoneyField = $(By.xpath("//input[@name='paymentYandexMoney']"));
    public SelenideElement payPalMeField = $(By.xpath("//input[@name='paymentPayPalMe']"));
    public SelenideElement webMoneyField = $(By.xpath("//input[@name='paymentWebmoney']"));
    public SelenideElement submitSettingsButton = $(By.xpath("//*[@class='tm-form__submit base-button']"));
    public SelenideElement alert = $(By.xpath("//*[@role='alert']"));

    public SettingsPage() {
        super();
    }

    public void setProfileSettingsFields(String actualName, String description, String gender,
                                         String birthDay, String birthdayMonth, String birthdayYear) {
        actualNameField.sendKeys(Keys.CONTROL + "A");
        actualNameField.sendKeys(Keys.BACK_SPACE);
        describeYourselfField.sendKeys(Keys.CONTROL + "A");
        describeYourselfField.sendKeys(Keys.BACK_SPACE);

        actualNameField.sendKeys(actualName);
        describeYourselfField.sendKeys(description);
        genderDropDown.selectOptionByValue(gender);
        dayOfBirthDropdown.selectOptionByValue(birthDay);
        monthOfBirthDropdown.selectOptionByValue(birthdayMonth);
        yearOfBirthDropdown.selectOptionByValue(birthdayYear);
    }

    public void clickSubmitSettingButton() {
        submitSettingsButton.click();
    }

    public String getAlertActual() {
        return alert.getText();
    }
}
