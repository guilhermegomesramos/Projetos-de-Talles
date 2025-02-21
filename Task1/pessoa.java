package Task1;

public class pessoa {
    String name;
    int age;
    String sex;

    void birthday() {
        age++;
    }

    void print() {
        System.out.println("Nome: " + name);
        System.out.println("idade: " + age);
        System.out.println("Sexo: " + sex);
        System.out.println("É adulto: " + isAdult());
        System.out.println("Você já pode votar? " + youVote());
        System.out.println("Você precisa se alistar obrigatoriamente no exercito? " + mandatoryEnlistment());
    }

    boolean isAdult() {
        if (age >= 18) { 
            return true;
        } else {
            return false;
        }
    }

    String youVote() {
        if (age >= 16) {
            return "Você já pode votar, mas não é obrigatório!";
        } if (age >= 18) {
            return "Você já pode votar e é obrigatório!";}
         else {
            return "Você ainda não pode votar!";
        }  
    }

    String mandatoryEnlistment() {
        if (age >= 18 && age <= 30 && sex == "M") {
            return "Você deve se alistar no exército!";
        } else {
            return "Você não precisa se alistar no exército!";
        }
    }
}