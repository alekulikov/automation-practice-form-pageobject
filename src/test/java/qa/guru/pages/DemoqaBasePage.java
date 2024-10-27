package qa.guru.pages;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class DemoqaBasePage {

    protected void removeBanners() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
    }
}
