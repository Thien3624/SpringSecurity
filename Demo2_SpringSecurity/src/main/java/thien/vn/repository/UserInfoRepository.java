package thien.vn.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import thien.vn.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>{
	Optional<UserInfo> findByName(String username);
}
