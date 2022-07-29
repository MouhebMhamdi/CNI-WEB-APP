package tn.cni.cni.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.cni.cni.Entities.User;
import tn.cni.cni.Repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
}
