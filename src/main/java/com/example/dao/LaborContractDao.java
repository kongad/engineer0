package com.example.dao;

import com.example.entity.LaborContract;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 劳务合同(LaborContract)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:36
 */
public interface LaborContractDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LaborContract queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LaborContract> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param laborContract 实例对象
     * @return 对象列表
     */
    List<LaborContract> queryAll(LaborContract laborContract);

    /**
     * 新增数据
     *
     * @param laborContract 实例对象
     * @return 影响行数
     */
    int insert(LaborContract laborContract);

    /**
     * 修改数据
     *
     * @param laborContract 实例对象
     * @return 影响行数
     */
    int update(LaborContract laborContract);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}