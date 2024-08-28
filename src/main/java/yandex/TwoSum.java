package yandex;

import java.util.List;

//найти пару что в сумме даст 10
public class TwoSum {
    public List<Integer> findPair (List<Integer> numbers, int sum) {

       for (int idx =1; idx<numbers.size(); idx++) {
           Integer current = numbers.get(idx);
           Integer lookup = sum - current;
           int idx2 = numbers.subList(0, idx).indexOf(lookup);
           if (idx2>-1) return List.of(lookup, current);
           //проще if(numbers.sublist(0, idx).contains(lookup)>-1) return List.of(lookup, current);
       //если миллион строк  до цикла делаем замену саблист на сет var s= new HashSet<Integer>();
           //s.add(numbers.get(0));
       }
       return null;
    }
}
