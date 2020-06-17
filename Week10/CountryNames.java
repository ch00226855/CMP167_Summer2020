public class CountryNames {

    public static void main(String[] args) {
        
        // Create an array of the five largest countries in the world. 
        // Print the country names.
        // Russia, Canada, USA, China, Brazil

        // String[] countryNames = new String[5];

        // countryNames[0] = "Russia";
        // countryNames[1] = "Canada";
        // countryNames[2] = "USA";
        // countryNames[3] = "China";
        // countryNames[4] = "Brazil";

        // Combine declaration with initialization
        String[] countryNames = {"Russia", "Canada", "USA", "China", "Brazil"};

        // System.out.println("The largest country is: " + countryNames[0]);
        // System.out.println("The 2nd largest country is: " + countryNames[1]);
        // System.out.println("The 3rd largest country is: " + countryNames[2]);
        // System.out.println("The 4th largest country is: " + countryNames[3]);
        // System.out.println("The 5th largest country is: " + countryNames[4]);
        for (int i = 0; i < countryNames.length; i++) {
            // Do something to countryNames[i]
            System.out.println("The " + i + "th largest country is: " +
                                 countryNames[i]);
        }

    }
    
}