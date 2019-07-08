package security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* *
 * 描述: 登陆成功处理器
 * @user tianxinxing
 * @date 2019/7/8
 */
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    //jackson 工具类
    private ObjectMapper objectMapper = new ObjectMapper();

    /**
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param authentication  认证成功后的一些信息
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        //返回json字符串给前端
        Map result = new HashMap();
        result.put("success",true);
        String json = objectMapper.writeValueAsString(result);
        httpServletResponse.setContentType("text/json;charset=UTF-8");
        httpServletResponse.getWriter().write(json);
    }
}
