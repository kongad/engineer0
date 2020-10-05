package com.example.dao;

import com.example.entity.MaterialInstorageRecord;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 材料入库记录(MaterialInstorageRecord)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:37
 */
public interface MaterialInstorageRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MaterialInstorageRecord queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MaterialInstorageRecord> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param materialInstorageRecord 实例对象
     * @return 对象列表
     */
    List<MaterialInstorageRecord> queryAll(MaterialInstorageRecord materialInstorageRecord);

    /**
     * 新增数据
     *
     * @param materialInstorageRecord 实例对象
     * @return 影响行数
     */
    int insert(MaterialInstorageRecord materialInstorageRecord);

    /**
     * 修改数据
     *
     * @param materialInstorageRecord 实例对象
     * @return 影响行数
     */
    int update(MaterialInstorageRecord materialInstorageRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}