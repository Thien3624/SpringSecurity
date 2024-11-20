package thien.vn.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import thien.vn.repository.UserInfoRepository;
import thien.vn.entity.UserInfo;

@Service
public record UserService(UserInfoRepository repository, PasswordEncoder passwordEncoder) {

	public String addUser(UserInfo userInfo)
	{
		userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
		repository.save(userInfo);
		return "Thêm user thành công";
	}
}
