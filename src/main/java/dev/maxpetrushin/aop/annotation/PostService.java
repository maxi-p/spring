package dev.maxpetrushin.aop.annotation;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class PostService {
    Logger LOGGER = Logger.getLogger(PostService.class.getName());
    public void addPost() {
        LOGGER.info("\tAdding post\n");
    }

    @ToLog
    public void deletePost() {
        LOGGER.info("\tDeleting post");
    }

    public void editPost() {
        LOGGER.info("\tEditing post\n");
    }
}
