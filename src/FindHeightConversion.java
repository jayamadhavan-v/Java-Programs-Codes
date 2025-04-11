public class FindHeightConversion {
    public static void main(String[] args) {

        System.out.println(" 5 ft 8 inch = " + convertToInch(5,8) + " cm");
        System.out.println("  8 inch = " + convertToCentimeters( 8)+ " cm");
    }
    public static double convertToCentimeters(int inch) {
        ///  formulae 1 inch = 2.54 cm
        return (inch*2.54);
    }
    public static double convertToInch(int feet, int inch){
        ///  formulae 1 foot = 12 inch

        return convertToCentimeters((feet * 12)+inch);
    }
}
