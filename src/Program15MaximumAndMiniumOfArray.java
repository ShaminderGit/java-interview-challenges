public class Program15MaximumAndMiniumOfArray {
    public static void main(String[] args) {
        int[] arr = ArryInputUtility.arryUtility();
        maxNumberLogic(arr);
        minNumberLogic(arr);

    }


    public static void maxNumberLogic(int[] arr){

        int maxNumber = Integer.MIN_VALUE;

         for(int a : arr){
             if(a >= maxNumber){
                 maxNumber = a;
             }
        }

        System.out.println("Max number is " + maxNumber);
    };

    public static void minNumberLogic(int[] arr){

        int minNumber = Integer.MAX_VALUE;

        for(int a : arr){
            if(a <= minNumber){
                minNumber = a;
            }
        }

        System.out.println("Max number is " + minNumber);

    };
}
