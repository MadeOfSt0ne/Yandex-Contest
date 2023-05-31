package SpringSummer23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Relocation {

    static byte findCountry(Country[] countries, Friend[] friends, Set<Integer> parents) {
        for (Friend friend : friends) {
            if (parents.contains(friend.parents)) {
                System.out.print(friend.parents + " ");
                continue;
            }
            int country = 0;
            for (int k = 0; k < countries.length; k++) {
                if (friend.money >= countries[k].money && friend.education >= countries[k].education) {
                    country = k + 1;
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
            Country[] countries = new Country[n];
            Set<Integer> parents = new HashSet<>();
            int[] cMoney = readIntArray(br);
            int[] cEducation = readIntArray(br);
            int[] cParents = readIntArray(br);
            for (int i = 0; i < n; i++) {
                countries[i] = new Country(cMoney[i], cEducation[i]);
                if (cParents[i] == 1) {
                    parents.add(i + 1);
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

    record Country(int money, int education) {}
    record Friend(int money, int education, int parents) {}
}
