package Patterns.creational.FactoryPattern.Example2;

public class CoinFactory {

    public static Coin getCoin(CoinType type) {
        return type.getConstructor().get();
    }
}
