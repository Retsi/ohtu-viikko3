
import java.io.File;
import java.util.List;
import ohtu.data_access.UserDao;
import ohtu.domain.User;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author retsi
 */
public class FileUserDAO implements UserDao {
    
    File tiedosto;
    
    public FileUserDAO(File tiedosto)throws Exception{
        this.tiedosto = tiedosto;
    }

    @Override
    public List<User> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
