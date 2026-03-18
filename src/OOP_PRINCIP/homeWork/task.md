## Задачи для практики

### Иерархия фигур

Создай абстрактный класс `Shape` и классы-наследники `Circle`, `Rectangle`, `Triangle`. Каждый должен реализовать методы `getArea()` и `getPerimeter()`.

### Интерфейс Comparable

Создай класс `Student` с полями `name` и `gpa`. Реализуй интерфейс `Comparable<Student>` для сортировки студентов по GPA.

### Система уведомлений

Создай интерфейс `Notifier` с методом `send(String message)`. Реализуй три класса: `EmailNotifier`, `SmsNotifier`, `PushNotifier`. Напиши метод, который принимает список `Notifier` и отправляет одно сообщение через все каналы.

### Иерархия транспорта

Абстрактный класс `Vehicle` с методами `start()`, `stop()`, `getSpeed()`. Подклассы: `Car`, `Bicycle`, `Boat`. Каждый вид транспорта запускается и останавливается по-своему.

### Интерфейс Payable

Интерфейс `Payable` с методом `getPaymentAmount()`. Реализуй его в двух классах: `Employee` (возвращает зарплату) и `Invoice` (возвращает сумму счёта).

### Зоопарк

Построй иерархию животных с интерфейсами возможностей: `Swimmable`, `Flyable`, `Walkable`. Утка умеет летать, плавать и ходить. Рыба только плавает. Пингвин ходит и плавает, но не летает.

### Калькулятор с операциями

Интерфейс `Operation` с методом `double calculate(double a, double b)`. Реализации: `Add`, `Subtract`, `Multiply`, `Divide`. Класс `Calculator`, который принимает `Operation` и два числа, а затем возвращает результат.

### Система плагинов

Интерфейс `Plugin` с методами `getName()`, `getVersion()`, `execute()`. Класс `PluginManager`, который умеет регистрировать плагины, выводить список установленных и запускать их все. Реализуй несколько плагинов: например, `LoggerPlugin`, `BackupPlugin`, `AnalyticsPlugin`.

### is-a vs has-a

Проанализируй следующие пары и определи, какое отношение между ними — "является" (is-a, наследование) или "имеет" (has-a, композиция):

- Car и Vehicle
- Car и Engine
- Manager и Employee
- Employee и Salary
- Circle и Shape
- Circle и Color
- Duck и Animal
- Duck и Wing
- Browser и Tab
- Laptop и Keyboard

Для каждой пары, где отношение has-a, напиши класс с правильной композицией.

### Система скидок

Интерфейс `Discount` с методами `apply(double price)` и `getDescription()`. Реализуй `PercentageDiscount` (процентная скидка), `FixedDiscount` (фиксированная сумма) и `CompositeDiscount` (объединяет несколько скидок и применяет их последовательно).

### Прочитай код: нарушение LSP

Посмотри на этот код и подумай — что пойдёт не так?

```java
class Rectangle {
    protected int width;
    protected int height;

    void setWidth(int width) { this.width = width; }
    void setHeight(int height) { this.height = height; }

    int getArea() { return width * height; }
}

class Square extends Rectangle {
    @Override
    void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}

void test(Rectangle rect) {
    rect.setWidth(5);
    rect.setHeight(4);
    System.out.println(rect.getArea());  // Что напечатается для Rectangle? А для Square?
}
```

Почему наследование `Square` от `Rectangle` здесь некорректно? Как можно решить эту проблему?

### Прочитай код: instanceof-лес

Посмотри на этот метод:

```java
void processShape(Shape shape) {
    if (shape instanceof Circle) {
        Circle c = (Circle) shape;
        // обработка круга...
    } else if (shape instanceof Rectangle) {
        Rectangle r = (Rectangle) shape;
        // обработка прямоугольника...
    } else if (shape instanceof Triangle) {
        // обработка треугольника...
    }
}
```

Почему такой подход плох? Что придётся делать каждый раз при добавлении новой фигуры? Как переписать этот код, используя полиморфизм?

### Кейс: платёжная система (Strategy)

Спроектируй систему оплаты с использованием паттерна Strategy. Интерфейс `PaymentStrategy` определяет способ оплаты — с методами `pay(double amount)` и `getPaymentMethod()`. Реализации: оплата картой, через PayPal, криптовалютой. Класс `ShoppingCart` хранит товары и использует выбранную стратегию при оформлении заказа.

### Кейс: обработчик файлов (Strategy)

Спроектируй систему парсинга файлов разных форматов. Интерфейс `FileParser` описывает методы `parse(String content)` и `getFormat()`. Реализации: CSV, JSON, XML. Класс `FileProcessor` делегирует обработку файла выбранному парсеру.
