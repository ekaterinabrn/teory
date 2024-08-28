package yandex;
import java.util.ArrayList;
public class Prakticum {
    public boolean isPalindromeText(String str) {
            String preparedStr = str.toLowerCase().replace(" ", "");
            StringBuilder sb = new StringBuilder(preparedStr);
            return sb.reverse().toString().equals(preparedStr);
        }}



