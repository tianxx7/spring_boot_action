package cn.txx.ch3.enable;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.AdviceModeImportSelector;
import org.springframework.scheduling.annotation.ProxyAsyncConfiguration;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/23
 */
public class AsyncConfigurationSelector extends AdviceModeImportSelector {
    private static final String ASYNC_EXECUTION_ASPECT_CONFIGURATION_CLASS_NAME
            = "org.springframework.scheduling.aspectj.AspectJAsyncConfiguration";

    @Override
    protected String[] selectImports(AdviceMode adviceMode) {
        switch (adviceMode) {
            case PROXY:
                return new String[]{ProxyAsyncConfiguration.class.getName()};
            case ASPECTJ:
                return new String[]{ASYNC_EXECUTION_ASPECT_CONFIGURATION_CLASS_NAME};
            default:
                return null;
        }
    }
}
