package ch02_control_statements;

public class AgeCheck {
    public static void main(String[] args) {
        String name = "Arthur Pendragon" ;
        int age = 455 ;
        int gender = 5 ; //input 1,2,3,4 <-- why?? the instructions ask for 4 possible answers. diversity? 주민등록번호 ㅋㅋㅋ ㅇㅋㅇㅋ 알겠어. 1, 3 = 남성. 1, 4 = 여성.
        String genderOutput = "Undecided" ;

        if(gender == 1 || gender == 3){
            genderOutput = "Male" ;
        } else if (gender > 4) {
             genderOutput = "Neither" ;
        } else {
            genderOutput = "Female" ; //why the 4 way gender tho? diversity?
        }

        if(age >= 19){
            System.out.println("Name : " + name + "\nGender : " + genderOutput + "\nAge : " + age + "\nVerdict : Adult");
        }else{
            System.out.println("Underage");
        }
    }
}
