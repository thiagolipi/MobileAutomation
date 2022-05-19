package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MegaSenaPage {

    private WebDriver app;

    public MegaSenaPage(WebDriver web) {
        this.app = web;
    }

    public String getDate() {
       return app.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[1]")).getText();
    }

}