package demo.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = "classpath*:spring-context.xml")
public abstract class AbstractTest extends AbstractJUnit4SpringContextTests {


}
