package training2021.lesson4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountsTest {

    @Test
    void processAccounts() {
        List<String> list1 = List.of("DEPOSIT Ivanov 100", "INCOME 5", "BALANCE Ivanov", "TRANSFER Ivanov Petrov 50",
                "WITHDRAW Petrov 100", "BALANCE Petrov", "BALANCE Sidorov");
        assertEquals(0, BankAccounts.processAccounts(list1));
    }
}