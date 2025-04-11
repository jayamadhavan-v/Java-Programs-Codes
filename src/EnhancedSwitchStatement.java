public class EnhancedSwitchStatement {

    public static void main(String[] args) {
        switchMethod(11);
        String quarter = getQuarter("april");
        System.out.println(quarter);
    }

    public static String getQuarter(String month) {
               return switch(month.toUpperCase()){
                   case "JANUARY" , "FEBRUARY" , "MARCH" -> "1 st";
                   case "APRIL" , " MAY " , "JUNE" -> "2 st";
                   case "OCTOBER" , "NOVEMBER" , "DECEMBER" -> "3 st" ;
                   default -> {
                       String badResponse;
                       badResponse = month + "is bad ";
                       yield badResponse ;
                   }
               };
    }

    public static void switchMethod (int switchValue) {
        switch (switchValue) {
            case 1 -> System.out.println("case 1");
            case 2 -> System.out.println("case 2");
            case 3-> System.out.println("case 3");
            case 4 -> System.out.println("case 4");
            case 5, 6, 7 -> System.out.println(switchValue);
            default ->System.out.println(" poda dai");
        }
    }
}
