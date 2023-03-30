package org.example;

import java.util.*;

public class UniqueLetters {

    public static void main(String[] args) {

        /*Имя|Возраст|Должность|Зарплата
        Кирилл|26|Middle java dev|150000 руб
        Виталий|28|Senior java automation QA|2000$
        Александр|31|junior functional tester|50000 руб
        Дементий|35|dev-ops|1500$

        Данная таблица представлена в формате
        List<Map<String,String>>, где каждый элемент list - строка, key в map - название столбца, value в map - значение ячейки

        Задача:

        - вывести имена всех сотрудников, младше 30.
                - вывести имена всех сотрудников, получающих зарплату в рублях.
                - вывести средний возраст всех сотрудников.*/

        /*Map<String, String> map1 = new HashMap<>();
        map1.put("name", "Кирилл");
        map1.put("age", "26");
        map1.put("position", "Middle java dev");
        map1.put("salary", "150000 руб");

        Map<String, String> map2 = new HashMap<>();
        map2.put("name", "Виталий");
        map2.put("age", "28");
        map2.put("position", "Senior java automation QA");
        map2.put("salary", "2000$");

        Map<String, String> map3 = new HashMap<>();
        map3.put("name", "Александр");
        map3.put("age", "31");
        map3.put("position", "junior functional tester");
        map3.put("salary", "50000 руб");

        Map<String, String> map4 = new HashMap<>();
        map4.put("name", "Дементий");
        map4.put("age", "35");
        map4.put("position", "dev-ops");
        map4.put("salary", "1500$");

        List<Map<String, String>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);

        list.stream()
                .filter(map -> Integer.parseInt(map.get("age")) < 30)
                .map(map -> map.get("name"))
                .forEach(System.out::println);

        list.stream()
                .filter(map -> map.get("salary").contains("руб"))
                .map(map -> map.get("name"))
                .forEach(System.out::println);

        double sumAge = list.stream()
                .mapToDouble(map -> Double.parseDouble(map.get("age")))
                .sum();
        System.out.println("Average age = " + Math.round(sumAge / list.size()));*/

        int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}, {7, 12, 16, 4}};//объявили массив и заполнили его элементами
        for (int i = 0; i < 4; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + twoDimArray[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
    }
}
