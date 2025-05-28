
import java.util.HashMap;

public class map1 {
    public static void main(String[] args) {
       // String str1="programming is fun and fun is a programming";
       //String[] newstr= str1.split(" ");
       String str="aaabcccccdddeeee";
       char[] ch= str.toCharArray();
        HashMap<Character, Integer> map=new HashMap<>();
        for(char i:ch){
            map.put(i, map.getOrDefault(i, 0)+1);
            
        }
            
        System.out.println(map);
        map.forEach((key,value)->{
            if(value==1){
System.out.println(key);
            }
        });
       // for(String str:newstr) {
         //   map.put(str, map.getOrDefault(str, 0)+1);

        
            
        
       // System.out.println(map);
    }
}

        //for(char i:ch){
          //  map.put(i, map.getOrDefault(i, 0)+1);
          //int count=0;
          //for(char i:ch){
           // map.put(i, map.getOrDefault(i, count)+1);
           // if(map.containsKey(i)){
              //  count++;
               // break;
           // }
   
        
               
           
               
        
        

          

        
       