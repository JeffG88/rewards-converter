import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(100.0, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 1000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(1000.0, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        // This test is not yet implemented
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertFalse(rewardValue.getCashValue() != 100.0);
    }

    @Test
    void convert_from_miles_to_cash() {
        // This test is not yet implemented
        int milesValue = 1000;
        var rewardValue = new RewardValue(milesValue);
        assertFalse(rewardValue.getCashValue() == 5 );
    }
}
