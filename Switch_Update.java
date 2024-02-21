public class Switch_Update {
    public static void main(String[] args) {
        
        // Two major updates in JAVA switch-case
        //      1. elimination of break statement
        int n = 5;

        switch(n%2){
            case 0 -> System.out.println("even");
            case 1 -> System.out.println("Odd");
            default -> System.out.println("ifkyk");
        }

        //      2. Strings can be used as expressions in switch
        String day = "saturday";
        String result = "";

        switch(day){
            case "saturday", "sunday" -> result = "7am";
            case "monday" -> result = "8am";
            default -> result = "6am";
        }

        System.out.println(result);
    }
}
