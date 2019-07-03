package cn.txx.ch4.domain;

import org.springframework.security.crypto.password.PasswordEncoder;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/29
 */
public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }

}