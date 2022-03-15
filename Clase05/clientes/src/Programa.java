public class Programa {

    public static void main(String[] args) {

        Cliente cl1 = new Cliente(1,"Juan");

        ClienteLocal cl2 = new ClienteLocal(2, "Ana", 15);

        ClienteInternet cl3 = new ClienteInternet(3, "Jorge", "jor@ge.com", "9 de julio 23234");

        System.out.println(cl1.toString());
        System.out.println(cl2.toString());
        System.out.println(cl3.toString());



    }
}
