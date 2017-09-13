package validation;

public class Calculator {

    public int multiplication(int fromInteger) {
        if (fromInteger < 0){
            throw new IllegalArgumentException("Integer needs to be positive.");
        }

        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0){
            throw new IllegalArgumentException("Inputs must be positive.");
        }
        
        if (subsetSize > setSize){
            throw new IllegalArgumentException("Subset needs to be larger than set size.");
        }

        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}
