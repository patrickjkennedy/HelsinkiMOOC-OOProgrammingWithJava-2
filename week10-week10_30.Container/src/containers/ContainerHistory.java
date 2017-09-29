/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.*;

/**
 *
 * @author pkennedy
 */
public class ContainerHistory {

    private final ArrayList<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        return Collections.max(history);
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        return Collections.min(history);
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double sum = 0;

        for (double d : this.history) {
            sum += d;
        }
        return sum / (double) this.history.size();
    }

    public double greatestFluctuation() {

        if (this.history.isEmpty() || this.history.size() == 1) {
            return 0;
        } else {

            double greatestFluctuation = Math.abs(this.history.get(0) - this.history.get(1));

            for (int i = 0; i < this.history.size() - 1; i++) {

                double fluctuation = Math.abs(this.history.get(i) - this.history.get(i + 1));

                if (fluctuation > greatestFluctuation) {
                    greatestFluctuation = fluctuation;
                }
            }
            return greatestFluctuation;
        }
    }

    public double variance() {

        if (this.history.isEmpty() || this.history.size() == 1) {
            return 0;
        } else {

            double numerator = 0;
            double denominator = this.history.size() - 1;

            for (int i = 0; i < this.history.size(); i++) {
                numerator += (this.history.get(i) - this.average()) * (this.history.get(i) - this.average());
            }
            return numerator / denominator;
        }
    }
}
