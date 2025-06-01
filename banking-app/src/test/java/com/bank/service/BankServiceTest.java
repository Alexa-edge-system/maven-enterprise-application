package com.bank.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankServiceTest {

    private final BankService service = new BankService();

    @Test
    public void testDeposit() {
        double result = service.deposit(100.0, 50.0);
        assertEquals(150.0, result);
    }

    @Test
    public void testDepositNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.deposit(100.0, -10.0);
        });
    }

    @Test
    public void testWithdraw() {
        double result = service.withdraw(100.0, 30.0);
        assertEquals(70.0, result);
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.withdraw(100.0, 200.0);
        });
    }
}
