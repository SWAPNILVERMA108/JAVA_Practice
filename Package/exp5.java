import java.util.Vector;
import java.util.ArrayList;

public class exp5 {

    public void vec() {
        Vector<Integer> v = new Vector<>();

        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);

        System.out.println(l);
    }

    public static void main(String[] args) {
        exp5 obj = new exp5();
        obj.vec();
    }
}