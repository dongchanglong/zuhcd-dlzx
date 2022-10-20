package com.dlzx.pfserverparts.mapper;

import java.util.List;
import com.dlzx.pfserverparts.domain.GGoodsType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * 库存管理-物品类别Mapper接口
 * 
 * @author dlzx
 * @date 2020-12-01
 */
public interface GGoodsTypeMapper 
{
    /**
     * 查询库存管理-物品类别
     * 
     * @param id 库存管理-物品类别ID
     * @return 库存管理-物品类别
     */
    public GGoodsType selectGGoodsTypeById(String id);

    public int countAll(@Param("name") String name);

    public int countAllEdit(@Param("name") String name);

    /**
     * 查询库存管理-物品类别列表
     * 
     * @param gGoodsType 库存管理-物品类别
     * @return 库存管理-物品类别集合
     */
    public List<GGoodsType> selectGGoodsTypeList(GGoodsType gGoodsType);

    /**
     * 新增库存管理-物品类别
     * 
     * @param gGoodsType 库存管理-物品类别
     * @return 结果
     */
    public int insertGGoodsType(GGoodsType gGoodsType);

    /**
     * 修改库存管理-物品类别
     * 
     * @param gGoodsType 库存管理-物品类别
     * @return 结果
     */
    public int updateGGoodsType(GGoodsType gGoodsType);

    /**
     * 删除库存管理-物品类别
     * 
     * @param id 库存管理-物品类别ID
     * @return 结果
     */
    public int deleteGGoodsTypeById(String id);

    /**
     * 批量删除库存管理-物品类别
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGGoodsTypeByIds(String[] ids);

    /**
     * @describe
     * @author DongCL
     * @date 2021-01-19 14:35
     * @param
     * @return
     */
    List<GGoodsType> queryIsdeleteGoodTypeList();
}
