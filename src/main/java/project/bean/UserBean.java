package project.bean;

import project.model.UserEntity;
import project.service.UserRepository;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class UserBean implements Serializable {
    @EJB
    private UserRepository userRepository;

    public List<UserEntity> getUserList() {
        return userRepository.findAll();
    }
}
