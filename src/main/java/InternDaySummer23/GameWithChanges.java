package InternDaySummer23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GameWithChanges {

    public static byte changeLetters(String[] words) {
        for (int i = 0; i < words.length - 1; i = i + 2) {
            System.out.println(isomorphic(words[i], words[i + 1]) ? "YES" : "NO");
        }
        return 0;
    }

    // counter = int(input())
    //
    //def check_string_pare(s1, s2):
    //    mapping1 = {}
    //    mapping2 = {}
    //    for i in range(len(s1)):
    //        if s1[i] in mapping1 and mapping1[s1[i]] != s2[i]:
    //            return 'NO'
    //        elif s2[i] in mapping2 and mapping2[s2[i]] != s1[i]:
    //            return 'NO'
    //        else:
    //            mapping1[s1[i]] = s2[i]
    //            mapping2[s2[i]] = s1[i]
    //    else:
    //        return 'YES'
    //
    //
    //for i in range(counter):
    //    s1 = input()
    //    s2 = input()
    //    print(check_string_pare(s1, s2))
    private static boolean isomorphic(String a, String b) {
        Map<Character, Character> mapA = new HashMap<>();
        Map<Character, Character> mapB = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (mapA.containsKey(a.charAt(i))) {
                if (mapA.get(a.charAt(i)) != b.charAt(i)) {
                    return false;
                }
            } else if (mapB.containsKey(b.charAt(i))) {
                if (mapB.get(b.charAt(i)) != a.charAt(i)) {
                    return false;
                }
            } else {
                mapA.put(a.charAt(i), b.charAt(i));
                mapB.put(b.charAt(i), a.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            String[] words = new String[n * 2];
            for (int i = 0; i < n * 2; i++) {
                words[i] = br.readLine();
            }
            changeLetters(words);
        }
    }
}
