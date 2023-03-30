package homework2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static homework2023.ProtectedStack.makeStack;

class ProtectedStackTest {

    @Test
    void makeStackTest1() {
        List<String> list = new ArrayList<>();
        list.add("push 1");
        list.add("back");
        list.add("exit");
        Assertions.assertEquals(0, makeStack(list));
    }

    @Test
    void makeStackTest2() {
        List<String> list = new ArrayList<>();
        list.add("size");
        list.add("push 1");
        list.add("size");
        list.add("push 2");
        list.add("size");
        list.add("push 3");
        list.add("size");
        list.add("exit");
        Assertions.assertEquals(0, makeStack(list));
    }

    @Test
    void makeStackTest3() {
        List<String> list = new ArrayList<>();
        list.add("push 3");
        list.add("push 14");
        list.add("size");
        list.add("clear");
        list.add("push 1");
        list.add("back");
        list.add("push 2");
        list.add("back");
        list.add("pop");
        list.add("size");
        list.add("pop");
        list.add("size");
        list.add("exit");
        Assertions.assertEquals(0, makeStack(list));
    }

}