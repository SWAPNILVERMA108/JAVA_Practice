interface Phone {
    void makeCall();
    void sendSMS();
}

interface Camera {
    void takePhoto();
    void recordVideo();
}

class SmartPhone implements Phone, Camera {

    public void makeCall() {
        System.out.println("Calling...");
    }

    public void sendSMS() {
        System.out.println("Sending SMS...");
    }

    public void takePhoto() {
        System.out.println("Taking Photo...");
    }

    public void recordVideo() {
        System.out.println("Recording Video...");
    }
}

public class Main4d {
    public static void main(String[] args) {

        SmartPhone obj = new SmartPhone();
        System.out.println("Name: Swapnil Verma");
        System.out.println("Roll No: 2400320101154");
        obj.makeCall();
        obj.sendSMS();
        obj.takePhoto();
        obj.recordVideo();
    }
}
