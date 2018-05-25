import java.util.ArrayDeque;
import java.util.ArrayList;

class WordDivider {
    private ArrayList<GenerateA> even = new ArrayList<GenerateA>();
    private ArrayList<GenerateA> odd = new ArrayList<GenerateA>();

    public void dequeDivide(ArrayDeque<GenerateA> myDeque) {
        for (GenerateA wordA : myDeque) {
            if (wordA.toString().length() % 2 == 0) {
                System.out.println("number of \"a\" - even: " + wordA);
                even.add(wordA);
            } else {
                System.out.println("number of \"a\" - odd: " + wordA);
                odd.add(wordA);
            }

        }
    }
}