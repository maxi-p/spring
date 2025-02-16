package dev.maxpetrushin.bean_scopes.prototype;

// Doesn't need to be a bean
public class CommentProcessor {
    private Comment comment;

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Comment getComment() {
        return this.comment;
    }
}