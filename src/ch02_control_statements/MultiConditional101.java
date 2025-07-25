package ch02_control_statements;

public class MultiConditional101 {
    public static void main(String[] args) {
        int temperature = 99 ;
        String message ;
        //35, heatwave warning, 30, hot, 20, pleasant, 10 cool, otherwise cold.
        if(temperature >= 35) {
            message = "Heatwave Coming!" ;
        } else if (temperature >= 30 && temperature < 35) {
            message = "Hot Day Today." ;

        } else if (temperature >=20 && temperature < 30) {
            message = "Pleasant Day to you sir!" ;
        } else if (temperature >= 10 && temperature < 20) {
            message = "It's a bit nippy today ain't it mate?" ;
        } else {
            message = "They say they're freezing to death. Here in Greenland we call it Tuesday" ;
        }
        System.out.println(message);
    }
}
