package tn.cni.cni.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.cni.cni.Entities.User;
import tn.cni.cni.Services.UserService;

@RestController
@RequestMapping("/api/User")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("add")
    public String test(@RequestBody User user){
        userService.addUser(user);
        return "User added";
    }
}
