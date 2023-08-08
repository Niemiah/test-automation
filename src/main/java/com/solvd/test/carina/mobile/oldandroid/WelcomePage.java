package com.solvd.test.carina.mobile.oldandroid;

import com.solvd.test.carina.mobile.oldcommon.EmailPageBase;
import com.solvd.test.carina.mobile.oldcommon.WelcomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WelcomePageBase.class)
public class WelcomePage extends WelcomePageBase implements IMobileUtils {


    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "swoosh")
    private ExtendedWebElement title;

    @FindBy(id = "legacy_login_button")
    private ExtendedWebElement loginBtn;

    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

    @Override
    public EmailPageBase clickLoginBtn() {
        loginBtn.click();
        return initPage(getDriver(), EmailPageBase.class);
    }
}