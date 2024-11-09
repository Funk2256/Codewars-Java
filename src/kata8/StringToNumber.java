package kata8;

//Description
//We need a function that can transform a string into a number. What ways of achieving this do you know?
//
//Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
//
//Examples
//"1234" --> 1234
//        "605"  --> 605
//        "1405" --> 1405
//        "-7" --> -7

import java.util.Scanner;

public class StringToNumber {
    public Integer stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        System.out.print("Введите строку с числом: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringToNumber converter = new StringToNumber();
        try {
            Integer number = converter.stringToNumber(str);
            System.out.println("Преобразованное число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введенная строка не является числом.");
        }

        scanner.close(); // Закрываем Scanner
    }
}
