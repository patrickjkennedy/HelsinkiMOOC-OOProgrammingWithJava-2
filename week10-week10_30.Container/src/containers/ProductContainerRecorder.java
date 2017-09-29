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
    public void addToTheContainer(double amount) {
        if (amount < 0) {
            return;
        }
        if(amount <= this.getCurrentCapacity()){
            super.addToTheContainer(amount);
            this.history.add(getCurrentCapacity());
        } else{
            this.history.add(getVolume());
        }
    }

}
