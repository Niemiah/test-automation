package com.solvd.test.carina.mobile.android;

import com.solvd.test.carina.mobile.common.SignInPageBase;
import com.solvd.test.carina.mobile.common.WelcomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WelcomePageBase.class)
public class WelcomePage extends WelcomePageBase implements IMobileUtils {


    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.nike.omega:id/swoosh")
    private ExtendedWebElement title;

    @FindBy(id = "com.nike.omega:id/legacy_login_button")
    private ExtendedWebElement signInBtn;

    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

    @Override
    public SignInPageBase clickSignInBtn() {
        signInBtn.click();
        return initPage(getDriver(), SignInPageBase.class);
    }
}