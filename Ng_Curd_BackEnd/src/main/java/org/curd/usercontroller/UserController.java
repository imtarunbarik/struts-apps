package org.curd.usercontroller;

import java.util.List;
import java.util.Optional;

import org.curd.model.User;
import org.curd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/users")
	public List<User> getUsers() {
		return userRepository.findAll();
	}// getUsers()

	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable Long id) {
		return userRepository.findById(id);
	}// getUser(-)

	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
		return true;
	}// deleteUser(-)

	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);

	}// createUser(-)

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return userRepository.save(user);

	}// updateUser(-)

}// class