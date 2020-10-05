package com.example.dao;

import com.example.entity.ProjectPurchaseDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 材料总计划明细(ProjectPurchaseDetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public interface ProjectPurchaseDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProjectPurchaseDetail queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ProjectPurchaseDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param projectPurchaseDetail 实例对象
     * @return 对象列表
     */
    List<ProjectPurchaseDetail> queryAll(ProjectPurchaseDetail projectPurchaseDetail);

    /**
     * 新增数据
     *
     * @param projectPurchaseDetail 实例对象
     * @return 影响行数
     */
    int insert(ProjectPurchaseDetail projectPurchaseDetail);

    /**
     * 修改数据
     *
     * @param projectPurchaseDetail 实例对象
     * @return 影响行数
     */
    int update(ProjectPurchaseDetail projectPurchaseDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}