public class Apple extends Brand{
    private int serialNumber;


    public Apple(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public void print() {
        System.out.println("Apple number " + serialNumber);

    }
}
