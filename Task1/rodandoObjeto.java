package Task1;

public class rodandoObjeto {
    public static void main(String[] args) {
        pessoa pessoa1 = new pessoa();
        pessoa1.name = "João";
        pessoa1.age = 17;
        pessoa1.sex = "M";
        
        pessoa1.print();



        pessoa pessoa2 = new pessoa();
        pessoa2.name = "Maria";
        pessoa2.age = 20;
        pessoa2.sex = "F";
        pessoa2.print();

        pessoa1.birthday();
        pessoa1.print();

    }
}
