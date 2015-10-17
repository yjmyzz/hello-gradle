package demo;

import demo.domain.DemoBean;
import demo.mybatis.entity.TestEntity;
import demo.service.ITestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class Hello {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getName());

        ITestService service = context.getBean(ITestService.class);

        //create test
        TestEntity newEntity = new TestEntity();
        newEntity.setName("A");
        service.doCreate(newEntity);
        System.out.println("new record id:" + newEntity.getId());

        //query test
        TestEntity queryResult = service.selectByPrimaryKey(newEntity.getId());
        System.out.println("new record name:" + queryResult.getName());

        //update test
        queryResult.setName("B");
        service.doUpdate(queryResult);
        System.out.println("after update, new record name:" +
                service.selectByPrimaryKey(queryResult.getId()).getName());

        //delete test
        service.doDelete(queryResult.getId());
        System.out.println("record deleted," + service.selectByPrimaryKey(queryResult.getId()));

        //transaction test
        try {
            //注:由于t_test表的name字段,设置了唯一索引,所以下面的操作会发生异常,导致事务回滚
            List<TestEntity> list = new ArrayList<TestEntity>(2);
            TestEntity entity1 = new TestEntity();
            entity1.setName("X");
            TestEntity entity2 = new TestEntity();
            entity2.setName("X");
            list.add(entity1);
            list.add(entity2);
            service.doMultiCreate(list);
        } catch (Exception e) {
            System.out.println("事务已经回滚! 原因:" + e.getMessage());
        }

        context.close();
    }
}
