package InternDay2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DiversityAssessment {

    public static int countDiversity(List<String> products, String order) {
        int[] ord = Arrays.stream(order.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        if (ord.length == 1) {
            return 1;
        }
        Map<Integer, Integer> cat = new HashMap<>();
        Set<Integer> cats = new HashSet<>();
        for (String str : products) {
            int[] prod = Arrays.stream(str.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            cat.put(prod[0], prod[1]);
            cats.add(prod[1]);
        }
        int count = cats.size();
        int left = 0;
        int right = 1;
        if (ord.length == 2) {
            if (cat.get(ord[left]) != cat.get(ord[right])) {
                return 2;
            } else {
                return 1;
            }
        }
        while (left < ord.length && right < ord.length - 1) {
            System.out.println("left = " + left + ". right = " + right);
            while (right < ord.length - 1 && cat.get(ord[left]) != cat.get(ord[right])) {
                right++;
            }
            System.out.println("right = " + right);
            if (ord[left] == ord[right]) {
                count = Math.min(count, right - left);
            }
            System.out.println("count = " + count);
            left++;
            right = left + 1;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());
            List<String> products = new ArrayList<>();
            for (int i = 0; i < amount; i++) {
                products.add(br.readLine());
            }
            String order = br.readLine();
            System.out.println(countDiversity(products, order));
        }
    }
}
