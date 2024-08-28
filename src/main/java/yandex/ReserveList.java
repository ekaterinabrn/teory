package yandex;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReserveList {
    public void ReserveUnPlace(List<Integer> list) {
        for ( int idx =0; idx< list.size()/2; idx++) {
            Collections.swap(list,idx,list.size()-1-idx);
        }
    }
}
