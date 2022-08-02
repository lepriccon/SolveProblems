package Java_Beginer;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Comparator<testObject> comp = new myComparatorIntS().thenComparing(new myComparator());
        Set<testObject> mySet = new TreeSet<>(comp);
        mySet.add(new testObject("A", 2));
        mySet.add(new testObject("C", 0));
        mySet.add(new testObject("A", 5));
        mySet.add(new testObject("B", 7));
        mySet.add(new testObject("D", 5));
        for (testObject newT : mySet){
            System.out.println(newT.text + " ---- " + newT.index);
        }
        }
    }
    class testObject{
        String text;
        int index;

        public testObject(String text, int index) {
            this.text = text;
            this.index = index;
        }

         String getName (){
         return  this.text;
        }

    }

    class myComparator implements  Comparator<testObject>{
        @Override
        public int compare(testObject o1, testObject o2) {
            return o1.text.compareTo(o2.text);
        }

    }

class myComparatorIntS implements  Comparator<testObject>{
    @Override
    public int compare(testObject o1, testObject o2) {
        return o1.index - o2.index;
    }

}

