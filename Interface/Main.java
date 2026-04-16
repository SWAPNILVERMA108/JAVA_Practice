interface car{
    void start();
    void stop();
    void accelerate();
}

class dieselCar implements car{
    public void start(){
        System.out.println("it start by ignition");
    }
    public void stop(){
        System.out.println("It stop when engine is closed");
    }
    public void accelerate(){
        System.out.println("it accerlerate using extra fuel");
    }
}

class electricCar implements car{
    public void start(){
        System.out.println("it work using battery power");
    }
    public void stop(){
        System.out.println("It stop when power is cut");
    }
    public void accelerate(){
        System.out.println("it accerlerate using battery");
    }
}
public class Main{
    public static void main(String[] args) {
        car c1 = new dieselCar();
        car c2 = new electricCar();

        c1.start();
        c2.start();
        c1.stop();
        c2.stop();
        c1.accelerate();
    }
}