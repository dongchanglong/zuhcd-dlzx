package com.dlzx.pfservercar.service;

import java.util.List;
import com.dlzx.pfservercar.domain.CInsuranceType;

/**
 * 车辆管理-险种类别Service接口
 * 
 * @author jijawen
 * @date 2020-11-23
 */
public interface ICInsuranceTypeService 
{
    /**
     * 查询车辆管理-险种类别
     * 
     * @param id 车辆管理-险种类别ID
     * @return 车辆管理-险种类别
     */
    public CInsuranceType selectCInsuranceTypeById(String id);

    /**
     * 查询name条数
     * @param name
     * @return
     */
    public int countAll(String name);

    /**
     * 删除判断
     * @param
     * @return
     */
    public int countAllEdit(String name);

    /**
     * 查询车辆管理-险种类别列表
     * 
     * @param cInsuranceType 车辆管理-险种类别
     * @return 车辆管理-险种类别集合
     */
    public List<CInsuranceType> selectCInsuranceTypeList(CInsuranceType cInsuranceType);

    /**
     * 新增车辆管理-险种类别
     * 
     * @param cInsuranceType 车辆管理-险种类别
     * @return 结果
     */
    public int insertCInsuranceType(CInsuranceType cInsuranceType);

    /**
     * 修改车辆管理-险种类别
     * 
     * @param cInsuranceType 车辆管理-险种类别
     * @return 结果
     */
    public int updateCInsuranceType(CInsuranceType cInsuranceType);

    /**
     * 批量删除车辆管理-险种类别
     * 
     * @param ids 需要删除的车辆管理-险种类别ID
     * @return 结果
     */
    public int deleteCInsuranceTypeByIds(String[] ids);

    /**
     * 删除车辆管理-险种类别信息
     * 
     * @param id 车辆管理-险种类别ID
     * @return 结果
     */
    public int deleteCInsuranceTypeById(String id);
}
