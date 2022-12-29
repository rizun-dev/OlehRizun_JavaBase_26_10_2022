package HillelRizunDz14;

public class Fitness {

//    1. Зробіть програму для фітнес трекера, яка реєструватиме нового користувача створюючи йому обліковий запис, приймаючи наступні параметри:
//    2. Незмінні (задаються тільки при створенні облікового запису, і можуть бути отримані лише за допомогою гетерів):
//      a) Ім'я
//      b) Дата народження (окремо день, місяць, рік)
//      c) Емейл
//      d) Телефон

//    3. Змінювані:
//      a) Прізвище
//      b) Вага
//      c) Тиск
//      d) Кількість пройдених за день кроків

//    4. Створювати кожного користувача необхідно через конструктор, беручи всі поля на вхід конструктора.
//    5. Додати метод printAccountInfo(), при виклику якого друкувати всі дані про користувача
//    6. Після прийому року народження - вираховувати вік користувача у внутрішню змінну age (відштовхуючись просто від 2020 року, ускладнювати тут не будемо),
//    на яку зробити тільки геттер і виводити на екран разом з іншими полями в методі printAccountInfo();
//    у конструкторі або геттерах/сеттерах не використовуємо виведення в консоль.
//    7. У main-класі створити 3-5 користувачів та роздрукувати дані кожного через виклик методу printAccountInfo();
//    для двох користувачів змінити кілька полів та роздрукувати нові дані повторно

    public static void main(String[] args) {
        FitnessTracker oleh = new FitnessTracker("Oleh", "Rizun", 16, 9,
                2001, "olehRizun@gmail.com", "+380680272593",
                82.3, "120/80", 11000);

        FitnessTracker myroslava = new FitnessTracker("Myroslava", "Rizun", 3, 7,
                2000, "myroslavaRizun@gmail.com", "+380979804212,",
                54.0, "90/80", 8000);

        FitnessTracker yaroslav = new FitnessTracker("Yaroslav", "Rizun", 25, 6,
                1999, "yaroslavRizun@gmail.com", "+380988576171",
                65.4, "130/60", 5000);

        FitnessTracker dmytro = new FitnessTracker("Dmytro", "Rizun", 6, 2,
                1982, "DmytroRizun@gmail.com", "+380988576175",
                90.2, "105/70", 2000);

        FitnessTracker maria = new FitnessTracker("Maria", "Rizun", 18, 1,
                1995, "MariayaroslavRizun@gmail.com", "+380988578948",
                69, "110/82", 15000);

        oleh.printAccountInfo();
        myroslava.printAccountInfo();
        yaroslav.printAccountInfo();

        oleh.setWeight(85.7);
        oleh.setStepsPerDay(13000);

        myroslava.setWeight(56.2);
        myroslava.setBloodPressure("100/90");
        myroslava.setSurname("Churchill");

        yaroslav.setSurname("Churchill");
        yaroslav.setStepsPerDay(8000);

        oleh.printAccountInfo();
        myroslava.printAccountInfo();
        yaroslav.printAccountInfo();
        dmytro.printAccountInfo();
        maria.printAccountInfo();
    }
}