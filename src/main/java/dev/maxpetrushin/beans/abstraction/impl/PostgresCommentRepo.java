package dev.maxpetrushin.beans.abstraction.impl;

import dev.maxpetrushin.beans.abstraction.CommentRepo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PostgresCommentRepo implements CommentRepo {
    @Override
    public void readComment() {
        System.out.println("Postgres repo");
    }
}
