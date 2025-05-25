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
                    String Swordadd = scanner.nextLine();

                    String workAdd = new String(Swordadd);
                    list.add(Swordadd);
                    //int idx=list.indexOf(Swordadd);
                    System.out.println("Новая задача " + workAdd + " Добавлена");

                    break;

                case 2:
                    // for (int i = 0; i < list.size(); i++) {
                    //    System.out.println(list.get(i));
                    for (String s : list) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.println(" Введите номер дела который вы хотите удалить");
                    int killNumber = Integer.parseInt(scanner.nextLine());
                    list.remove(killNumber - 1);
                    break;
                case 4:
                    System.out.println("Введите название дела которое вы хотите удалить");
                    String killword = scanner.nextLine();
                    if (list.contains(killword)) {
                        list.remove(killword);
                    }
                    break;
            }


        }


    }
}



