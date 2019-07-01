package com.synchrony.album.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.synchrony.album.model.User;
import com.synchrony.album.service.UserService;
import com.synchrony.album.vo.AlbumResponse;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody User user) {
		userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(new AlbumResponse("MSG001","Successfully register the user"));
	}

	@GetMapping("{userId}")
	public ResponseEntity<?> getUser(@PathParam("userId") Long userId) {
		User user = userService.getUser(userId);
		if(user == null) {
			return ResponseEntity.ok(new AlbumResponse("MSG002","User does not exist"));
		}
		return ResponseEntity.ok(userService.getUser(userId));
	}

}
