package cn.txx.ch9_1.dao;

import cn.txx.ch9_1.domain.SysUser;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser, Long>{

	@Cacheable(value="user",key = "#a0")
	SysUser findByUsername(String username);

}
