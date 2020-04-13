package Tests;

import Pages.RestrictedPage;
import Tests.AbstractBaseTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class RestrictedLocationTest extends TestBase {
    private RestrictedPage restrictedPage;

    @BeforeTest
    public void setUpPage() {
        restrictedPage = new RestrictedPage(driver);
    }


    //@Test
    public void checkRestrictedLocation() {
        restrictedPage.waitUntiollRestrictedPageDisplayed();
        Assert.assertTrue(restrictedPage.isRestrictedPageDisplayed(), "Restricted Page is NOT displayed");
    }
}