package com.example.dao;

import com.example.entity.IncomeContract;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 收入合同(IncomeContract)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:37
 */
public interface IncomeContractDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    IncomeContract queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<IncomeContract> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param incomeContract 实例对象
     * @return 对象列表
     */
    List<IncomeContract> queryAll(IncomeContract incomeContract);

    /**
     * 新增数据
     *
     * @param incomeContract 实例对象
     * @return 影响行数
     */
    int insert(IncomeContract incomeContract);

    /**
     * 修改数据
     *
     * @param incomeContract 实例对象
     * @return 影响行数
     */
    int update(IncomeContract incomeContract);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}