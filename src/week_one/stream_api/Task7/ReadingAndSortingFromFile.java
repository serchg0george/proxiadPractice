package week_one.stream_api.Task7;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadingAndSortingFromFile {

    public static void main(String[] args) {
        findLongestName(getDataFromFile());
        findPersonByStreetNumber(getDataFromFile(), 25);
    }


    private static List<String> getDataFromFile() {
        String path = "C:/Users/Serchg/Desktop/persons.txt";
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            return lines
                    .filter(line -> !line.isBlank())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


/*    private static void getNameFromFile() {
        getDataFromFile();

        String extractedFirstName = "";
        String extractedLastName = "";

        for (String getData:
             getDataFromFile()) {

        }
    }*/


    private static void findLongestName(List<String> data) {

        String longestName = data.stream()
                .map(line -> line.split(",")[0].trim() + " " + line.split(",")[1].trim())
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println(longestName);


/*        getDataFromFile();

        List<Integer> sumOfCharactersList = new ArrayList<>();
        String firstNameMax = "";
        String lastNameMax = "";

        for (String getData :
                getDataFromFile()) {

            String[] parts = getData.split(",");
            String[] firstNameLastNameFromFile = Arrays.copyOfRange(parts, 0, 2);

            String rawFirstName = firstNameLastNameFromFile[0].trim();
            String rawLastName = firstNameLastNameFromFile[1].trim();

            String extractedFirstName = rawFirstName.substring(rawFirstName.indexOf("=") + 1);
            String extractedLastName = rawLastName.substring(rawLastName.indexOf("=") + 1);

            int sumOfCharacters = extractedFirstName.length() + extractedLastName.length();
            sumOfCharactersList.add(sumOfCharacters);


            if (sumOfCharacters == Collections.max(sumOfCharactersList)) {
                firstNameMax = extractedFirstName;
                lastNameMax = extractedLastName;
            }

        }

        System.out.println(firstNameMax + " " + lastNameMax);*/
    }

    private static void findPersonByStreetNumber(List<String> data, int streetNumber) {

        List<String> personByStreet = data.stream()
                .filter(line -> line.contains("number=" + streetNumber))
                .map(line -> line.split(",")[0].trim())
                .collect(Collectors.toList());

        System.out.println(personByStreet);

/*        getDataFromFile();

        String firstNameStreets = "";
        String lastNameStreets = "";

        for (String getData :
                getDataFromFile()) {

            String[] parts = getData.split(",");
            String[] firstNameLastNameFromFile = Arrays.copyOfRange(parts, 0, 2);

            String rawFirstName = firstNameLastNameFromFile[0].trim();
            String rawLastName = firstNameLastNameFromFile[1].trim();

            String extractedFirstName = rawFirstName.substring(rawFirstName.indexOf("=") + 1);
            String extractedLastName = rawLastName.substring(rawLastName.indexOf("=") + 1);
            String[] numberOfStreet = Arrays.copyOfRange(parts, 0, 6);

            String rawNumberOfStreet = numberOfStreet[5].trim();

            Integer extractedNumberOfStreet = Integer.parseInt(rawNumberOfStreet.substring(rawNumberOfStreet.indexOf("=") + 1));


            if (extractedNumberOfStreet.equals(25)) {
                firstNameStreets = extractedFirstName;
                lastNameStreets = extractedLastName;
                System.out.println("Lives on street with number 25: " + firstNameStreets + " " + lastNameStreets);
            }
        }*/
    }

}
