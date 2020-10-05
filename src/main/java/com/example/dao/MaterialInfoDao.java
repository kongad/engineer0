package com.example.dao;

import com.example.entity.MaterialInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 材料基础库(MaterialInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public interface MaterialInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    MaterialInfo queryById( );

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MaterialInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param materialInfo 实例对象
     * @return 对象列表
     */
    List<MaterialInfo> queryAll(MaterialInfo materialInfo);

    /**
     * 新增数据
     *
     * @param materialInfo 实例对象
     * @return 影响行数
     */
    int insert(MaterialInfo materialInfo);

    /**
     * 修改数据
     *
     * @param materialInfo 实例对象
     * @return 影响行数
     */
    int update(MaterialInfo materialInfo);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 影响行数
     */
    int deleteById( );

}