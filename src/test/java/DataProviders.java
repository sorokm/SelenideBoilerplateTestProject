import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "authData")
    public Object[][] getAuthData() {
        return new Object[][]{
                {"testusermarina@mail.ru", "TestPassword2023", "Marina Gibbs", "@testusermarina"}
        };
    }

    @DataProvider(name = "userProfileSettings")
    public Object[][] getUserProfileSettings() {
        return new Object[][]{
                {"testusermarina@mail.ru", "TestPassword2023", "Ann Wise", "Java developer", "0", "10", "2", "2000",
                        "Settings were updated successfully", "February 10 2000", "Marina Gibbs", "QA", "2", "1", "1", "1996"}
        };
    }

    @DataProvider(name="article")
    public Object[][] getArticleName() {
        return new Object[][] {
                {"testusermarina@mail.ru", "TestPassword2023",
                        "How to Customize UI Artefacts for Selenide + Selenoid + Allure (with TestOPS)"}
        };
    }

}
