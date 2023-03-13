public class Xiaomi extends Brand{
    private String faceID;

    @Override
    public void print() {
        System.out.println("Xiaomi " + faceID);

    }

    public Xiaomi(String faceID) {
        this.faceID = faceID;
    }

    public String getFaceID() {
        return faceID;
    }
}
