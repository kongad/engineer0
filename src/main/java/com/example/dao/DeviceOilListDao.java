package com.example.dao;

import com.example.entity.DeviceOilList;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 设备油耗明细(DeviceOilList)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:37
 */
public interface DeviceOilListDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DeviceOilList queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DeviceOilList> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param deviceOilList 实例对象
     * @return 对象列表
     */
    List<DeviceOilList> queryAll(DeviceOilList deviceOilList);

    /**
     * 新增数据
     *
     * @param deviceOilList 实例对象
     * @return 影响行数
     */
    int insert(DeviceOilList deviceOilList);

    /**
     * 修改数据
     *
     * @param deviceOilList 实例对象
     * @return 影响行数
     */
    int update(DeviceOilList deviceOilList);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}