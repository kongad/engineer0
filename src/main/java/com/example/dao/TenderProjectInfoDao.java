package com.example.dao;

import com.example.entity.TenderProjectInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 投标项目信息(TenderProjectInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public interface TenderProjectInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    TenderProjectInfo queryById( );

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TenderProjectInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tenderProjectInfo 实例对象
     * @return 对象列表
     */
    List<TenderProjectInfo> queryAll(TenderProjectInfo tenderProjectInfo);

    /**
     * 新增数据
     *
     * @param tenderProjectInfo 实例对象
     * @return 影响行数
     */
    int insert(TenderProjectInfo tenderProjectInfo);

    /**
     * 修改数据
     *
     * @param tenderProjectInfo 实例对象
     * @return 影响行数
     */
    int update(TenderProjectInfo tenderProjectInfo);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 影响行数
     */
    int deleteById( );

}