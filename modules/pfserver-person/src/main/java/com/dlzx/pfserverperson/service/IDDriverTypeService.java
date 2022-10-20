package com.dlzx.pfserverperson.service;

import java.util.List;
import com.dlzx.pfserverperson.domain.DDriverType;

/**
 * 驾驶员-驾驶员类型Service接口
 * 
 * @author yangluhe
 * @date 2020-11-18
 */
public interface IDDriverTypeService 
{
    /**
     * 查询驾驶员-驾驶员类型
     * 
     * @param id 驾驶员-驾驶员类型ID
     * @return 驾驶员-驾驶员类型
     */
    public DDriverType selectDDriverTypeById(String id);

    /**
     * 查询驾驶员-驾驶员类型列表
     * 
     * @param dDriverType 驾驶员-驾驶员类型
     * @return 驾驶员-驾驶员类型集合
     */
    public List<DDriverType> selectDDriverTypeList(DDriverType dDriverType);

    /**
     * 新增驾驶员-驾驶员类型
     * 
     * @param dDriverType 驾驶员-驾驶员类型
     * @return 结果
     */
    public int insertDDriverType(DDriverType dDriverType);

    /**
     * 修改驾驶员-驾驶员类型
     * 
     * @param dDriverType 驾驶员-驾驶员类型
     * @return 结果
     */
    public int updateDDriverType(DDriverType dDriverType);

    /**
     * 批量删除驾驶员-驾驶员类型
     * 
     * @param ids 需要删除的驾驶员-驾驶员类型ID
     * @return 结果
     */
    public int deleteDDriverTypeByIds(String[] ids);

    /**
     * 删除驾驶员-驾驶员类型信息
     * 
     * @param id 驾驶员-驾驶员类型ID
     * @return 结果
     */
    public int deleteDDriverTypeById(String id);
}
