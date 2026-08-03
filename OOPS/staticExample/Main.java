package OOPS.staticExample;

// i will be using the Human class from Human file
//we don't have to import coz present in same folder

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(22, "Vinni", 10000, false);
        Human h2 = new Human(24, " Kunal", 20000, true);
        System.out.println(h1.name); // Vinni
        System.out.println(h2.name);// Kunal

        // System.out.println(h1.population); // warning: The static field
        // Human.population should be accessed in a static way
        // that is we can access it with object's reference but by convension it's not
        // fair
        // that's why we accessed the static varibale using Human class
        System.out.println(Human.population); // its asking : what is the population of human class : 2

    }

    

}
