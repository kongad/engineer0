package com.example.dao;

import com.example.entity.IdentifyInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 证件信息表(IdentifyInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:37
 */
public interface IdentifyInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    IdentifyInfo queryById( );

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<IdentifyInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param identifyInfo 实例对象
     * @return 对象列表
     */
    List<IdentifyInfo> queryAll(IdentifyInfo identifyInfo);

    /**
     * 新增数据
     *
     * @param identifyInfo 实例对象
     * @return 影响行数
     */
    int insert(IdentifyInfo identifyInfo);

    /**
     * 修改数据
     *
     * @param identifyInfo 实例对象
     * @return 影响行数
     */
    int update(IdentifyInfo identifyInfo);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 影响行数
     */
    int deleteById( );

}