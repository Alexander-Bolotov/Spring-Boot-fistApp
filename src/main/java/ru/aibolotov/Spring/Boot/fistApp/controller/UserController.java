package ru.aibolotov.Spring.Boot.fistApp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.aibolotov.Spring.Boot.fistApp.model.User;
import ru.aibolotov.Spring.Boot.fistApp.repositories.UserRepo;

import java.util.List;


@Controller

public class UserController {

    @Autowired
    private UserRepo userRepo;
//    @Autowired
//    private RoleRepo roleRepo;

    @GetMapping("/list")
    public String listUsers(Model model) {
        List<User> userList = userRepo.findAll();
        model.addAttribute("users", userList);
        return "list-users";
    }
//
//    @GetMapping("/showForm")
//    public String showFormForAdd(Model model) {
//        User user = new User();
//
//        model.addAttribute("user", user);
//        model.addAttribute("rolesList", roleRepo.getListRoles());
//        return "user-form";
//    }
//
//
//    @PostMapping("/saveUser")
//    public String saveUser(@RequestParam("id") Long id, @RequestParam("name") String name, @RequestParam("password") String password, @RequestParam("roles") String[] role) {
//        Set<Role> roleSet = new HashSet<>();
//        for (String roleName : role) {
//            roleSet.add(roleRepo.getRoleByName(roleName));
//        }
//        if(userRepo.nameIsExist(name)){
////            User user = userRepo.getUser(name);
////            user.setName(name);
////            user.setPassword(password);
////            user.setRoles(roleSet);
////            userRepo.addUser(user);
//        } else {
//            User user = new User(name, password, roleSet);
//            userRepo.addUser(user);
//        }
//        return "redirect:/list";
//    }
//
//    @GetMapping("/updateForm")
//    public String showFormForUpdate(@RequestParam("userId") Long id, Model model) {
//        User user = userRepo.getUserById(id);
//        model.addAttribute("user", user);
//        return "user-form";
//    }
//
//    @GetMapping("/delete")
//    public String deleteUser(@RequestParam("userId") Long id, Model model) {
//        userRepo.deleteUserById(id);
//        return "redirect:/list";
//    }
//
//    @RequestMapping(value = "hello", method = RequestMethod.GET)
//    public String printWelcome(ModelMap model) {
//        List<String> messages = new ArrayList<>();
//        messages.add("Hello!");
//        messages.add("I'm Spring MVC-SECURITY application");
//        messages.add("5.2.0 version by sep'19 ");
//        model.addAttribute("messages", messages);
//        return "hello";
//    }
//
//    @RequestMapping(value = "login", method = RequestMethod.GET)
//    public String loginPage() {
//        return "login";
//    }
//
//
//    @RequestMapping(value = "userdata", method = RequestMethod.GET)
//    public String printDataUser(ModelMap model) {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//
////        User user = userRepo.getUser(auth.getName());
////        List<String> messages = new ArrayList<>();
////        messages.add("Hello! " + auth.getName());
////        messages.add("Пароль: " + user.getPassword());
////        messages.add("Роль: " + user.getRoles());
////        model.addAttribute("messages", messages);
//        return "userdata";
//    }
//
//    @ModelAttribute("rolesList")
//    public List<Role> getUserList() {
//
//        return roleRepo.getListRoles();
//    }
}
