package ToyProducts.Models;

import ToyProducts.Toy;

public class AsianHelicopterToy implements Toy{
    private final Integer serialNumber;
    private final String type = "Helicopter";

    public AsianHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public void pack(){
        System.out.println("El " + type + " con número de serie: " + serialNumber.toString() + " está empaquetado.\n");
    }
    
    public void label(){
        System.out.println("El " + type + " con número de serie: " + serialNumber.toString() + " está etiquetado.\n");
    }
}