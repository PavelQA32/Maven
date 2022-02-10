import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);


    }
    @Test
    void whenUnregisteredAndBonusOverLimit_thenBonusIsLimited(){
        BonusService service = new BonusService();

        long amount = 5_100_000;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount,registered);

        assertEquals(expected,actual);
    }
    @Test
    void whenUnregisteredAndBonusUnderLimit_thenBonusIsNotLimited(){
        BonusService service = new BonusService();

        long amount = 1_000_60;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount,registered);

        assertEquals(expected,actual);
    }
    @Test
    void crashTestForAutotest(){

        BonusService service = new BonusService();

        long amount = 1_000_60;
        boolean registered = true;
        long expected = 33;

        long actual = service.calculate(amount,registered);

        assertEquals(expected,actual);
    }
}