package com.example.dao;

import com.example.entity.TechnicalDisclosure;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 技术交底(TechnicalDisclosure)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:35
 */
public interface TechnicalDisclosureDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TechnicalDisclosure queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TechnicalDisclosure> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param technicalDisclosure 实例对象
     * @return 对象列表
     */
    List<TechnicalDisclosure> queryAll(TechnicalDisclosure technicalDisclosure);

    /**
     * 新增数据
     *
     * @param technicalDisclosure 实例对象
     * @return 影响行数
     */
    int insert(TechnicalDisclosure technicalDisclosure);

    /**
     * 修改数据
     *
     * @param technicalDisclosure 实例对象
     * @return 影响行数
     */
    int update(TechnicalDisclosure technicalDisclosure);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}