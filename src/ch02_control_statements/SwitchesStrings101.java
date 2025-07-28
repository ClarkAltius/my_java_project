package ch02_control_statements;

public class SwitchesStrings101 {
    public static void main(String[] args) {
        String month = "Halleluyahnuary";
        int month_no = 0;

        switch (month) {
            case "January":
                month_no = 1;
                break;
            case "February":
                month_no = 2;
                break;
            case "March":
                month_no = 3;
                break;
            case "April":
                month_no = 4;
                break;
            case "May":
                month_no = 5;
                break;
            case "June":
                month_no = 6;
                break;
            case "July":
                month_no = 7;
                break;
            case "August":
                month_no = 8;
                break;
            case "September":
                month_no = 9;
                break;
            case "October":
                month_no = 10;
                break;
            case "November":
                month_no = 11;
                break;
            case "December":
                month_no = 12;
                break;
            default:
                month = "Invalid Month";
                break;
        }
        if (month == "Invalid Month") {
            System.out.println(month);
                } else {
            System.out.println(month + " is " + month_no + "월 in Korean");
        }

    }
}
