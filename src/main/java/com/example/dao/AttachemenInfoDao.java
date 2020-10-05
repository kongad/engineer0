package com.example.dao;

import com.example.entity.AttachemenInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 附件文件表(AttachemenInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public interface AttachemenInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AttachemenInfo queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AttachemenInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param attachemenInfo 实例对象
     * @return 对象列表
     */
    List<AttachemenInfo> queryAll(AttachemenInfo attachemenInfo);

    /**
     * 新增数据
     *
     * @param attachemenInfo 实例对象
     * @return 影响行数
     */
    int insert(AttachemenInfo attachemenInfo);

    /**
     * 修改数据
     *
     * @param attachemenInfo 实例对象
     * @return 影响行数
     */
    int update(AttachemenInfo attachemenInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}