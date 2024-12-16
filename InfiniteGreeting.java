       public class InfiniteGreeting {
    
            // Thread to print Good Morning
             class GoodMorningThread extends Thread {
                public void run() {
                    while (true) {
                        System.out.println("Good Morning");
                        try {
                            Thread.sleep(1000); // Sleep for 1 second
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }
                    }
                }
            }
        
            // Thread to print Good Afternoon
             class GoodAfternoonThread extends Thread {
                public void run() {
                    while (true) {
                        System.out.println("Good Afternoon");
                        try {
                            Thread.sleep(1000); // Sleep for 1 second
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }
                    }
                }
            }
        
            // Thread to print Good Evening
             class GoodEveningThread extends Thread {
                public void run() {
                    while (true) {
                        System.out.println("Good Evening");
                        try {
                            Thread.sleep(1000); // Sleep for 1 second
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }
                    }
                }
            }
            //thread to print good night
            class goodnightThread extends Thread{
                public void run()
                {
                    while(true)
                    {
                        System.out.println("good night");
                        try{
                            Thread.sleep(1000);
                        }
                        catch(InterruptedException e)

                        {
                            System.out.println(e);
                        }
                    }
                }
            }
        
            public static void main(String[] args) {
                InfiniteGreeting ig=new InfiniteGreeting();
                // Create and start the threads
                Thread morningThread = ig.new GoodMorningThread();
                Thread afternoonThread =ig. new GoodAfternoonThread();
                Thread eveningThread =ig.new GoodEveningThread();
                Thread nightThread=ig.new goodnightThread();
        
                morningThread.start();
                afternoonThread.start();
                eveningThread.start();
                nightThread.start();
            }
        }
    
