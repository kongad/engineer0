package com.example.dao;

import com.example.entity.DeviceRequirePlan;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 设备需求计划(DeviceRequirePlan)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:35
 */
public interface DeviceRequirePlanDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DeviceRequirePlan queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DeviceRequirePlan> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param deviceRequirePlan 实例对象
     * @return 对象列表
     */
    List<DeviceRequirePlan> queryAll(DeviceRequirePlan deviceRequirePlan);

    /**
     * 新增数据
     *
     * @param deviceRequirePlan 实例对象
     * @return 影响行数
     */
    int insert(DeviceRequirePlan deviceRequirePlan);

    /**
     * 修改数据
     *
     * @param deviceRequirePlan 实例对象
     * @return 影响行数
     */
    int update(DeviceRequirePlan deviceRequirePlan);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}