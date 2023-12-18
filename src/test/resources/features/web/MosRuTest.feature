#language:ru
@MosRuTest
Функционал: Опросник

  Сценарий: Опрос о качестве воздуха в Москве
    * открыть главную страницу по адресу "https://mosecom.mos.ru/"
    Тогда пользователь на странице "Главная"
    И на странице имеется элемент "Заголовок основной страницы"
    И на странице присутствует текст "ЭКОЛОГИЧЕСКАЯ СИТУАЦИЯ"
  
    * ввести в поле "Адрес" значение "Москва"
    * кликнуть на элемент "Первый адрес"
    * кликнуть на элемент "Кнопка перехода на 2й вопрос"
    Тогда на странице имеется элемент "Заголовок 2го вопроса"
    И на странице присутствует текст "Вопрос 2/5"

    * вывеси коллекцию запахов в Allure отчёт в обратном порядке
    * установить чекбокс на элементе "Первый чек-бокс запаха"
    * кликнуть на элемент "Кнопка перехода на 3й вопрос"
    Тогда на странице имеется элемент "Заголовок 3го вопроса"
    И на странице присутствует текст "Вопрос 3/5"

    * кликнуть на элемент "Календарь"
    * кликнуть на элемент "Первый доступный день"
    * кликнуть на элемент "Временной отрезок"
    * кликнуть на элемент "Первый временной интервал"
    * кликнуть на элемент "Кнопка перехода на 4й вопрос"
    Тогда на странице имеется элемент "Заголовок 4го вопроса"
    И на странице присутствует текст "Вопрос 4/5"

    * кликнуть на элемент "Первый чек-бокс периодичность появления запахов"
    * кликнуть на элемент "Кнопка перехода на 5й вопрос"
    Тогда на странице имеется элемент "Заголовок 5го вопроса"
    И на странице присутствует текст "Вопрос 5/5"