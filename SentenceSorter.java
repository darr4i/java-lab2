import java.util.*;

public class SentenceSorter {

    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("My name is Daria. I am a student at KPI. " +
                                               "3nd course! To be honest I just want sleep all day long.");

        try {
            String[] sentences = text.toString().split("[.!?]\\s*");

            List<String> sentenceList = new ArrayList<>(Arrays.asList(sentences));

            sentenceList.sort(Comparator.comparingInt(s -> s.split("\\s+").length));

            System.out.println("Sentences in ascending order of count:");
            for (String sentence : sentenceList) {
                System.out.println(sentence.trim() + ".");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
