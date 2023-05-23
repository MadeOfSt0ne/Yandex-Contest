package BackendSchool2022;

import java.util.*;

public class YouPassed {
    static void getCandidates(List<String[]> vacancies, Candidate[] candidates) {
        List<String> ans = new ArrayList<>();
        Arrays.sort(candidates, comp());
        for (String[] str : vacancies) {
            int amount = Integer.parseInt(str[1]);
            for (Candidate cand : candidates) {
                if (cand.vacancy.equals(str[0])) {
                    ans.add(cand.name);
                    amount--;
                }
                if (amount == 0) {
                    break;
                }
            }
        }
        ans.sort(Comparator.naturalOrder());
        ans.forEach(System.out::println);
    }

    static Comparator<Candidate> comp() {
        return Comparator.comparing(Candidate::tasks, Comparator.reverseOrder()).thenComparing(Candidate::fine);
    }

    record Candidate(String name, String vacancy, int tasks, int fine) {}

    public static void main(String[] args) {
        List<String[]> vacancies = List.of(new String[] {"developer", "1"},
                                           new String[] {"hacker", "2"});
        Candidate[] candidates = {new Candidate("anonymous", "hacker", 6, 0),
                                  new Candidate("bjarne", "developer", 6, 1),
                                  new Candidate("julian", "hacker", 5, 100500),
                                  new Candidate("bill", "developer", 3, 1),
                                  new Candidate("guccifer", "hacker", 2, 0)};
        getCandidates(vacancies, candidates);
    }
}
