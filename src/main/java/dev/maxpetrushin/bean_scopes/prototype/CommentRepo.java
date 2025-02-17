package dev.maxpetrushin.bean_scopes.prototype;

import org.springframework.stereotype.Repository;

@Repository("commentRepo3")
public class CommentRepo {
    public void hi() {
        System.out.println("repo usage");
    }
}
