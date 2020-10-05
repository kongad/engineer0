package com.example.dao;

import com.example.entity.OutputProgressFillout;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 产值进度填报主表(OutputProgressFillout)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:35
 */
public interface OutputProgressFilloutDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OutputProgressFillout queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OutputProgressFillout> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param outputProgressFillout 实例对象
     * @return 对象列表
     */
    List<OutputProgressFillout> queryAll(OutputProgressFillout outputProgressFillout);

    /**
     * 新增数据
     *
     * @param outputProgressFillout 实例对象
     * @return 影响行数
     */
    int insert(OutputProgressFillout outputProgressFillout);

    /**
     * 修改数据
     *
     * @param outputProgressFillout 实例对象
     * @return 影响行数
     */
    int update(OutputProgressFillout outputProgressFillout);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}