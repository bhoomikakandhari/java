public class reverse {
    // public static String reverseString(String s){
    //     return new 
    //     StringBuilder(s).reverse().toString();

    // }
    // public static void main(String[] args) {
    //     System.out.println(reverseString("bhoomika"));
    // }
    public static  int findmissing(int[]arr,int n){
        int total = n*(n+1)/2;
        int sum = 0;
        for(int num:arr)sum+=num;
        return total-sum;

    } 
    public static void main(String[]args){
        int[]arr={1,2,4,5};
        System.out.println(findmissing(arr,5));

    }
        
    
}
