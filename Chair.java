
public class Chair {
    //shape: cube

    public String name;
    public double sideLength;
    public String material;
    public double costRate;
    public String importing;

    public Chair(String theName, double theSideLength, String theMaterial, double theCostRate, String theImport) {
        name = theName;
        sideLength = theSideLength;
        material = theMaterial;
        costRate = theCostRate; //cost rate refers to material since different materials will result in different 
        //costs total for the item. Cost rate is in dollars per metre squared of material used.
        importing = theImport;
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
    public double getSurfaceArea() {
        double sa = 6 * (sideLength * sideLength);
        return sa;
    }

    public double getBaseArea(){
        double baseArea = sideLength * sideLength;
        return baseArea;
    }
    public double cost() {
        return costRate * 6 * (sideLength * sideLength);
    }

    public double getVolume() {
        double v = sideLength * sideLength * sideLength;
        return v;
    }

    

}//end class