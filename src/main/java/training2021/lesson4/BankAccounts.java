package training2021.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BankAccounts {

    public static byte processAccounts(List<String> operations) {
        Map<String, Long> accounts = new HashMap<>();
        List<String[]> arrays = new ArrayList<>();
        for (String str : operations) {
            arrays.add(str.split(" "));
        }
        Long balance;
        for (String[] operation : arrays) {
            switch (operation[0]) {
                case "DEPOSIT" :
                    balance = accounts.getOrDefault(operation[1], 0L);
                    accounts.put(operation[1], balance + Long.parseLong(operation[2]));
                    break;
                case "WITHDRAW" :
                    balance = accounts.getOrDefault(operation[1], 0L);
                    accounts.put(operation[1], balance - Long.parseLong(operation[2]));
                    break;
                case "INCOME" :
                    for (String name : accounts.keySet()) {
                        balance = accounts.get(name);
                        if (balance > 0) {
                            accounts.put(name, balance + balance * Long.parseLong(operation[1]) / 100);
                        }
                    }
                    break;
                case "TRANSFER" :
                    balance = accounts.getOrDefault(operation[1], 0L);
                    Long secondBalance = accounts.getOrDefault(operation[2], 0L);
                    accounts.put(operation[1], balance - Long.parseLong(operation[3]));
                    accounts.put(operation[2], secondBalance + Long.parseLong(operation[3]));
                    break;
                case "BALANCE" :
                    if (accounts.containsKey(operation[1])) {
                        System.out.println(accounts.get(operation[1]));
                    } else {
                        System.out.println("ERROR");
                    }
                    break;
                default:
                    System.out.println("Unknown command: " + operation[0]);
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> arr = br.lines().collect(Collectors.toList());
            processAccounts(arr);
        }
    }
}
