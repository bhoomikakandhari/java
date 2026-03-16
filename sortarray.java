import java.util.Random;


public class sortarray {
    
    Random rand= new Random();
    public int[] sortArray(int[] nums) {
        quicksort(nums,0,nums.length-1);
        return nums;
    }
    void quicksort(int[]arr, int low,int high){
        if(low < high){
              int pivotIndex = low + rand.nextInt(high-low+1);
              swap(arr,pivotIndex,high);
              int pi= partition(arr,low,high);
              quicksort(arr,low,pi-1);
              quicksort(arr,pi+1,high);
        }
    }
    int partition(int[]arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr,i,j);

               // int temp= arr[i];
                //arr[i]=arr[j];
                //arr[j]=temp;
            }
        }
        swap(arr,i+1,high);
        return i+1;

        // int temp= arr[i+1];
        // arr[i+1]=arr[high];
        // arr[high]=temp;

        // return i+1;
    }
   void swap(int[]arr,int a,int b){
             int temp=arr[a];
             arr[a]= arr[b];
             arr[b]=temp;
   }  
}


