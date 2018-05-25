import java.util.ArrayDeque;

class OddEven {
    public static void main(String[] args) {

        ArrayDeque<GenerateA> myDeque = new ArrayDeque<GenerateA>();

        for (int i = 0; i < 50; i++) {
            myDeque.offer(new GenerateA('a'));
        }

        WordDivider divide = new WordDivider();
        divide.dequeDivide(myDeque);
    }
}