package demo.service;

import demo.mybatis.entity.TestEntity;

import java.util.List;

/**
 * Created by yjmyzz on 15/10/17.
 */
public interface ITestService {

    void doCreate(TestEntity entity);

    void doUpdate(TestEntity entity);

    /**
     * 批量创建新记录
     * @param entityList
     */
    void doMultiCreate(List<TestEntity> entityList);

    void doDelete(int id);

    TestEntity selectByPrimaryKey(int id);
}
