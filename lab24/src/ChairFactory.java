public abstract class ChairFactory {
    public abstract Chair createChair(String type);

    public static ChairFactory getFactory() {
        // Возвращаем конкретную реализацию фабрики
        return new ConcreteChairFactory();
    }

    private static class ConcreteChairFactory extends ChairFactory {
        @Override
        public Chair createChair(String type) {
            switch (type.toLowerCase()) {
                case "victorian":
                    return new VictorianChair();
                case "multifunctional":
                    return new MultifunctionalChair();
                case "magic":
                    return new MagicChair();
                default:
                    throw new IllegalArgumentException("Unknown chair type: " + type);
            }
        }
    }
}

