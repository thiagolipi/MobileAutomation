package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@DisplayName("Getting the last Mega Sena's date and contest number at UOL's website")
public class LastMegaSenaSeeker {

    private WebDriver app;

    @BeforeEach
    public void beforeEach() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appium:deviceName", "Samsung Galaxy S10");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:udid", "192.168.228.102:5555");
        capabilities.setCapability("appPackage", "org.chromium.webview_shell");
        capabilities.setCapability("appActivity", "org.chromium.webview_shell.WebViewBrowserActivity");

        app = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        app.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        app.get("http://www.uol.com.br");
        app.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Image")).click();
    }

        @DisplayName("Getting last Mega Sena's date and contest number")
        @Test
        public void gettingMegaSenasLastDateAndContestNumber() {
            String date = new LoginPage(app)
                .informUser("")
                .informPassword("")
                .submitLogin()
                .openMenu()
                .navigateToMegaSena()
                .getDate();

            System.out.println(date);
        }

    @AfterEach
    public void afterEach() {
        app.quit();
    }

}
