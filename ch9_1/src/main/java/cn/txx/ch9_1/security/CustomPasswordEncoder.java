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

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(rawPassword);
    }
}
