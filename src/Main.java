import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
    public class Main {
        public static void main(String[] args) {
            int [][] arr ={{1,1,1,3,4},{2,1,3,1,2},{2,2,3,4,1},{3,3,3,1,4},};
            int i,p;
            System.out.println();
            for (i=0; i<=arr.length-1; i++)
            {for (p=0; p<=arr.length; p++){
                System.out.print(arr[i][p]+" "); }
                System.out.println();}
            for (i=0; i<=arr.length-1; i++){
                List<Integer> arr1 = new ArrayList<Integer>();
                 System.out.print("line"+(i+1)+": ");
                for (p=0; p<=arr.length; p++){
            if (arr[i][p]==1){ arr1.add(p);}}
                 System.out.println(arr1.toString()); }}}