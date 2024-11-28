public class Demo_contructor {
    public int x;
    public Demo_contructor(){
        System.out.println("Java Contructor called.");
        x = 5;
    }

    public static void main(String[] args) {
        Demo_contructor demo = new Demo_contructor();
        System.out.println("Value of x is: " + demo.x);
    }
}

