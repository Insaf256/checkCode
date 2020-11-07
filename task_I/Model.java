package ru.kpfu.itis.tasks.task_I;

public class Model {
    public String letters;
    public String numbers;
    public String language;

    public ModelType(String letters, String numbers, String language) {
        this.letters = letters;
        this.numbers = numbers;
        this.language = language;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        if (this.letters == letters &&
            this.numbers == numbers &&
            this.language == language) {
            return true;
        }
    }

    @Override
    public int hashCode() {
        int result = Object.hash(letters, numbers, language);
        return result;
    }
}