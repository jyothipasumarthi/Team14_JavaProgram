class Mobiles {
    void cal() {
        System.out.println("She is calling her mom");
    }
}
class Touch extends Mobiles {
    void visible() {
        System.out.println("Screen is damaged");
    }
}
class Keypad extends Touch {
    void press() {
        System.out.println("It is not working");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Keypad k=new Keypad();
        k.cal();
        k.visible();
        k.press();
    }
}