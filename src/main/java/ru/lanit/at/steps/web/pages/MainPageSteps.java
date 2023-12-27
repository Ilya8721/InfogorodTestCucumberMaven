package ru.lanit.at.steps.web.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import io.cucumber.java.ru.И;
import io.qameta.allure.Allure;
import ru.lanit.at.steps.web.AbstractWebSteps;
import ru.lanit.at.utils.selenide.DriverManager;
import ru.lanit.at.utils.web.pagecontext.PageManager;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class MainPageSteps extends AbstractWebSteps {
    public MainPageSteps(PageManager pageManager) {
        super(pageManager);
    }

    @И("открыть главную страницу по адресу {string}")
    public void openWebSite(String url) {
        DriverManager.startDriver();
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        open(url);
        sleep(1000);
    }

    @И("вывеси коллекцию запахов в Allure отчёт в обратном порядке")
    public List<String> getReversedValues() {
        ElementsCollection smellsCollection = $$x("//table//div[contains(text(), 'Вопрос 2/5')]/following-sibling::div//table//input[@type='radio']");

        List<String> reversedSmells = new ArrayList<>();

        smellsCollection.forEach(smellElement -> {
            String smell = smellElement.getAttribute("value");
            String reversedSmell = new StringBuilder(smell).reverse().toString();
            reversedSmells.add(reversedSmell);
        });

        Allure.addAttachment("Reversed Smells", String.join(", ", reversedSmells));

        return reversedSmells;
    }
}

