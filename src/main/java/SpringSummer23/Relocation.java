package SpringSummer23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Relocation {

    static byte findCountry(Set<Country> countries, Friend[] friends) {
        Map<Friend, Integer> cache = new HashMap<>();
        for (Friend f : friends) {
            if (cache.containsKey(f)) {
                System.out.print(cache.get(f) + " ");
                continue;
            }
            int country = 0;
            for (Country c : countries) {
                if (c.parents == 1 && f.parents == c.number) {
                    country = f.parents;
                    break;
                }
                if (f.money >= c.money && f.education >= c.education) {
                    country = c.number;
                    break;
                }
            }
            cache.put(f, country);
            System.out.print(country + " ");
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            Set<Country> countries = new LinkedHashSet<>();
            int[] cMoney = readIntArray(br);
            int[] cEducation = readIntArray(br);
            int[] cParents = readIntArray(br);
            for (int i = 0; i < n; i++) {

                countries.add(new Country(cMoney[i], cEducation[i], cParents[i], i + 1));
            }
            int k = Integer.parseInt(br.readLine());
            Friend[] friends = new Friend[k];
            int[] fMoney = readIntArray(br);
            int[] fEducation = readIntArray(br);
            int[] fParents = readIntArray(br);
            for (int j = 0; j < k; j++) {
                friends[j] = new Friend(fMoney[j], fEducation[j], fParents[j]);
            }
            findCountry(countries, friends);
        }
    }

    private static int[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    record Country(int money, int education, int parents, int number) {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Country country = (Country) o;
            return money == country.money && education == country.education && parents == country.parents;
        }

        @Override
        public int hashCode() {
            return Objects.hash(money, education, parents);
        }
    }
    record Friend(int money, int education, int parents) {}
}
