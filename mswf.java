class mswf{
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
    int[] count = new int[26];
    for(char c: letters){
        count[c - 'a']++;
    } 
    return backtrack(words,count,score,0);   
    }
    private int backtrack(String[]words, int[]count, int[]score, int index){
        if(index == words.length){
            return 0;
        }
        int res = backtrack(words, count, score, index+1);

        int wordScore = 0;
        boolean canform = true;
        String word = words[index];


        int[]used = new int[26];
        for(char ch: word.toCharArray()){
            int i = ch - 'a';
            used[i]++;

            wordScore += score[i];
            if(used[i] > count[i]){
                canform = false;
            }
        }

        if(canform){

            for(int i =0 ; i < 26; i++){
                count[i] -= used[i];
            }

            res = Math.max(res, wordScore + backtrack(words, count, score, index+1));

            for(int i = 0; i < 26; i++){
                count[i] += used[i];
            }
        }
        return res;
    }
}