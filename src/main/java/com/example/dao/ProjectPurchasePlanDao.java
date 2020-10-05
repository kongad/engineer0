package com.example.dao;

import com.example.entity.ProjectPurchasePlan;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 材料总计划(ProjectPurchasePlan)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:36
 */
public interface ProjectPurchasePlanDao {

    /**
     * 通过ID查询单条数据
     *
     * @param planNo 主键
     * @return 实例对象
     */
    ProjectPurchasePlan queryById(String planNo);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ProjectPurchasePlan> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param projectPurchasePlan 实例对象
     * @return 对象列表
     */
    List<ProjectPurchasePlan> queryAll(ProjectPurchasePlan projectPurchasePlan);

    /**
     * 新增数据
     *
     * @param projectPurchasePlan 实例对象
     * @return 影响行数
     */
    int insert(ProjectPurchasePlan projectPurchasePlan);

    /**
     * 修改数据
     *
     * @param projectPurchasePlan 实例对象
     * @return 影响行数
     */
    int update(ProjectPurchasePlan projectPurchasePlan);

    /**
     * 通过主键删除数据
     *
     * @param planNo 主键
     * @return 影响行数
     */
    int deleteById(String planNo);

}