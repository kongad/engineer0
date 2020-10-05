package com.example.dao;

import com.example.entity.ApplyProgressPayment;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 进度款申报(ApplyProgressPayment)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public interface ApplyProgressPaymentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ApplyProgressPayment queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ApplyProgressPayment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param applyProgressPayment 实例对象
     * @return 对象列表
     */
    List<ApplyProgressPayment> queryAll(ApplyProgressPayment applyProgressPayment);

    /**
     * 新增数据
     *
     * @param applyProgressPayment 实例对象
     * @return 影响行数
     */
    int insert(ApplyProgressPayment applyProgressPayment);

    /**
     * 修改数据
     *
     * @param applyProgressPayment 实例对象
     * @return 影响行数
     */
    int update(ApplyProgressPayment applyProgressPayment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}