package day04;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringStatisticsTest {

    @Test
    void testVowelsCount(){
        StringStatistics stringStatistics = new StringStatistics();
        Map<Character, Integer> result = stringStatistics.vowelCounter("appletree");

        assertEquals(1, result.get('a'));
        assertNull(result.get('u'));

    }
}
