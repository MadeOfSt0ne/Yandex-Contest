package leetcode.yandex;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    @Test
    void generateParentheses() {
        assertEquals(List.of("((()))", "(()())", "(())()", "()(())", "()()()"), GenerateParentheses.generateParentheses(3));
    }
}