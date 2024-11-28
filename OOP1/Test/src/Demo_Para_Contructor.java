public class Demo_Para_Contructor {
    public int wheels;
    public Demo_Para_Contructor(int wheels){
        this.wheels = wheels;
        System.out.println("The wheels has been constructed: "+wheels);
    }

    public static void main(String[] args) {
        Demo_Para_Contructor demo = new Demo_Para_Contructor(1);
        Demo_Para_Contructor demo2 = new Demo_Para_Contructor(2);

    }
}
