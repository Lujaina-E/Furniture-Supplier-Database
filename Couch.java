public class Couch {
    //shape: rectangular prism

    public String name;
    public double height;
    public double length;
    public double width;
    public String material;
    public double costRate;
    public String importing;

    public Couch(String name, double height, double length, double width, String material, double costRate, String importing) {
        this.name = name;
        this.height = height;
        this.length = length;
        this.width = width;
        this.material = material;
        this.costRate = costRate;
        this.importing = importing;
    }

    public String getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }
    
    public double getBaseArea(){
        double baseArea = length * width;
        return baseArea;
    }

    public String getImportLocation() {
        return importing;
    }

    public double cost() {
        return (costRate * height * length * width);
    }

    public double getVolume() {
        double v = height * length * width;
        return v;
    }

    public double getSurfaceArea() {
        double sa = (2 * width * height) + (2 * width * length) + (2 * height * length);
        return sa;
    }
}