package example.hadlak;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator {

    // == fields ==
    private int maxNumber = 100;
    private final Random random = new Random();
    int randomNumber;

    // == public methods ==
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
