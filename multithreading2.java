
class mythread extends Thread{
    String filename;
    public mythread( String filename){
        this.filename=filename;
    }
   public void run(){
    for(int i=0; i<=5; i++){
            System.out.println( filename + "downloading...." + (i*20) +"%");
        
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        
    }
    System.out.println(filename + "done");
        
 }
}

//class downloadfile extends Thread{

   // public static void file(String file){
     //   for(int i=0; i<=5; i++){
       //     System.out.println(file + "downloading...." + (i*20) +"%");
        
       // try {
        //    Thread.sleep(2000);
       // } catch (Exception e) {
       // }
        
   // }
   // System.out.println(file + "done");
//}
//}
///public class multithreading {
    //public static void main(String[] args) {
       // downloadfile bhooms=new downloadfile();
      // bhooms.file("file 1");
       // bhooms.file("file 2");
        //mythread t1=new mythread();
       // t1.start();
       // for(int i=0; i<=5; i++){
       //     System.out.println("hiii");
       // }
        
  //  }
    
//}
public class multithreading2 {
    public static void main(String[] args) {

      mythread t1=new mythread("file A");
      mythread t2=new mythread("file B");
      t1.start();
      t2.start();

    }
}


