
import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<Integer , Integer> map=new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 5);
       // System.out.println(map.containsKey("bhooms"));
       // System.out.println(map.containsValue(2));
       // map.remove("bhooms");
       for(int key :map.keySet()){
       System.out.println(key);
       // if(key>2){
        //System.out.println(key);
          //  break;
        }
         
       }

    }
    

