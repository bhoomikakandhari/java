class mythread extends Thread{
    public void run(){
        for(int i=0 ; i<=5; i++){
            System.out.println(getName() +"is running with priority" + getPriority());
            Thread.yield();
        }

    }
}
public class thread3 {
    public static void main(String[] args) {
        mythread t1=new mythread();
        mythread t2=new mythread();

        t1.setName("low priority Thread");
        t2.setName("high priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
    
}
