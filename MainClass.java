public class MainClass {
    public static void main(String[] args) {
        Names class1 = new Names();
        Fruits class2 = new Fruits();
        Cities class3 = new Cities();
        Animals class4 = new Animals();
        Languages class5 = new Languages();
        Movies class6 = new Movies();
        Cars class7 = new Cars();
        Countries class8 = new Countries();
        Planets class9 = new Planets();
        ProgrammingLanguages class10 = new ProgrammingLanguages();
        
        class1.displayArrays();
        class2.displayArrays();
        class3.displayArrays();
        class4.displayArrays();
        class5.displayArrays();
        class6.displayArrays();
        class7.displayArrays();
        class8.displayArrays();
        class9.displayArrays();
        class10.displayArrays();
    }
}

class Names {
    String[] names = {"Alice", "Bob", "Charlie"};
    int[] ages = {25, 30, 35};
    long[] phoneNumbers = {1234567890L, 2345678901L, 3456789012L};
    char[] grades = {'A', 'B', 'C'};
    
    void displayArrays() {
        System.out.println("Names:");
        System.out.println("Names: " + java.util.Arrays.toString(names));
        System.out.println("Ages: " + java.util.Arrays.toString(ages));
        System.out.println("Phone Numbers: " + java.util.Arrays.toString(phoneNumbers));
        System.out.println("Grades: " + java.util.Arrays.toString(grades));
		System.out.println("\n");
    }
}

class Fruits {
    String[] fruits = {"Apple", "Banana", "Cherry"};
    int[] quantities = {10, 20, 30};
    long[] prices = {100L, 200L, 300L};
    char[] sizes = {'S', 'M', 'L'};
    
    void displayArrays() {
        System.out.println("Fruits:");
        System.out.println("Fruits: " + java.util.Arrays.toString(fruits));
        System.out.println("Quantities: " + java.util.Arrays.toString(quantities));
        System.out.println("Prices: " + java.util.Arrays.toString(prices));
        System.out.println("Sizes: " + java.util.Arrays.toString(sizes));
		System.out.println("\n");
    }
}

class Cities {
    String[] cities = {"New York", "Los Angeles", "Chicago"};
    int[] populations = {8419000, 3980400, 2716000};
    long[] areas = {789L, 503L, 234L};
    char[] initials = {'N', 'L', 'C'};
    
    void displayArrays() {
        System.out.println("Cities:");
        System.out.println("Cities: " + java.util.Arrays.toString(cities));
        System.out.println("Populations: " + java.util.Arrays.toString(populations));
        System.out.println("Areas: " + java.util.Arrays.toString(areas));
        System.out.println("Initials: " + java.util.Arrays.toString(initials));
		System.out.println("\n");
    }
}

class Animals {
    String[] animals = {"Cat", "Dog", "Elephant"};
    int[] lifespans = {15, 13, 60};
    long[] weights = {5L, 20L, 5000L};
    char[] habitats = {'H', 'D', 'J'};
    
    void displayArrays() {
        System.out.println("Animals:");
        System.out.println("Animals: " + java.util.Arrays.toString(animals));
        System.out.println("Lifespans: " + java.util.Arrays.toString(lifespans));
        System.out.println("Weights: " + java.util.Arrays.toString(weights));
        System.out.println("Habitats: " + java.util.Arrays.toString(habitats));
		System.out.println("\n");
    }
}

class Languages {
    String[] languages = {"English", "Spanish", "French"};
    int[] speakers = {400000000, 460000000, 220000000};
    long[] countries = {60L, 20L, 29L};
    char[] difficulties = {'E', 'M', 'H'};
    
    void displayArrays() {
        System.out.println("Languages:");
        System.out.println("Languages: " + java.util.Arrays.toString(languages));
        System.out.println("Speakers: " + java.util.Arrays.toString(speakers));
        System.out.println("Countries: " + java.util.Arrays.toString(countries));
        System.out.println("Difficulties: " + java.util.Arrays.toString(difficulties));
		System.out.println("\n");
    }
}

class Movies {
    String[] movies = {"Inception", "The Matrix", "Interstellar"};
    int[] releaseYears = {2010, 1999, 2014};
    long[] boxOffice = {829895144L, 463517383L, 677471339L};
    char[] ratings = {'A', 'A', 'B'};
    
    void displayArrays() {
        System.out.println("Movies:");
        System.out.println("Movies: " + java.util.Arrays.toString(movies));
        System.out.println("Release Years: " + java.util.Arrays.toString(releaseYears));
        System.out.println("Box Office: " + java.util.Arrays.toString(boxOffice));
        System.out.println("Ratings: " + java.util.Arrays.toString(ratings));
		System.out.println("\n");
    }
}

class Cars {
    String[] cars = {"Tesla", "Ford", "Chevrolet"};
    int[] maxSpeeds = {250, 220, 240};
    long[] prices = {50000L, 30000L, 40000L};
    char[] fuelTypes = {'E', 'G', 'D'};
    
    void displayArrays() {
        System.out.println("Cars:");
        System.out.println("Cars: " + java.util.Arrays.toString(cars));
        System.out.println("Max Speeds: " + java.util.Arrays.toString(maxSpeeds));
        System.out.println("Prices: " + java.util.Arrays.toString(prices));
        System.out.println("Fuel Types: " + java.util.Arrays.toString(fuelTypes));
		System.out.println("\n");
    }
}

class Countries {
    String[] countries = {"USA", "Canada", "Mexico"};
    int[] populations = {331002651, 37742154, 128932753};
    long[] areas = {9833517L, 9984670L, 1964375L};
    char[] continents = {'N', 'N', 'N'};
    
    void displayArrays() {
        System.out.println("Countries:");
        System.out.println("Countries: " + java.util.Arrays.toString(countries));
        System.out.println("Populations: " + java.util.Arrays.toString(populations));
        System.out.println("Areas: " + java.util.Arrays.toString(areas));
        System.out.println("Continents: " + java.util.Arrays.toString(continents));
		System.out.println("\n");
    }
}

class Planets {
    String[] planets = {"Mercury", "Venus", "Earth"};
    int[] distancesFromSun = {58, 108, 150};
    long[] diameters = {4879L, 12104L, 12742L};
    char[] symbols = {'\u263F', '\u2640', '\u2641'};
    
    void displayArrays() {
        System.out.println("Planets:");
        System.out.println("Planets: " + java.util.Arrays.toString(planets));
        System.out.println("Distances from Sun (million km): " + java.util.Arrays.toString(distancesFromSun));
        System.out.println("Diameters (km): " + java.util.Arrays.toString(diameters));
        System.out.println("Symbols: " + java.util.Arrays.toString(symbols));
		System.out.println("\n");
    }
}

class ProgrammingLanguages {
    String[] programmingLanguages = {"Java", "Python", "C++"};
    int[] users = {9000000, 8000000, 7000000};
    long[] versions = {16L, 3L, 11L};
    char[] difficulties = {'M', 'E', 'H'};
    
    void displayArrays() {
        System.out.println("Programming Languages:");
        System.out.println("Programming Languages: " + java.util.Arrays.toString(programmingLanguages));
        System.out.println("Users: " + java.util.Arrays.toString(users));
        System.out.println("Versions: " + java.util.Arrays.toString(versions));
        System.out.println("Difficulties: " + java.util.Arrays.toString(difficulties));
		System.out.println("\n");
    }
}
