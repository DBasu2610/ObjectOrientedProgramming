package properties.inheritance;

public class Inhertitance {
    public static void main(String[] args) {
        Box box = new Box(2, 3, 4);
        Box box2 = new Box(box);

        System.out.println(box.length + " " + box.height + " " + box.width);
        System.out.println(box2.length + " " + box2.height + " " + box2.width);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2, 3, 3, 4);

        System.out.println(box3.height + " " + box3.weight);
        System.out.println(box4.height + " " + box4.weight + " " + box4.length + " " + box4.width);

        //Box box5 = new BoxWeight(2, 3, 4, 8);

        // System.out.println(box5.width + " " + box5.weight); //gives an error because
        // type of reference variable gives what members can be accesed not the object

        
    }

}
