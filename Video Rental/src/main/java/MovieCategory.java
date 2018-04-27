public enum MovieCategory {
    HORROR ("horror"),
    COMEDY("comedy"),
    THRILLER("thriller"),
    ACTION("action"),
    ANIMATION("animation"),
    MUSICAL("musical");

    private final String type;

    private MovieCategory(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
