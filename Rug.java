
public class Rug {
    //shape: flat rectangle
    //calclates area and not volume of the object

    public String name;
    public double width;
    public double length;
    public String material;
    public double costRate;
    public String importing;

    public Rug(String name, double width, double length, String material, double costRate, String importing) {
        this.name = name;
        this.width = width;
        this.length = length;
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
        return costRate * length * width;
    }

    public double getBaseArea() {
        double area = length * width;
        return area;
    }

}
