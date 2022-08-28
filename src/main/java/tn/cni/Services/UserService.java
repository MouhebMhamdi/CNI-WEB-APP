package tn.cni.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.cni.Entities.User;
import tn.cni.Repositories.UserRepository;
import tn.cni.Services.ServiceInterfaces.UserIMPL;

@Service

public class UserService implements UserIMPL {
	
	@Autowired 
	private UserRepository repository;
	
	@Override
	public User saveUser(User user) {
		return repository.save(user); 
	}
	@Override
	public List<User> saveUsers(List<User> users) {
		return repository.saveAll(users); 
	}
	@Override
	public List<User> getUsers(){
		return repository.findAll();
	}
	@Override
	public User getUserById(int id){
		return repository.findById(id).orElse(null);
	}
	@Override
	public String deleteUser(int id) {
		repository.deleteById(id);
		return "User Removed !" +id;
	}
	@Override
	public User updateUser(User user) {
		User existingUser=repository.findById(user.getId()).orElse(null);
		existingUser.setNom(user.getNom());
		return repository.save(existingUser);
		
	}
}
