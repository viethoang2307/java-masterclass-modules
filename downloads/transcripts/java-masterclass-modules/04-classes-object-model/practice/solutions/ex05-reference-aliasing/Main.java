public class Main {
    static final class Box {
        private int value;
        Box(int value) { this.value = value; }
        int value() { return value; }
        void setValue(int value) { this.value = value; }
        Box copy() { return new Box(value); }
    }

    static void aliasAndChange(Box box, int value) {
        box.setValue(value);
    }

    static Box copyAndChange(Box box, int value) {
        Box copy = box.copy();
        copy.setValue(value);
        return copy;
    }

    public static void main(String[] args) {
        Box box = new Box(10);
        aliasAndChange(box, 20);
        System.out.println(box.value());
    }
}

