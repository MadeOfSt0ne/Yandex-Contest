package SpringSummer23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Relocation {

    static byte sixArrays(int[] cMoney, int[] cEducation, int[] cParents,
                          int[] fMoney, int[] fEducation, int[] fParents) {
        for (int i = 0; i < fMoney.length; i++) {
            int country = 0;
            for (int j = 0; j < cMoney.length; j++) {
                if ((fMoney[i] >= cMoney[j] && fEducation[i] >= cEducation[j]) ||
                        (cParents[j] == 1 && fParents[i] == j + 1)) {
                    country = j + 1;
                    break;
                }
            }
            System.out.print(country + " ");
        }
        return 0;
    }

    static byte findCountry(List<Country> countries, Friend[] friends, Set<Integer> parents) {
        for (Friend friend : friends) {
            int country = 0;
            for (Country c : countries) {
                if ((friend.money >= c.money && friend.education >= c.education) ||
                        parents.contains(friend.parents)) {
                    country = c.number;
                    break;
                }
            }
            System.out.print(country + " ");
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            List<Country> countries = new ArrayList<>();
            Set<Integer> parents = new HashSet<>();
            int[] cMoney = readIntArray(br);
            int[] cEducation = readIntArray(br);
            int[] cParents = readIntArray(br);
            for (int i = 0; i < n; i++) {
                if (cParents[i] == 1) {
                    parents.add(i + 1);
                } else {
                    countries.add(new Country(cMoney[i], cEducation[i], i + 1));
                }
            }
            int k = Integer.parseInt(br.readLine());
            Friend[] friends = new Friend[k];
            int[] fMoney = readIntArray(br);
            int[] fEducation = readIntArray(br);
            int[] fParents = readIntArray(br);
            for (int j = 0; j < k; j++) {
                friends[j] = new Friend(fMoney[j], fEducation[j], fParents[j]);
            }
            findCountry(countries, friends, parents);
        }
    }

    private static int[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    record Country(int money, int education, int number) {}
    record Friend(int money, int education, int parents) {}
}
