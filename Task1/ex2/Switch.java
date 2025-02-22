package Task1.ex2;

public class Switch {
    boolean connected = false;
    boolean press() {
        if (connected) {
            connected = false;
            return false;
        } else {
            connected = true;
            return true;
        }
    }
    String checkLanp () {
        if (connected) {
            return "A luz está acesa";
        } else {
            return "A luz está apagada";
        }
    }
}
