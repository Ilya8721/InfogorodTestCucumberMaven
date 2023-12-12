package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.*;

@Name(value = "Главная")
public class MainPage extends WebPage {

    @Name("Заголовок основной страницы")
    private final SelenideElement title = $x("//h1[contains(text(), 'ЭКОЛОГИЧЕСКАЯ СИТУАЦИЯ')]");
    @Name("Кнопка перехода на 2й вопрос")
    private final SelenideElement button1 = $x("//table//div[contains(text(), 'Вопрос 1/5')]/following-sibling::div/button");
    @Name("Заголовок 2го вопроса")
    private final SelenideElement questionTitle2 = $x("//table//div[contains(text(), 'Вопрос 2/5')]");
    @Name("Кнопка перехода на 3й вопрос")
    private final SelenideElement button2 = $x("//table//div[contains(text(), 'Вопрос 2/5')]/following-sibling::div/button");
    @Name("Заголовок 3го вопроса")
    private final SelenideElement questionTitle3 = $x("//table//div[contains(text(), 'Вопрос 3/5')]");
    @Name("Кнопка перехода на 4й вопрос")
    private final SelenideElement button3 = $x("//table//div[contains(text(), 'Вопрос 3/5')]/following-sibling::div/button");
    @Name("Заголовок 4го вопроса")
    private final SelenideElement questionTitle4 = $x("//table//div[contains(text(), 'Вопрос 4/5')]");
    @Name("Кнопка перехода на 5й вопрос")
    private final SelenideElement button4 = $x("//table//div[contains(text(), 'Вопрос 4/5')]/following-sibling::div/button");
    @Name("Заголовок 5го вопроса")
    private final SelenideElement questionTitle5 = $x("//table//div[contains(text(), 'Вопрос 5/5')]");

    @Name("Адрес")
    private final SelenideElement addressField = $x("//table//div[contains(text(), 'Вопрос 1/5')]/following-sibling::div//input");
    @Name("Календарь")
    private final SelenideElement dateField = $x("//table//div[contains(text(), 'Вопрос 3/5')]/following-sibling::div//input[@id='report-date']");
    @Name("Временной отрезок")
    private final SelenideElement timeIntervalsField = $("div.multi-selector-input");

    @Name("Первый адрес")
    private final SelenideElement addressFromTheList1 = $("li.ui-menu-item:first-child");

    @Name("Первый чек-бокс запаха")
    private final SelenideElement smellCheckBoxes = $x("//table//div[contains(text(), 'Вопрос 2/5')]/following-sibling::div//table//span[@class='checkmark']");
    @Name("Первый доступный день")
    private final SelenideElement datesCollection = $x("//table[@class='ui-datepicker-calendar']//td[@data-handler='selectDay']");
    @Name("Первый временной интервал")
    private final SelenideElement timeIntervalsCollection = $x("//div[@class='multi-selector-input']/following-sibling::div//span[@class='checkmark']");
    @Name("Первый чек-бокс периодичность появления запахов")
    private final SelenideElement frequencyOfSmellsCheckBoxes = $x("//table//div[contains(text(), 'Вопрос 4/5')]/following-sibling::div//span[@class='checkmark']");
}

