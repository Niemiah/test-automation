package com.solvd.test.carina.mobile.android;

import com.solvd.test.carina.mobile.common.HomePageBase;
import com.solvd.test.carina.mobile.common.PasswordPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PasswordPageBase.class)
public class PasswordPage extends PasswordPageBase implements IMobileUtils {

    public PasswordPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.Button[@text='Sign In']")
    private ExtendedWebElement loginBtn;

    @Override
    public HomePageBase clickLoginBtn() {
        loginBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }

}