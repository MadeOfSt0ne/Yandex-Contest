package IwoFall23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void getProgram1() {
        int[] slots = {1, 5};
        Task5.Student[] students = {new Task5.Student(0, 3, new int[]{1}),
                                    new Task5.Student(1, 1, new int[]{2}),
                                    new Task5.Student(2, 2, new int[]{1, 2}),
                                    new Task5.Student(3, 3, new int[]{1, 2})
                                     };
        assertEquals(0, Task5.getProgram(slots, students));
    }
}