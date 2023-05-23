package BackendSchool2022;

import java.util.HashMap;
import java.util.Map;

public class GuessTheWord {
    static void findCorrect(String s1, String s2) {
        Map<Character, Integer> notCorrect = new HashMap<>();
        String[] ans = new String[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                ans[i] = "correct";
            } else {
                notCorrect.put(s1.charAt(i), notCorrect.getOrDefault(s1.charAt(i), 0) + 1);
            }
        }
        for (int j = 0; j < s1.length(); j++) {
            if (ans[j] == null) {
                if (notCorrect.containsKey(s2.charAt(j)) && notCorrect.get(s2.charAt(j)) > 0) {
                    ans[j] = "present";
                    notCorrect.put(s2.charAt(j), notCorrect.get(s2.charAt(j)) - 1);
                } else {
                    ans[j] = "absent";
                }
            }
        }
        for (String str : ans) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String s1 = "COVER";
        String s2 = "CLEAR";
        findCorrect(s1, s2);
    }
}
