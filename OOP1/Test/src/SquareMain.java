public class SquareMain {
    public static int Square(){
        return 10*10;
    }
    public int testvar = Square();
    public static void main(String[] args) {
        int result=Square();
        System.out.println("Call method square: "+result);

    }
}
