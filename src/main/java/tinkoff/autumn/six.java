package tinkoff.autumn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class six {

    public static byte answerQuestions(int ghosts, String[] questions) {
        int[] counter = new int[ghosts + 1];
        Map<Integer, Integer> ghostInGang = new HashMap<>();
        Map<Integer, List<Integer>> gangs = new HashMap<>();
        for (int i = 1; i <= ghosts; i++) {
            counter[i]++;
            ghostInGang.put(i, i);
            List<Integer> gang = new ArrayList<>();
            gang.add(i);
            gangs.put(i, gang);
        }
        for (String s : questions) {
            String[] question = s.split(" ");
            int q = Integer.parseInt(question[0]);
            if (q == 1) {
                int first = Integer.parseInt(question[1]);
                int second = Integer.parseInt(question[2]);
                if (ghostInGang.get(first) != ghostInGang.get(second)) {
                    List<Integer> fi = gangs.get(ghostInGang.get(first));
                    List<Integer> se = gangs.get(ghostInGang.get(second));
                    gangs.remove(ghostInGang.get(second));
                    for (int i : se) {
                        ghostInGang.put(i, ghostInGang.get(first));
                        fi.add(i);
                    }
                    for (int i : fi) {
                        counter[i]++;
                    }
                    gangs.put(ghostInGang.get(first), fi);
                }
            } else if (q == 2) {
                int first = Integer.parseInt(question[1]);
                int second = Integer.parseInt(question[2]);
                System.out.println(ghostInGang.get(first) == ghostInGang.get(second) ? "YES" : "NO");
            } else {
                int num = Integer.parseInt(question[1]);
                System.out.println(counter[num]);
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] nm = br.readLine().split(" ");
            int ghosts = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            String[] questions = new String[m];
            for (int i = 0; i < m; i++) {
                questions[i] = br.readLine();
            }
            answerQuestions(ghosts, questions);
        }
    }
}
