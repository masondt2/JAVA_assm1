public class Company{
    static String domainname;
    public Company(){
        domainname = "Hellongoc.com";
    }
}

class Main1{
    public static void main(String[] args) {
        //Company com1 = new Company();
        System.out.println("Domain Name is: " + Company.domainname);
    }
}
