public class reorganizestring {
    public String reorganizeString(String s) {
        int[] charCount = new int[26];
        for(char c : s.toCharArray()){
            charCount [ c - 'a']++;
        }
        int maxCount=0;
        char maxChar=0;
        for(int i=0; i<26; i++){
            if(charCount[i]>maxCount){
                maxCount = charCount[i];
                maxChar = (char) (i + 'a');
            }
        }
        if(maxCount > (s.length()+1)/2){
            return "";
        }
        char [] result = new char[s.length()];
        int index = 0;


        while(charCount[maxChar - 'a']>0){
            result[index] = maxChar;
            index = index+2;
            charCount[maxChar - 'a']--;
        }

        for(int i =0; i<26; i++){
            while(charCount[i]>0){
                if(index >= result.length ){
                    index=1;
                }
                result[index]= (char) (i + 'a');
                index= index+2;
                charCount[i]--;
            }
        }
        return new String(result);
    }
}
