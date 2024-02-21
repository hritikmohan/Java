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
        //          variables can also be initialized
        String day = "saturday";
        String result = "";

        switch(day){
            case "saturday", "sunday" -> result = "7am";
            case "monday" -> result = "8am";
            default -> result = "6am";
        
        }
        System.out.println(result);

        // Alternative method to perform above operation:

        String day1 = "monday";
        String result1 = "";

        result1 = switch(day1){
            case "saturday", "sunday" -> "7am";
            case "monday" -> "8am";
            default -> "6am";
        };

        System.out.println(result1);
        
        // If -> is not to be used then the above operation can be performd as:
        //use ---  [: yield] in place of [:]

        String day2= "wednesday";
        String result2 = "";

        result2 = switch(day2){
            case "saturday", "sunday" : yield "7am";
            case "monday" : yield "8am";
            default : yield "6am";
        };

        System.out.println(result2);
    }
}