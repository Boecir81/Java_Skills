
public class HelloWorld {
    // the entry point to our application is called the main method
    public static void main(String[] args) {

        String name = "Brian";
        int yourAge = 42;
        char letter = 'A';

        System.out.println("Coding Dojo");
        System.out.println("how is it," + name);
        System.out.println("is your age " + yourAge);
        System.out.println("and your and " + letter);
        // System.out.println(String.format("Hey %s, you look good for the age of %s,
        // Grade %s for your body", name,
        // yourAge, letter));

        System.out.printf("Hey %s, you look good for the age of %s, Grade %s for your body \n", name, yourAge,
                letter);
        System.out.println("my hometown is Aiken SC");

        if (yourAge >= 42) {
            System.out.println("oh dam your fine");
        } else if (yourAge == 41) {
            System.out.println("almost the right age");
        } else {
            System.out.println("sorry not old enough");
        }

    }

}
