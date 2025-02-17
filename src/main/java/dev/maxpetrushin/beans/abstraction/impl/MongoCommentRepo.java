package dev.maxpetrushin.beans.abstraction.impl;

import dev.maxpetrushin.beans.abstraction.CommentRepo;
import org.springframework.stereotype.Repository;

@Repository(value="mongoCommentRepo")
public class MongoCommentRepo implements CommentRepo {
    @Override
    public void readComment() {
        System.out.println("Mongo repo");
    }
}
