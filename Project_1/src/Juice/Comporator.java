package Juice;

import java.util.Comparator;

public class Comporator implements Comparator<String> {
    @Override
    public int compare(String one, String two) {
        return one.length()-two.length();
    }
}
