package Juice;

import java.util.Comparator;

 public class Comp implements Comparator<String> {
        @Override
        public int compare(String one, String two) {
            return one.compareTo(two);
        }
}
