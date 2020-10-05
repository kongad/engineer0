package com.example.dao;

import com.example.entity.SubcontractProgressPayment;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 分包进度款申报(SubcontractProgressPayment)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public interface SubcontractProgressPaymentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SubcontractProgressPayment queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SubcontractProgressPayment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param subcontractProgressPayment 实例对象
     * @return 对象列表
     */
    List<SubcontractProgressPayment> queryAll(SubcontractProgressPayment subcontractProgressPayment);

    /**
     * 新增数据
     *
     * @param subcontractProgressPayment 实例对象
     * @return 影响行数
     */
    int insert(SubcontractProgressPayment subcontractProgressPayment);

    /**
     * 修改数据
     *
     * @param subcontractProgressPayment 实例对象
     * @return 影响行数
     */
    int update(SubcontractProgressPayment subcontractProgressPayment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}