import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Scanner;

@Retention(RetentionPolicy.RUNTIME)
@interface Game {
    String name();
    String type();
}

@Game(name = "Cricket", type = "Outdoor")
class Cricket {}

@Game(name = "Chess", type = "Indoor")
class Chess {}

public class AnnotationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dates = new String[5];
        System.out.println("Enter 5 schedule dates:");
        for(int i = 0; i < 5; i++) {
            dates[i] = sc.nextLine();
        }

        System.out.println("Enter game type (Indoor/Outdoor):");
        String inputType = sc.nextLine();

        Class<?>[] games = {Cricket.class, Chess.class};

        for(Class<?> g : games) {
            Game obj = g.getAnnotation(Game.class);
            if(obj.type().equalsIgnoreCase(inputType)) {
                System.out.println("Game Name: " + obj.name());
                System.out.println("Second Schedule Date: " + dates[1]);
            }
        }
    }
}