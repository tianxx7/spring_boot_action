package cn.txx.ch4.messageconverter;

import cn.txx.ch4.domain.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/26
 */
public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

    public MyMessageConverter() {
        super(new MediaType("application","x-wisely",Charset.forName("UTF-8")));
    }

    @Override
    protected boolean supports(Class aClass) {
        return DemoObj.class.isAssignableFrom(aClass);
    }

    @Override
    protected DemoObj readInternal(Class aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        String s = StreamUtils.copyToString(httpInputMessage.getBody(), Charset.forName("UTF-8"));
        String[] tempArr = s.split("-");
        return new DemoObj(new Long(tempArr[0]),tempArr[1]);
    }

    @Override
    protected void writeInternal(DemoObj o, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        String out = "hello:" + o.getId() + "-"+o.getName();
        httpOutputMessage.getBody().write(out.getBytes());
    }
}
