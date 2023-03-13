public class Laptop extends Product{
    private int ram;

    @Override
    public void print() {
        System.out.println("Laptop " + ram);

    }

    public Laptop(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }
}
