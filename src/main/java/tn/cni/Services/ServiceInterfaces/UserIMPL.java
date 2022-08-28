package tn.cni.Services.ServiceInterfaces;

import tn.cni.Entities.User;

import java.util.List;

public interface UserIMPL {
    public User saveUser(User user);
    public List<User> saveUsers(List<User> users);
    public List<User> getUsers();
    public User getUserById(int id);
    public String deleteUser(int id) ;
    public User updateUser(User user) ;
}
