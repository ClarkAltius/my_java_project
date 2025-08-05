package ch05_package_inheritance.animals;

import ch02_control_statements.Switches101;

public class AnimalMain {
    public static void main(String[] args) {

        //the main class where I'll be making the objects and executing the methods.

        Animal05[] animals = {
                new Goldfish05("Goldfish", 7,"Clear Water",30,2),
                new Lion05("Lion", 12, "Savanah", 70,4),
                new Eagle05("Eagle",30,"Air",90,2)
        };
        for (int i = 0; i < animals.length; i++) { //this is the loop
            animals[i].showInfo(); //method in each subclass overrides the one in superclass
            if (animals[i] instanceof Goldfish05){ //this conditional runs the method present in only the subclass
                ((Goldfish05) animals[i]).swim();
            } else if (animals[i] instanceof Lion05) {
                ((Lion05) animals[i]).run();
            }else if(animals[i] instanceof Eagle05) {
                ((Eagle05) animals[i]).fly();
            }
            System.out.println("________________");
        }
    }
}
