package demo.service.impl;

import demo.mybatis.entity.TestEntity;
import demo.mybatis.mapper.TestEntityMapper;
import demo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ITestServiceImpl implements ITestService {

    @Autowired
    TestEntityMapper mapper;

    public void doCreate(TestEntity entity) {
        mapper.insert(entity);
    }


    public void doUpdate(TestEntity entity) {
        mapper.updateByPrimaryKey(entity);
    }

    @Override
    public void doMultiCreate(List<TestEntity> entityList) {
        for (TestEntity entity : entityList) {
            int affectedRows = mapper.insert(entity);
            System.out.println(affectedRows + " rows afftected!");
        }
    }


    public void doDelete(int id) {
        TestEntity entity = mapper.selectByPrimaryKey(id);
        mapper.delete(entity);
    }


    public TestEntity selectByPrimaryKey(int id) {
        return mapper.selectByPrimaryKey(id);
    }
}
