package ch04_class;
//Step 1: Declare Class
public class Person01 {
    String nationality;
    String name;
    double height;
    double weight;
    String hobby;
    String blood;
    //Result Type, Method Name

    //Defining a Method. We need the name, variable and the return.
    String showGenderInfo(int resident_no){  //The starting String specifies that the method will return a string, and the (int resident_no) specifies that the input the method will receive is an integer.
        String gender = "";
        if(resident_no == 1 || resident_no == 3){
            gender = "Male";
        }else{
            gender = "Female";
        }
        String message = name + " is " + gender;
        return message ;
        }
    String showBmiInfo(){
        double newHeight = height / 100.0;
        double bmiRate = weight / (newHeight * newHeight);
        String bmi = ""; //we store the result here.
        if (bmiRate >= 25.00) {
            bmi = "Obese";
        }else if (bmiRate >= 23.00) {
            bmi = "Overweight";
        }else if (bmiRate >= 18.50) {
            bmi = "Average";
        }else {
            bmi = "Under Weight";
        }
        String message = name + " has the bmi rate of : " + bmiRate + ". This means they are : " + bmi;
        return message;
    }
    void display(){
        System.out.println(name + "'s informations.");
        System.out.println("Nationality : " + nationality);
        System.out.println("Name : " + name);
        System.out.println("Height : " + height + "cm");
        System.out.println("Weight : " + weight + "kg");
        System.out.println("Blood : Type " + blood);
    }
}
