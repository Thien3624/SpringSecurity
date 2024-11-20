package thien.vn.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import thien.vn.entity.UserInfo;
import thien.vn.service.UserService;

@RestController
public class TestController {
	private final UserService userService;

    public TestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/add")
    public ResponseEntity<String> addUser(@RequestBody UserInfo userInfo) {
        return ResponseEntity.ok(userService.addUser(userInfo));
    }
}
