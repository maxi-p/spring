package dev.maxpetrushin.bean_scopes.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service("commentService3")
public class CommentService {
    private final ApplicationContext applicationContext;

    @Autowired
    public CommentService(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public CommentProcBean processComment() {
        // Prototype scope == new instance every call
        CommentProcBean bean = applicationContext.getBean(CommentProcBean.class);
        bean.processComment();
        return bean;
    }
}
