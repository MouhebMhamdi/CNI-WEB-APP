package tn.cni.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.cni.Entities.User;
import tn.cni.Services.UserService;

@RestController
@RequestMapping("User")
public class UserController {

	
	@Autowired
	private UserService service	;
	
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	@PostMapping("/addUsers")
	public List<User> addUsers(@RequestBody List<User> users) {
		return service.saveUsers(users);
	}
	@GetMapping("/users")
	public List<User> findAllUsers(){
		return service.getUsers();
		
	}
	@GetMapping("/user/{id}")
	public User findUserByUserId(@PathVariable int id) {
		return service.getUserById(id);
	}
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
		
	}
}