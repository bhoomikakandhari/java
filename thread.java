
class withdrawl extends Thread{
    static int totalbalance=1000;
    int amount;
    public withdrawl(int amount){
        this.amount=amount;
    }   
     public void run(){
        synchronized (withdrawl.class) {
            if(totalbalance>=amount){
            System.out.println("is going to withdrawl"+ " "+ amount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            totalbalance-=amount;
            System.out.println("remaining moneyyy"+ " "+ totalbalance);
        }
        else{
            System.out.println("sorry the account is out of bakance");
        } 
        }
       
    }
}
    public class thread {
        public static void main(String[] args) {
            withdrawl w1=new withdrawl(800);
        withdrawl w2=new withdrawl(500);
        w1.start();
        w2.start();
        }
        
    
}
