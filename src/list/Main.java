package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "end. Выход");
            String com = scanner.nextLine();
            if (com.equals("end")){
                for(int i = 0; i<list.size();i++){
                    System.out.println(i+1+". "+list.get(i));
                }
                break;
            }
            else {
                switch (com) {
                    case "1":
                        System.out.println("Введите задачу для планирования:");
                        String task = scanner.nextLine();
                        list.add(task);
                        break;
                    case "2":
                        System.out.println("Список задач:");
                           for(int i = 0; i<list.size();i++){
                                System.out.println(i+1+". "+list.get(i));
                            }
                        break;
                    case "3":
                        while (true) {
                            System.out.println("Введите номер задачи для удаления:");
                            System.out.println("Введите finish для Выхода");
                            String num = scanner.nextLine();
                            if (num.equals("finish")) {
                                System.out.println("Список задач:");
                                for (int i = 0; i < list.size(); i++) {
                                    System.out.println(i + 1 + ". " + list.get(i));
                                }
                                break;
                            } else {
                                list.remove(Integer.parseInt(num) - 1);
                                System.out.println("Список задач:");
                                for (int i = 0; i < list.size(); i++) {
                                    System.out.println(i + 1 + ". " + list.get(i));
                                }
                            }
                        }
                        break;

                }
            }
        }

    }

}
