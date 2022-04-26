public class Main {

    public static void main(String[] args) {
        Lebewesen l1= new Hund();
        Person x = new Person();
        if(x.addTier(new Hund())) System.out.println("schön");
        if(x.addTier(l1)) System.out.println("super");
        else System.out.println("schade");

    }
}
