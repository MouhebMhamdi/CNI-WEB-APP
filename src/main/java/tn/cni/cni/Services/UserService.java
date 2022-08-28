package tn.cni.cni.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.cni.cni.Entities.User;
import tn.cni.cni.Repositories.UserRepository;

@Service

public class UserService {
	
	@Autowired 
	private UserRepository repository;
	
	
	public User saveUser(User user) {
		return repository.save(user); 
	}
	public List<User> saveUsers(List<User> users) {
		return repository.saveAll(users); 
	}
	public List<User> getUsers(){
		return repository.findAll();
	}
	public User getUserById(int id){
		return repository.findById(id).orElse(null);
	}
	public String deleteUser(int id) {
		repository.deleteById(id);
		return "User Removed !" +id;
	}
	public User updateUser(User user) {
		User existingUser=repository.findById(user.getId()).orElse(null);
		existingUser.setNom(user.getNom());
		return repository.save(existingUser);
		
	}
}
