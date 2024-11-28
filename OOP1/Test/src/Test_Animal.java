public class Test_Animal {
    public int legcount;

    public void Display(){
        System.out.println("I'm a animal!!!");
        System.out.println("I have " +legcount+ " legs");
    }
}

class Dog extends Test_Animal{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.Display();
    }
}


class Main11{
    public static void main(String[] args) {
        Test_Animal test1 = new Test_Animal();
        test1.legcount = 4;
        test1.Display();
    }
}