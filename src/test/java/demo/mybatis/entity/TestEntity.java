package demo.mybatis.entity;

import javax.persistence.*;

@Table(name = "t_test")
public class TestEntity {
    /**
     * 主建Id
     */
    @Id
    @Column(name = "d_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    @Column(name = "d_name")
    private String name;

    /**
     * 获取主建Id
     *
     * @return d_id - 主建Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主建Id
     *
     * @param id 主建Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return d_name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }
}