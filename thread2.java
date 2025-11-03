public class thread2 {
    public static void main(String[] args) {
        System.out.println("idharrrrr dekhooooo");
        Thread t1=new Thread(()->{
            System.out.println("hiiii");
        });
       
         Thread t2=new Thread(()->{
            System.out.println("helloooo");
             try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println("kyaaa kreeeee");
        });
        t1.start();
        t2.start();
    }
    
}
