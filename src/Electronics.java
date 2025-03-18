public class Electronics extends Product{
    private long id;
    private String brand;
    private String colour;
    private boolean isNew;
    private int memory;

    public Electronics() {
    }

    public Electronics(long id, String brand, String colour, boolean isNew, int memory) {
        this.id = id;
        this.brand = brand;
        this.colour = colour;
        this.isNew = isNew;
        this.memory = memory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", isNew=" + isNew +
                ", memory=" + memory +
                '}';
    }
}
