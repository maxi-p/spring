package dev.maxpetrushin.aop.intercept_method;

public class Comment {
    private String text;
    private String author;

    public String getText() {
        return text;
    }

    public Comment(String text, String author) {
        this.text = text;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Comment:(Text: " + text + ", Author: " + author + ")";
    }
}
