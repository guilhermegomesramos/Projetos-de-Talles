package Task1.ex2;

public class testSwitch {
    public static void main(String[] args) {
        Switch switch1 = new Switch();
        
        System.out.println(switch1.checkLanp());
        
        switch1.press();
        System.out.println(switch1.checkLanp());
        
        switch1.press();
        System.out.println(switch1.checkLanp());
    }
}
