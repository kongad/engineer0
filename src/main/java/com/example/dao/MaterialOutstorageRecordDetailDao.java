package com.example.dao;

import com.example.entity.MaterialOutstorageRecordDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 材料出库记录明细(MaterialOutstorageRecordDetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public interface MaterialOutstorageRecordDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MaterialOutstorageRecordDetail queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MaterialOutstorageRecordDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param materialOutstorageRecordDetail 实例对象
     * @return 对象列表
     */
    List<MaterialOutstorageRecordDetail> queryAll(MaterialOutstorageRecordDetail materialOutstorageRecordDetail);

    /**
     * 新增数据
     *
     * @param materialOutstorageRecordDetail 实例对象
     * @return 影响行数
     */
    int insert(MaterialOutstorageRecordDetail materialOutstorageRecordDetail);

    /**
     * 修改数据
     *
     * @param materialOutstorageRecordDetail 实例对象
     * @return 影响行数
     */
    int update(MaterialOutstorageRecordDetail materialOutstorageRecordDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}