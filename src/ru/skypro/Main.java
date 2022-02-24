package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Задание 1
        int j = 0;
        while (j < 10) {
            j++;
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        //Задание 2
        int k = 7;
        for (; k <= 31; k = k + 7) {
            System.out.println("Сегодня пятница, " + k + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();

        //Задание 3
        int current = 2021;
        int before = current - 200;
        int after = current + 100;

        while (before <= after) {
            before = before + 79;
            if (before > 2121)
                break;
            System.out.println("Комета пролетала рядом с Землей в " + before + " году.");
        }
    }
}
