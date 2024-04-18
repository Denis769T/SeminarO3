import java.io.*;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void stroca(String s4) {
        System.out.println(s4);// Обработка даты рождения.
        String a = String.valueOf(s4.charAt(2));
        String b = String.valueOf(s4.charAt(5));
        System.out.println("---");
        String s4_1 = s4.substring(0, 2);
        String s4_2 = s4.substring(3, 5);
        String s4_3 = s4.substring(6, 10);

        Integer num_1 = Integer.parseInt(s4_1);
        Integer num_2 = Integer.parseInt(s4_2);
        Integer num_3 = Integer.parseInt(s4_3);

        if (num_1 < 0 || num_1 > 31) {
            System.out.println("Неверно введен день рождения!!!");
        }
        if (num_2 < 0 || num_2 > 12) {
            System.out.println("Неверно введен день рождения!!!");
        }
        if (num_3 < 0 || num_3 > 2024) {
            System.out.println("Неверно введен день рождения!!!");
        }


        //
        // return;


    }

    public static <name, Use> void main(String[] args) throws IOException {


        while (true) {
            try {


                Scanner data = new Scanner(System.in);
                System.out.println("Введите данные.(Фамилия Имя Отчество:дата рождения:номер телефона:пол)");
                System.out.println("Пример:  Петров Семен Иванович-25.04.1979-68686586-f (f-жен. пол, m-муж.пол).");
                String name1 = data.nextLine();
                System.out.println("------------------");
                System.out.println("Вы ввели:");
                if (name1 == null) {
                    System.out.println("Не ввели нечего,");
                } else {
                }
                ;

                String[] arr = name1.split("-");

                if (arr[0] == null || arr[1] == null || arr[2] == null || arr[3] == null) {
                    System.out.println("Не ввели данные");
                } else {
                    stroca(arr[1]);

                    System.out.println("Ф.И.О:  " + arr[0]);
                    String[] arr0_1 = arr[0].split(" ");
                    System.out.println(arr0_1[0]); // Фамилия
                    System.out.println(arr0_1[1]); // Имя
                    System.out.println(arr0_1[2]); // Отчество


                    System.out.println("Дата рождения:  " + arr[1]);
                    Integer numPhone = Integer.parseInt(arr[2]);// Конвертация номера телефона
                    System.out.println("Номер телефона:  " + numPhone);
                    String floor = arr[3];
                    if (Objects.equals(floor, "f") || Objects.equals(floor, "m")) {
                        System.out.println("Пол:  " + floor);
                        try (FileWriter fileWriter = new FileWriter(arr[0] + ".txt", true)) {

                            fileWriter.write(name1 + "\n");
                            fileWriter.close();
                        }
                    } else {

                        System.out.println("Не корректно ввели пол!!!");

                    }

                    // break;

                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Вы не осуществили полный ввод данных!!!");

            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Ошибка в синтаксисе ввода данных!!!");
            } catch (NumberFormatException e) {
                System.out.println("Ошибка в дате рождения!!!");
            }
        }


    }
}









