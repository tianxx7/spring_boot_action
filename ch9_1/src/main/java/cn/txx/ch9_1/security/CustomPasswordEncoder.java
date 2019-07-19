package cn.txx.ch9_1.security;

import org.springframework.security.crypto.password.PasswordEncoder;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/7/9
 */
public class CustomPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    /**
     * 返回时true时认证成功,使用security的加密算法的话,
     * 需要原始密码和加密后的密码对比才能验证成功,而不是加密后的和数据库的加密密码
     * @param rawPassword 原始密码
     * @param encodedPassword  数据库的密码
     * @return
     */
    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(rawPassword);
    }
}
