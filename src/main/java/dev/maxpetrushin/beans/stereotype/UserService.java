package dev.maxpetrushin.beans.stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="userService1")
public class UserService {
    public CommentRepo commentRepo;

    @Autowired
    public UserService(CommentRepo commentRepo) {
        this.commentRepo = commentRepo;
    }
}
