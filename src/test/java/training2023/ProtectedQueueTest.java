package training2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static training2023.ProtectedStack.makeStack;

class ProtectedQueueTest {

    @Test
    void testFront() {
        List<String> list = new ArrayList<>();
        list.add("push 1111");
        list.add("front");
        list.add("front");
        list.add("front");
        list.add("front");
        Assertions.assertEquals(0, makeStack(list));
    }

    @Test
    void makeQueue1() {
        List<String> list = new ArrayList<>();
        list.add("push 1");
        list.add("front");
        list.add("exit");
        Assertions.assertEquals(0, makeStack(list));
    }

    @Test
    void makeQueue2() {
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
    void makeQueue3() {
        List<String> list = new ArrayList<>();
        list.add("push 3");
        list.add("push 14");
        list.add("size");
        list.add("clear");
        list.add("push 1");
        list.add("front");
        list.add("push 2");
        list.add("front");
        list.add("pop");
        list.add("size");
        list.add("pop");
        list.add("size");
        list.add("exit");
        Assertions.assertEquals(0, makeStack(list));
    }
}