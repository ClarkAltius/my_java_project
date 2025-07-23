package ch01_variable_operator;

public class PracticeJava {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        double result = 2 * a + 3 * b - c;
        System.out.println(result);


        double height = 15;
        double base = 20;
        double TopLine = 10;
        double area = (base + TopLine) * height / 2.0;
        System.out.print("\nBase : " + base);
        System.out.print("\nTopLine : " + TopLine);
        System.out.print("\nHeight : " + height);
        System.out.println(area);

        double radius = 10.0;
        double pi = 3.14;
        double DoubleArea = pi * radius * radius;
        System.out.println(DoubleArea);

        // quesiton. I want to define glorious charge. so charge bonus has two components. value and duration. glorious charge doubles the duration.
        double ChargeBonus;
        double ChargeBonusDuration;
        String GloriousCharge;
        String GloriousChargeEffect;
        Boolean GloriousChargeApply;
        GloriousChargeEffect = "The charge bonus duration is doubled";
        ChargeBonus = 90;
        ChargeBonusDuration = 7;
        GloriousChargeApply = Boolean.TRUE;
        if (GloriousChargeApply = Boolean.TRUE) {
            ChargeBonusDuration = ChargeBonusDuration * 2;
            System.out.println(ChargeBonusDuration);

        }

    }
}

