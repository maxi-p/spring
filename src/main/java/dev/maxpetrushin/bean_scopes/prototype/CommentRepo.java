package dev.maxpetrushin.bean_scopes.prototype;

import org.springframework.stereotype.Repository;

@Repository
public class CommentRepo {
    public void hi() {
        System.out.println("repo usage");
    }
}
