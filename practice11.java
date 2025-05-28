public class practice11 {
    public static void main(String[] args) {
      int[] arr1 = {1,2,3};
      int[] arr2 ={4,5,6};
      int max =Integer.MIN_VALUE;

      for(int val : arr1){
        if(val>max){
            max = val;
        }
      }
      for(int val: arr2){
        if(val > max){
            max = val;
        }
      }
      System.out.println("maximum element :" +max);
    }
    
}
