import java.util.Random;

class GenerateA {
    private String word;
    private static final int MAX_LENGTH = 50;

    public GenerateA(char a) {
        Random generator = new Random();
        int length = generator.nextInt(MAX_LENGTH);
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < length; i++) {
            builder.append(a);
        }
        word = builder.toString();
    }

    @Override
    public String toString() {
        return word;
    }
}






