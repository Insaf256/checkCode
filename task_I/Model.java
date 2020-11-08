import java.util.Objects;

public class Model {
    private String letters;
    private int numbers;
    private String language;

    public Model(String letters, int numbers, String language) {
        this.letters = letters;
        this.numbers = numbers;
        this.language = language;
    }

    public String  getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Model object = (Model) obj;
        return this.letters != null &&
                this.letters.equals(object.letters) &&
                this.numbers == object.numbers &&
                this.language != null &&
                this.language.equals(object.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letters, numbers, language);
    }
}