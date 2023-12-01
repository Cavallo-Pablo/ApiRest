package com.api.crud.User;

//#region Imports
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
/* import org.springframework.web.bind.annotation.RequestMapping; */
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
//#endregion

@RestController
/* @RequestMapping("/user") */
@RequiredArgsConstructor
public class UserController {

    @Autowired
    UserService userService;
    
    @GetMapping("/user")
    @ResponseBody
    public List<User> listUser() {
        return userService.listUsers();
    }
    
    @PostMapping("/user")
    @ResponseBody
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
    
    @DeleteMapping("/user/{id}")
    @ResponseBody
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public User searchUserById(@PathVariable Integer id) {
        return userService.searchUser(id);
    }

    @PutMapping("/user")
    @ResponseBody
    public void editUser(@RequestBody User user) {
        userService.editUser(user);
    }

    @PostMapping("/login")
    public User loginUser(@RequestBody User user) {
       return userService.loginUser(user.getUserName(), user.getPassword());
    }
}