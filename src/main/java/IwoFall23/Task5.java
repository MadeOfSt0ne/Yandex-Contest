package IwoFall23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Task5 {

    static byte getProgram(int[] slots, Student[] students) {
        Arrays.sort(students, Comparator.comparing(Student::rating));
        int[] answer = new int[students.length];
        for (Student st : students) {
            for (int i : st.programs()) {
                if (slots[i - 1] > 0) {
                    answer[st.id] = i;
                    slots[i - 1]--;
                    break;
                }
                answer[st.id] = -1;
            }
        }
        for (int a : answer) {
            System.out.printf("%d ", a);
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nk = readArray(br);
            int[] slots = readArray(br);
            Student[] studs = new Student[nk[0]];
            for (int i = 0; i < nk[0]; i++) {
                int[] s = readArray(br);
                int[] progs = new int[s[1]];
                int c = 2;
                for (int j = 0; j < s[1]; j++) {
                    progs[j] = s[c++];
                }
                studs[i] = new Student(i, s[0], progs);
            }
            getProgram(slots, studs);
        }
    }

    private static int[] readArray(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    record Student(int id, int rating, int[] programs) {}
}
