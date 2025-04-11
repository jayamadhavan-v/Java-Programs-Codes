public class TimeConversion {

    public static void main(String[] args) {

//        getDurationString(120,34);
        System.out.println(getDurationString(-3934));
        System.out.println(getDurationString(120,-341));
        System.out.println(getDurationString(3934));
        System.out.println(getDurationString(120,41));
    }

    public static String getDurationString(int second) {
        if (second<0  ){
            return "Invalid data for time(" + second +") , A must be positive integer value " ;
        }

        return getDurationString( second / 60, second % 60);

    }
    public static String getDurationString(int minute, int second) {
        if (second<0 || minute <0){
            return "Invalid data for time";
        }
        if( second >59) {
            return "Invalid data for seconds (" + second + ") , must be between 0 to 59";
        }
        int hour = minute /60 ;
        int remainingSeconds = second % 60;
        int remainingMinutes = minute %60;
        return ( hour + "hrs " + remainingMinutes + "min " + remainingSeconds  + "sec");
    }


}

