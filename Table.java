public class Table {

    //shape:cylinder
    public String name;
    public double height;
    public double radius;
    public String material;
    public double costRate;
    public String importing;

    public Table(String name, double height, double radius, String material, double costRate, String importing) {
        this.name = name;
        this.height = height;
        this.radius = radius;
        this.material = material;
        this.costRate = costRate;
        this.importing = importing;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getImportLocation() {
        return importing;
    }
    

    public double cost() {
        return costRate * Math.PI * radius * radius * height;
    }

    public double getVolume() {
        double v = Math.PI * radius * radius * height;
        return v;
    }

    public double getSurfaceAreaWithTop() {
        double sa = (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
        return sa;
    }

    public double getBaseArea(){
        double baseArea = radius * radius * Math.PI;
        return baseArea;
    }
    public double getSurfaceAreaWithoutTop() {
        double sa = (Math.PI * radius * radius) + (2 * Math.PI * radius * height);
        return sa;
    }
}