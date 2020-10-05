package com.example.dao;

import com.example.entity.QualityReview;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 资格自审(QualityReview)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:35
 */
public interface QualityReviewDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    QualityReview queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<QualityReview> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param qualityReview 实例对象
     * @return 对象列表
     */
    List<QualityReview> queryAll(QualityReview qualityReview);

    /**
     * 新增数据
     *
     * @param qualityReview 实例对象
     * @return 影响行数
     */
    int insert(QualityReview qualityReview);

    /**
     * 修改数据
     *
     * @param qualityReview 实例对象
     * @return 影响行数
     */
    int update(QualityReview qualityReview);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}