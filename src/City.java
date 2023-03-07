public class City {
    private String name;       // наименование города

    private String region;     // регион

    private String district;   // федеральный округ

    private String population;   // количество жителей города

    private String foundation;    // дата основания или первое упоминание

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation=" + foundation +
                '}';
    }

    public City(String name, String region, String district, String population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;


    }
}
