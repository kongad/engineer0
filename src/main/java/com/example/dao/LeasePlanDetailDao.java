package com.example.dao;

import com.example.entity.LeasePlanDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 租赁计划明细(LeasePlanDetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public interface LeasePlanDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LeasePlanDetail queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LeasePlanDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param leasePlanDetail 实例对象
     * @return 对象列表
     */
    List<LeasePlanDetail> queryAll(LeasePlanDetail leasePlanDetail);

    /**
     * 新增数据
     *
     * @param leasePlanDetail 实例对象
     * @return 影响行数
     */
    int insert(LeasePlanDetail leasePlanDetail);

    /**
     * 修改数据
     *
     * @param leasePlanDetail 实例对象
     * @return 影响行数
     */
    int update(LeasePlanDetail leasePlanDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}