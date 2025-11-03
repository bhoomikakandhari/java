
//class mythread extends Thread{
   // public void run(){
      //  System.out.println("hello");
     //   try {
     //       Thread.sleep(2000);
     //   } catch (Exception e) {
     //   }
      //  System.out.println("hiii");
   // }
//}
class downloadfile{
    public static void file(String file){
        for(int i=0; i<=5; i++){
            System.out.println(file + "downloading...." + (i*20) +"%");
        
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        
    }
    System.out.println(file + "done");
}
}
public class multithreading {
    public static void main(String[] args) {
        downloadfile bhooms=new downloadfile();
       bhooms.file("file 1");
        bhooms.file("file 2");
        //mythread t1=new mythread();
       // t1.start();
       // for(int i=0; i<=5; i++){
       //     System.out.println("hiii");
       // }
        
    }
    
}
