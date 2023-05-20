package week_one.stream_api.Task7;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadingAndSortingFromFile {
    public static void main(String[] args) {
        String path = "C:/Users/Serchg/Desktop/persons.txt";
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            List<String> insertedDataFromFile = lines
                    .filter(line -> !line.isBlank())
                    .collect(Collectors.toList());


            List<Integer> sumOfCharactersList = new ArrayList<>();
            String firstNameMax = "";
            String lastNameMax = "";

            String firstNameStreets = "";
            String lastNameStreets = "";



            for (String dataFromFile :
                    insertedDataFromFile) {
                String[] parts = dataFromFile.split(",");
                String[] firstNameLastNameFromFile = Arrays.copyOfRange(parts, 0, 2);

                String[] numberOfStreet = Arrays.copyOfRange(parts, 0, 6);


                String rawFirstName = firstNameLastNameFromFile[0].trim();
                String rawLastName = firstNameLastNameFromFile[1].trim();


                String rawNumberOfStreet = numberOfStreet[5].trim();


                String extractedFirstName = rawFirstName.substring(rawFirstName.indexOf("=") + 1);
                String extractedLastName = rawLastName.substring(rawLastName.indexOf("=") + 1);


                Integer extractedNumberOfStreet = Integer.parseInt(rawNumberOfStreet.substring(rawNumberOfStreet.indexOf("=") + 1));

                int sumOfCharacters = extractedFirstName.length() + extractedLastName.length();
                sumOfCharactersList.add(sumOfCharacters);

                if (extractedNumberOfStreet.equals(25)) {
                    firstNameStreets = extractedFirstName;
                    lastNameStreets = extractedLastName;
                    System.out.println("Lives on street with number 25: " + firstNameStreets + " " + lastNameStreets);
                }

                if (sumOfCharacters == Collections.max(sumOfCharactersList)) {
                    firstNameMax = extractedFirstName;
                    lastNameMax = extractedLastName;
                }
            }
            System.out.println(firstNameMax + " " + lastNameMax);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
