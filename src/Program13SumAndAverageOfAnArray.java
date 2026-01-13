import java.sql.SQLOutput;

public class Program13SumAndAverageOfAnArray {

    public static void main(String[] args) {

        Program13SumAndAverageOfAnArray p = new Program13SumAndAverageOfAnArray();
        p.sumAndAverageOfAnArray(ArryInputUtility.arryUtility());



    }

    public void sumAndAverageOfAnArray(int[] arr){
        int count = 0;
        int sum   = 0;
        while(count<arr.length){
            sum = sum +  arr[count] ;
            count++;
        }
        System.out.println("Sum of the given array is");
        System.out.println(sum);
        int avergae = sum / arr.length;
        System.out.println("Average of the given array is");
        System.out.println(avergae);


    }



}
