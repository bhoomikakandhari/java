 
import  java.util.Scanner;


public class array2 {
    public static void main(String[]args){

        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter value of arr");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int x=0;x<n;x++){
            System.out.println(""+arr[x]);
        }
        System.out.println("*****************************************"+(arr.length-1));

        int max=0;

        for(int j=0;j>arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
            }
            
    }
    System.out.println("the maximum value is :"+max);
}


   
        
    
}
