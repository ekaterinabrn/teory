package yandex;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class ReservePuzzletest {
    private final ReserveList r=new ReserveList();
    @Test
public void emptyList(){
        var l = new ArrayList<Integer>();
l.add(10);
l.add(13);
r.ReserveUnPlace(l);
assertEquals(Integer.valueOf(13),l.get(0));
assertEquals(Integer.valueOf(10), l.get(1));
// другой вариант assertEquals(List.of(13, 10), l);
        //заморрозить список
       // list <Integer> unmodifable = Collections.unmodifiableCollection(l);
    }
}
