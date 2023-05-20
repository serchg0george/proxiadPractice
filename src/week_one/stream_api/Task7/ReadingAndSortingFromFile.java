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

            for (String dataFromFile :
                    insertedDataFromFile) {
                String[] parts = dataFromFile.split(",");
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
            System.out.println(firstNameMax + " " + lastNameMax);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
