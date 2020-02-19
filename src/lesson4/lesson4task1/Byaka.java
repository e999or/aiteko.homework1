package lesson4.lesson4task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Byaka {
    // Напишите программу которая получает на вход некую строку, после она
    //вызывает метод, заменяющий в строке все вхождения слова «бяка» на
    //«вырезано цензурой» и выводит результат в консоль!

    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        findByaka(text);

    }

    public static void findByaka(String text){
        text = text.toLowerCase();
        text = text.replaceAll("бяка", "вырезано цензурой");
        System.out.println(text);
    }
}
