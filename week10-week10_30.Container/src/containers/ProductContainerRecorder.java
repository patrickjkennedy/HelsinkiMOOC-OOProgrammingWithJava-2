/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author pkennedy
 */
public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory history = new ContainerHistory();

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        this.history.add(initialVolume);
    }

    public String history() {
        return this.history.toString();
    }

    @Override
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        this.history.add(super.getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount) {
        this.history.add(super.getVolume() - amount);
        return super.takeFromTheContainer(amount);
    }

    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + this.history.maxValue());
        System.out.println("Smallest product amount: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
        System.out.println("Greatest change: " + this.history.greatestFluctuation());
        System.out.println("Variance: " + this.history.variance());
    }
    
}
