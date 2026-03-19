public class reversestring2 {
    public String reverseStr(String s, int k) {
        char [] charArray = s.toCharArray();
        int n = charArray.length;

        for(int i =0; i<n; i=i+2*k){
            int left= i;
            int right = Math.min(i+k-1,n-1);
            while(left<right){
                char temp = charArray[left];
                charArray[left]=charArray[right];
                charArray[right]=temp;
                left++;
                right--;
            }
        }
        return new String(charArray);
    }
}
