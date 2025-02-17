package dev.maxpetrushin.aop.intercept_method.service;

import dev.maxpetrushin.aop.intercept_method.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service(value="commentService4")
public class CommentService {
    private static Logger LOGGER = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        LOGGER.info(comment.getText());
        return "SUCCESS";
    }
}
