package FullPractice.StreamAssignment1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class CSVStreamProcessor {
    public static double  calculateAverageAge(String csvFilePath) throws IOException {
        try(Stream<String> reader = Files.lines(Paths.get(csvFilePath))){
            return reader.skip(1).map(n -> n.split(",")).filter(part -> part.length >= 1)
                    .map(line ->{try{

                        return Integer.parseInt(line[1].trim());
            }catch(NumberFormatException e){
                        return null;
            }} ).filter(age -> age != null).mapToInt(Integer::intValue).average().orElse(0.0);

        }

    }

    public static void main(String[] args) {
         String file = "children.csv";
         try{
             double result = calculateAverageAge(file);
             System.out.println("csv age average is:" +result);
         }catch (IOException e){
             System.out.println("read file failed" + e.getMessage());
         }

    }
}
