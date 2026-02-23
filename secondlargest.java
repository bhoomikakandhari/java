public class secondlargest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int max=0;
        int secmax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            } 
            else if(secmax>arr[i] && secmax!=max){
                secmax=arr[i];
            }
        }
        System.out.println(secmax);
    }
}
