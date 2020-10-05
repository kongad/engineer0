package com.example.dao;

import com.example.entity.BuildProgressPlan;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 施工进度计划(BuildProgressPlan)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:35
 */
public interface BuildProgressPlanDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BuildProgressPlan queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BuildProgressPlan> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param buildProgressPlan 实例对象
     * @return 对象列表
     */
    List<BuildProgressPlan> queryAll(BuildProgressPlan buildProgressPlan);

    /**
     * 新增数据
     *
     * @param buildProgressPlan 实例对象
     * @return 影响行数
     */
    int insert(BuildProgressPlan buildProgressPlan);

    /**
     * 修改数据
     *
     * @param buildProgressPlan 实例对象
     * @return 影响行数
     */
    int update(BuildProgressPlan buildProgressPlan);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}