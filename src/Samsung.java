public class Samsung extends Brand {
    private String model;

    @Override
    public void print() {
        System.out.println("Samsung " + model);
    }

    public Samsung(String model) {
        super();
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
