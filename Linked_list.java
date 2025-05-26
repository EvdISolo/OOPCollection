import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Linked_list {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("0. Выход из программы");
            System.out.println("1. Добавить дело");
            System.out.println("2. Показать дела");
            System.out.println("3. Удалить дело по номеру");
            System.out.println("4. Удалить дело по названию");

            String input = scanner.nextLine();
            int operation = Integer.parseInt(input);

            System.out.println("Ваш выбор " + input);
            switch (operation) {
                case 0:
                    System.out.println("Программа закрыта");
                    System.exit(0);

                case 1:
                    System.out.println("Введите название задачи");
                    String workadd = scanner.nextLine();

                    list.add(workadd);
                    System.out.println("Новая задача " + workadd + " Добавлена");

                    break;

                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + "." + " " + list.get(i));
                    }
                    break;

                case 3:
                    System.out.println(" Введите номер дела который вы хотите удалить");
                    int number = Integer.parseInt(scanner.nextLine());
                    if (number >= list.size() || number < 0) {

                    } else {
                        list.remove(number - 1);


                    }


                    break;
                case 4:
                    System.out.println("Введите название дела которое вы хотите удалить");
                    String killword = scanner.nextLine();
                    if (list.contains(killword)) {
                        list.remove(killword);
                    } else if (!list.contains(killword)) {
                        System.out.println("Задание с таким названием не найдено");
                    }
                    break;
            }


        }


    }
}



