public class Program16IsSortedOrNot {

    public static void main(String[] args) {
      int[] arr = ArryInputUtility.arryUtility();
      isSortedOrNot(arr);


    }


    public static void isSortedOrNot(int[] arr){

        boolean ascending = true;
        boolean descending = true;


        for(int i = 0 ; i< arr.length-1 ;  i++){

            if (arr[i] >= arr[i+1] ) {
                ascending = false;
            }
            else if(arr[i] <= arr[i+1]){
                descending = false;
            }
                   }

        if(ascending){
            System.out.println("Array is sorted in ascending order");
        }

        else if(descending){
            System.out.println("Array is sorted in descending order");
        }

        else{
            System.out.println("Array is not sorted");
        }

    }


}
