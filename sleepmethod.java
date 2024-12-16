public class sleepmethod {
    public static void main(String args[])
    {
        System.out.println("thread is started");
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            System.out.println("interrupted");
        }
        System.out.println("thread resumed");
    }
    
}
