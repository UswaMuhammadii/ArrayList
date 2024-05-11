import java.util.ArrayList;
import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        String sentence = "The change in environment is because of increasing is the change pollution inquire to";
         ArrayList<String> obj = new ArrayList<>();
        String[] text1;
        text1 = sentence.split(" ");

        System.out.printf("Total words:");
        System.out.println(text1.length);

        System.out.println("Splitted form of sentence is ");
        for(String s:text1) {
            obj.add(s);
            System.out.println(s);
        }

        System.out.println("index of word environment is: ");
        System.out.println(obj.indexOf("environment"));

        System.out.println("words frequency");

        ArrayList<Frequency> wordCount = new ArrayList<>();
        for (String s : text1) {
            boolean found = false;
            for (Frequency freq : wordCount) {
                if (freq.getWords().equals(s)) {
                    freq.setCount(freq.getCount() + 1);
                    found = true;
                    break;
                }
            }
            if (!found) {
                wordCount.add(new Frequency(s, 1));
            }
        }
        for (Frequency freq : wordCount) {
            System.out.println(freq.getWords() + ": " + freq.getCount());
        }

        System.out.println("Unique words");
        HashSet<String> set = new HashSet<>(obj);
        System.out.println(set.size());

        System.out.println("Number of characters");
        int count= sentence.length();
        System.out.println(count);


    }
}
