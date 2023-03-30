package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class A_SneakyCipher {

    private static String getCipher(List<Person> persons) {
        StringBuilder sb = new StringBuilder();

        Map<Character, Integer> letters = new HashMap<>();
            letters.put('A', 1);
            letters.put('B', 2);
            letters.put('C', 3);
            letters.put('D', 4);
            letters.put('E', 5);
            letters.put('F', 6);
            letters.put('G', 7);
            letters.put('H', 8);
            letters.put('I', 9);
            letters.put('J', 10);
            letters.put('K', 11);
            letters.put('L', 12);
            letters.put('M', 13);
            letters.put('N', 14);
            letters.put('O', 15);
            letters.put('P', 16);
            letters.put('Q', 17);
            letters.put('R', 18);
            letters.put('S', 19);
            letters.put('T', 20);
            letters.put('U', 21);
            letters.put('V', 22);
            letters.put('W', 23);
            letters.put('X', 24);
            letters.put('Y', 25);
            letters.put('Z', 26);

        for (Person person : persons) {
            Set<Character> name = new HashSet<>();
            char[] full = person.fullName.toCharArray();
            for (Character ch : full) {
                name.add(ch);
            }
            int sumOfDay = person.day / 10 + person.day % 10;
            int sumOfMonth = person.month / 10 + person.month % 10;
            int numberOfFirstLetter = letters.get(full[0]);
            int totalSum = name.size() + (sumOfDay + sumOfMonth) * 64 + numberOfFirstLetter * 256;
            String convert = Integer.toHexString(totalSum).toUpperCase();
            if (convert.length() == 3) {
                sb.append(convert);
            }
            if (convert.length() == 2) {
                sb.append("0").append(convert);
            }
            if (convert.length() == 1) {
                sb.append("00").append(convert);
            }
            if (convert.length() > 3) {
                char[] converted = convert.toCharArray();
                for (int i = converted.length - 3; i < converted.length; i++) {
                    sb.append(converted[i]);
                }
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = readInt(reader);
            List<Person> persons = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                List<String> arr = readList(reader);
                Person person = new Person(
                        arr.get(0),
                        arr.get(1),
                        arr.get(2),
                        Integer.parseInt(arr.get(3)),
                        Integer.parseInt(arr.get(4)),
                        Integer.parseInt(arr.get(5))
                );
                persons.add(person);
            }

            String result = getCipher(persons);
            System.out.println(result);

        }
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    private static List<String> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(","))
                .collect(Collectors.toList());
    }

    static class Person {
        public Person(String firstName, String secondName, String lastName, int day, int month, int year) {
            this.fullName = firstName + secondName + lastName;
            this.day = day;
            this.month = month;
            this.year = year;
        }

        String fullName;
        int day;
        int month;
        int year;
    }
}
