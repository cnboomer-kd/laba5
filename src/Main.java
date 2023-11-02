public class Main
{
    public static void main(String[] args)
    {
        Seasons myFavoriteSeason = Seasons.summer;
        System.out.println("Мое любимое время года " + myFavoriteSeason);
        switch (myFavoriteSeason)
        {
            case winter:
                System.out.println("Я люблю зиму");
                break;
            case spring:
                System.out.println("Я люблю весну");
                break;
            case summer:
                System.out.println("Я люблю лето");
                break;
            case autumn:
                System.out.println("Я люблю осень");
                break;
        }
        for (Seasons season : Seasons.values())
        {
            System.out.println(season + " имеет среднюю температуру " + season.getAverageTemperature() + " градусов. Это " + season.getDescription() + ".");
        }
    }
}