package yandex;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TwoSumPuzzleTest {
    TwoSum s = new TwoSum();
    @Test
    public void twoElements(){
       List<Integer> actual= s.findPair(List.of(3,2,4),6);
        assertEquals(List.of(2,4), actual);
    }
}
