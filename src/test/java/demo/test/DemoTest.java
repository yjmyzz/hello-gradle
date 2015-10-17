package demo.test;

import demo.domain.DemoBean;
import demo.service.ITestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by yjmyzz on 15/10/17.
 */
public class DemoTest extends AbstractTest {

    private Logger logger = LogManager.getLogger();

    @Test
    public void getBeanTest() {
        DemoBean demoBean = applicationContext.getBean(DemoBean.class);
        logger.debug(demoBean.getName());
        Assert.assertNotNull(demoBean.getName());


        ITestService service = applicationContext.getBean(ITestService.class);
        logger.debug(service.getClass());
        Assert.assertNotNull(service);
    }
}
