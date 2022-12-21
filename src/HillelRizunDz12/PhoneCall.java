package HillelRizunDz12;

public class PhoneCall {

//        1. Зробити клас Person та в ньому метод personInfo()
//        2. На вхід передавати йому чотири параметри: ім'я, прізвище, місто, телефон
//        3. Всередині методу формувати рядок у форматі:
//              a. Зателефонувати громадянину + ІМ'Я ПРІЗВИЩЕ + із міста + МІСТО можна за номером + ТЕЛЕФОН
//        4. Метод має повертати String
//        5. У main-методі зробити три виклики методу personInfo, щоразу передаючи нову людину;
//        6. Повинен вийти висновок такого типу:
//              a. Зателефонувати громадянинові Will Smith з міста New York можна за номером 2936729462846.
//              b. Зателефонувати громадянинові Jackie Chan з міста Shanghai можна за номером 12312412412.
//              c. Зателефонувати до громадян Sherlock Holmes з міста London можна за номером 37742123513.

    public static void main(String[] args) {

        Person first = new Person();
        first.personInfo("Sherlock ", "Holmes ", "London", "2936729462846");

        Person second = new Person();
        second.personInfo("John", "Watson ", "London", "12312412412");

        Person third = new Person();
        third.personInfo("Oleh ", "Rizun ", "Ukraine", "380680272592");
    }
}

class Person {
    public void personInfo(String firstName, String secondName, String city, String phoneNumber) {
        System.out.println("Зателефонувати громадянинові " + firstName + secondName + "з міста " + city + ", "
                + "можна за номером " + phoneNumber);

    }
}
