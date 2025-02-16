package dev.maxpetrushin.bean_scopes.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcBean {
    private Comment comment;

    private final CommentRepo commentRepo;

    @Autowired
    public CommentProcBean(CommentRepo commentRepo) {
        this.commentRepo = commentRepo;
    }
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Comment getComment() {
        return this.comment;
    }

    public void processComment() {
        commentRepo.hi();
    }
}
