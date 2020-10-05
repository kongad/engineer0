package com.example.dao;

import com.example.entity.BuyBiddingbook;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 招标书购买(BuyBiddingbook)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-05 10:18:35
 */
public interface BuyBiddingbookDao {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    BuyBiddingbook queryById( );

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BuyBiddingbook> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param buyBiddingbook 实例对象
     * @return 对象列表
     */
    List<BuyBiddingbook> queryAll(BuyBiddingbook buyBiddingbook);

    /**
     * 新增数据
     *
     * @param buyBiddingbook 实例对象
     * @return 影响行数
     */
    int insert(BuyBiddingbook buyBiddingbook);

    /**
     * 修改数据
     *
     * @param buyBiddingbook 实例对象
     * @return 影响行数
     */
    int update(BuyBiddingbook buyBiddingbook);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 影响行数
     */
    int deleteById( );

}