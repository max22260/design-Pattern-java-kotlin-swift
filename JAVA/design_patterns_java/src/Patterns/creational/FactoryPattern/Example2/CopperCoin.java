package Patterns.creational.FactoryPattern.Example2;

public class CopperCoin implements  Coin{

    static final String DESCRIPTION = "This is a copper coin.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
