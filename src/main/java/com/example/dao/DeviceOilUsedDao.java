package com.example.dao;

import com.example.entity.DeviceOilUsed;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 设备油耗表(DeviceOilUsed)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:36
 */
public interface DeviceOilUsedDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DeviceOilUsed queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DeviceOilUsed> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param deviceOilUsed 实例对象
     * @return 对象列表
     */
    List<DeviceOilUsed> queryAll(DeviceOilUsed deviceOilUsed);

    /**
     * 新增数据
     *
     * @param deviceOilUsed 实例对象
     * @return 影响行数
     */
    int insert(DeviceOilUsed deviceOilUsed);

    /**
     * 修改数据
     *
     * @param deviceOilUsed 实例对象
     * @return 影响行数
     */
    int update(DeviceOilUsed deviceOilUsed);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}