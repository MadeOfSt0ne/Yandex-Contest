package leetcode;

import java.util.List;

public class FindCelebrity {

    /**
     * Нужно найти "знаменитость" в списке людей.
     * Все должны знать знаменитость и знаменитость не должна знать никого.
     */
    Person findCelebrity(Person[] persons) {
        int left = 0;
        int right = persons.length - 1;
        while (left != right) {
            if (persons[left].knows(persons[right])) {
                left++;
            } else {
                right++;
            }
        }
        for (int i = 0; i < persons.length; i++) {
            if (i != left && (!persons[i].knows(persons[left]) || persons[left].knows(persons[i]))) {
                return null;
            }
        }
        return persons[left];
    }

    class Person {
        String name;

        public boolean knows(Person person) {
            return true;
        }
    }
}
