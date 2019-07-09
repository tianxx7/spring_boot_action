package security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/7/8
 */
public class MyUserDetailService implements UserDetailsService {
    /**
     * 读取数据库用户信息
     * 输入用户名后总能返回一个用户信息,所以只要密码对,就能登陆
     * @param userName
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        //UserDetails:封装用户数据的接口
        User user = new User("txx","123456", AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER,ROLE_ADMIN"));
        return user;
    }
}
