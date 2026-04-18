public class switch1 {
    public static void main(String[] args) {
        int day  =1;
        String result = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "wednesday";
            default -> "Invalid";
        };
        System.out.println(result);
    }
    
}
