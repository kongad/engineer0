package com.example.dao;

import com.example.entity.ProjectInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 项目立项信息(ProjectInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:35
 */
public interface ProjectInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProjectInfo queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ProjectInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param projectInfo 实例对象
     * @return 对象列表
     */
    List<ProjectInfo> queryAll(ProjectInfo projectInfo);

    /**
     * 新增数据
     *
     * @param projectInfo 实例对象
     * @return 影响行数
     */
    int insert(ProjectInfo projectInfo);

    /**
     * 修改数据
     *
     * @param projectInfo 实例对象
     * @return 影响行数
     */
    int update(ProjectInfo projectInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}