import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
    File file = new File("Задача ВС Java Сбер.csv");
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(parseCity(line));
        }

    }

    private static City parseCity(String line) {
        String[] data = line.split(";");
        String name = data[0];
        String region = data[1];
        String district = data[2];
        String population = data[3];
        String foundation =  data[4];
        return new City(name, region, district, population, foundation);
        }

    }



