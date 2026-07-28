class Box {
    double length, width, height;

    Box() {
        length = width = height = -1;
    }

    Box(double len) {
        length = width = height = len;
    }

    Box(double len, double wid, double ht) {
        length = len;
        width = wid;
        height = ht;
    }

    void volume() {
        System.out.println(length * width * height);
    }
}

class ConstructorDemo {
    public static void main(String args[]) {
        Box obj1 = new Box();
        System.out.print("Volume of obj1: ");
        obj1.volume();

        Box obj2 = new Box(5);
        System.out.print("Volume of obj2: ");
        obj2.volume();

        Box obj3 = new Box(2, 3, 4);
        System.out.print("Volume of obj3: ");
        obj3.volume();
    }
}