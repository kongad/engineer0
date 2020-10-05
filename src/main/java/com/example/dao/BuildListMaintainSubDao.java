package com.example.dao;

import com.example.entity.BuildListMaintainSub;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 施工清单维护子表(BuildListMaintainSub)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:37
 */
public interface BuildListMaintainSubDao {

    /**
     * 通过ID查询单条数据
     *
     * @param buildNo 主键
     * @return 实例对象
     */
    BuildListMaintainSub queryById(String buildNo);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BuildListMaintainSub> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param buildListMaintainSub 实例对象
     * @return 对象列表
     */
    List<BuildListMaintainSub> queryAll(BuildListMaintainSub buildListMaintainSub);

    /**
     * 新增数据
     *
     * @param buildListMaintainSub 实例对象
     * @return 影响行数
     */
    int insert(BuildListMaintainSub buildListMaintainSub);

    /**
     * 修改数据
     *
     * @param buildListMaintainSub 实例对象
     * @return 影响行数
     */
    int update(BuildListMaintainSub buildListMaintainSub);

    /**
     * 通过主键删除数据
     *
     * @param buildNo 主键
     * @return 影响行数
     */
    int deleteById(String buildNo);

}