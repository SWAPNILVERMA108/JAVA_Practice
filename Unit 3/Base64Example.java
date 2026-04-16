import java.util.Base64;


public class Base64Example {
    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getEncoder();
        String str = encoder.encodeToString("ABES Engineering College".getBytes());
        System.out.println("Encoded String: " + str);
        Base64.Decoder decoder = Base64.getDecoder();
        String dstr = new String(decoder.decode(str));
        System.out.println("decoded string: " + dstr);
    }
    

}
