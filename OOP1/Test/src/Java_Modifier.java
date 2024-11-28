public class Java_Modifier {
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Java_Modifier demo = new Java_Modifier();
        demo.setName("Ngoc");
        System.out.println("Name: " + demo.getName());
    }
}
