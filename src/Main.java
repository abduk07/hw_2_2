public class Main {
    public static void main(String[] args) {
        Printable samsung = createObject("samsung");
        Printable xiaomi = createObject("xiaomi");
        Printable apple = createObject("apple");
        samsung.print();
        xiaomi.print();
        apple.print();
    }
    public static Printable createObject(String className) {
        Apple apple = new Apple(77);
        Samsung samsung = new Samsung("s23");
        Xiaomi xiaomi = new Xiaomi("yes");
        Phone phone = new Phone("middle");
        Laptop laptop = new Laptop(512);
        Tablet tablet = new Tablet("red");

        switch (className){
            case "apple":
                return apple;
            case "samsung":
                return samsung;
            case "xiaomi":
                return xiaomi;
            case "phone":
                return phone;
            case "laptop":
                return laptop;
            case "tablet":
                return tablet;
       }
       return  null;
    }
}

