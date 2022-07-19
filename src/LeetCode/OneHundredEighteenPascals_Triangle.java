package LeetCode;
import java.util.ArrayList;
import java.util.List;

public class OneHundredEighteenPascals_Triangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> rows, previous = null;
        for(int i=0; i<numRows; ++i){
            rows = new ArrayList<Integer>();
            for(int j=0; j<=i; ++j){
                if(j==0 || j==i)
                    rows.add(1);
                else
                    rows.add(previous.get(j-1)+previous.get(j));
            }
            previous = rows;
            result.add(rows);
        }
        return result;
    }

    public static void main(String[] args) {
        generate(1);
        System.out.println(generate(10));
    }

}
