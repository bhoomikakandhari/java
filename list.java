
// import java.util.ArrayList;

// public class list {
//     public static void main(String [] args){
//         ArrayList<String> arr=new ArrayList<>();
//         arr.add("hello");
//         arr.add("hii");
//         arr.add("byee");

//     }
// }

import java.util.TreeSet;
public class list{
    public static void main(String[]args){
       // ArrayList<String> arr=new ArrayList<>();
      //  arr.add("hello");
      //  arr.add("hii");
      //  arr.add("byee");
       // arr.set(2, "bonjour");
      //  arr.remove(0);
      //  arr.clear();
        //System.out.println(arr);
        int [] arr={1,2,2,55,67,44,89,66,55,3,4,3,2,11};
        TreeSet<Integer> set=new TreeSet<>();
        int count=0;
        for(int b : arr) {
            if(set.contains(b)){
                count++;
                
                break;
            }

            set.add(b);
        
            
        
        }
        System.out.println(count);
        
        

        //set.add("A");
       // set.add("B");
        //set.add("s");
        //set.add("b");
        

    }
}
    
