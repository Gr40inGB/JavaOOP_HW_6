## Реализация принципов SOLID в проекте:
- _Принцип единственной ответственности (Single Responsibility Principle)_ Каждый класс занимается только чем-то одним. Постарался сделать так, что они оставались простыми и имели меньше связей. View например умеет только показывать и выбирать - за команды уже отвечает класс Menu. Да и для него есть отдельные команды.
- _Принцип открытости/закрытости_ реализован в модели - User закрытый класс - только геттеры и сеттеры (+ свой конструктор). И от него расширяются Student и Teacher. 
- _Принцип подстановки Б. Лисков_ по сути я постарался реализовать некую параметризацию начинаю с коренного объекта - UniversityEntry - все объекты в модели имеют ID - и могут его вывести одинаково
- _Принцип разделения интерфейсов_ Для каждого класса с обязательными для логики программы методами созданы интерфейсы (ServiceInterface, ControllerInterface, CommandInterface) - Так же реализовал некую глобальную ось коммуникации с помощью Axes 
- _Принцип инверсии зависимостей_ Постарался везде создавать интерфейсы и абстрактные классы реализующие их и конечно они не зависят от своих наследников, а как раз наоборот

 