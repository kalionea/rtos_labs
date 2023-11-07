public enum Season {
    SPRING(13) {
        @Override
        public String getDescription() {
            return "Прохладное время года";
        }
    },
    SUMMER(27) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(5) {
        @Override
        public String getDescription() {
            return "Прохладное время года";
        }
    },
    WINTER(-15) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };

    private int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Время года";
    }
}

