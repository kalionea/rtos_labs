public class Main {
    public static void main(String[] args) {
        Season favoriteSeason = Season.AUTUMN;
        System.out.println("Information about my favourite Season:");
        System.out.println("It is " + favoriteSeason.name());
        System.out.println("Average temperature is  " + favoriteSeason.getAverageTemperature() + "\n");
        printInfo(favoriteSeason);

        for (Season season : Season.values()) {
            System.out.println(season.name() + " has average temperature of: " + season.getAverageTemperature() + " and is described as: " + season.getDescription());
        }
    }

    private static void printInfo(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}