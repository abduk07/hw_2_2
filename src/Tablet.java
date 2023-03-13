public class Tablet extends  Product{
    private String color;

    @Override
    public void print() {
        System.out.println("Tablet " + color);
    }

    public Tablet(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
