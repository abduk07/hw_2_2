public class Phone extends Product {
    private String size;


    @Override
    public void print() {
        System.out.println("Phone " + size);

    }

    public Phone(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}

