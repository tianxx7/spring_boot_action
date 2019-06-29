package cn.txx.ch7;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;



/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/29
 */
//@Component
public class CustomServletContainer implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {
    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        factory.setPort(8888);
        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/404.html"));
        /*((TomcatServletWebServerFactory)factory).addConnectorCustomizers(new TomcatConnectorCustomizer() {
            @Override
            public void customize(Connector connector) {
                Http11NioProtocol protocol = (Http11NioProtocol) connector.getProtocolHandler();
                protocol.setMaxConnections(200);
                protocol.setMaxThreads(200);
                protocol.setSelectorTimeout(3000);
                protocol.setSessionTimeout(3000);
                protocol.setConnectionTimeout(3000);
            }
        });*/
    }
}
