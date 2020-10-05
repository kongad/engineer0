package com.example.dao;

import com.example.entity.BuildListMaintain;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 施工清单维护主表(BuildListMaintain)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public interface BuildListMaintainDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BuildListMaintain queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BuildListMaintain> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param buildListMaintain 实例对象
     * @return 对象列表
     */
    List<BuildListMaintain> queryAll(BuildListMaintain buildListMaintain);

    /**
     * 新增数据
     *
     * @param buildListMaintain 实例对象
     * @return 影响行数
     */
    int insert(BuildListMaintain buildListMaintain);

    /**
     * 修改数据
     *
     * @param buildListMaintain 实例对象
     * @return 影响行数
     */
    int update(BuildListMaintain buildListMaintain);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}