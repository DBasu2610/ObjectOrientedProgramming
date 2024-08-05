//understanding concepts on packages: packages are basically folders you use to store files in
//they are stored in a hierarchical method and names of files can be same under different packages
//mostlyObjectOrientedProgramming.packagesibility and stuff
package packages;

import static packages.Message.message2;

public class Greetings {
    public static void main(String args[]) {
        System.out.println("Hello World!");

        message2(); //ALTHOUGH if message2 was a private method it could not be imported
        
    }
}
