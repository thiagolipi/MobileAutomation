package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver app;

    public HomePage(WebDriver web) {
        this.app = web;
    }

        public HomePage openMenu() {
            app.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.Button")).click();

            return this;
        }

        public MegaSenaPage navigateToMegaSena() {
            app.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View[3]/android.widget.TextView")).click();
            app.findElement(By.xpath("//android.view.View[@content-desc=\"Site Mega Sena\"]/android.widget.TextView[2]")).click();

            return new MegaSenaPage(app);
        }
}


