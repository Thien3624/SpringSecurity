package thien.vn.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import thien.vn.entity.UserInfo;
import thien.vn.service.UserService;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	@PostMapping("/new")
	public String addUser(@RequestBody UserInfo useInfo)
	{
		return userService.addUser(useInfo);
	}
}
