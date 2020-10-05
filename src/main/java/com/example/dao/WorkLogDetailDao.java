package com.example.dao;

import com.example.entity.WorkLogDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 施工日志明细(WorkLogDetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public interface WorkLogDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param 编号 主键
     * @return 实例对象
     */
    WorkLogDetail queryById(Integer 编号);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WorkLogDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param workLogDetail 实例对象
     * @return 对象列表
     */
    List<WorkLogDetail> queryAll(WorkLogDetail workLogDetail);

    /**
     * 新增数据
     *
     * @param workLogDetail 实例对象
     * @return 影响行数
     */
    int insert(WorkLogDetail workLogDetail);

    /**
     * 修改数据
     *
     * @param workLogDetail 实例对象
     * @return 影响行数
     */
    int update(WorkLogDetail workLogDetail);

    /**
     * 通过主键删除数据
     *
     * @param 编号 主键
     * @return 影响行数
     */
    int deleteById(Integer 编号);

}