package ejbinterface.interfaces;

import ejbinterface.model.CommentShared;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface CommentRemote {

    public List<CommentShared> findAllByArticle(Object id);
    
    public CommentShared save(String content, Object userID, Object articleID);
}
