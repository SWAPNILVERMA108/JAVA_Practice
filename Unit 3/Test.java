public class Test {
    public static void main(String[] args) {
        // new Thread(new Runnable() {
        //     @Override
        //     public void run(){
        //     System.out.println("new thread is created ");
        //     }
        // }).start();

        new Thread(()-> {
            System.out.println("thread is created ");
        }).start();
    }
    
}
