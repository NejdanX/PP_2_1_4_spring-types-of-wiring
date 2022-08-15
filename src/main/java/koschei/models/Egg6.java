package koschei.models;


public class Egg6 {

    final private Needle7 needle;

    public Egg6(Needle7 needle) {
        // Через конструктор
        this.needle = needle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
