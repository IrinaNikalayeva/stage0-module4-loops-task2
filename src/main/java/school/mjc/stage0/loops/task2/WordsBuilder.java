package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int counter = 0;
        String phrase = "";
        while (counter < chars.length) {
            phrase = phrase + chars[counter];
            counter++;
        }
        System.out.print(phrase);
    }
}
