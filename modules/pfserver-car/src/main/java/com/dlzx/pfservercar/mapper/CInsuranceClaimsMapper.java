package com.dlzx.pfservercar.mapper;

import java.util.List;
import com.dlzx.pfservercar.domain.CInsuranceClaims;

/**
 * 车辆管理-理赔Mapper接口
 * 
 * @author dlzx
 * @date 2020-12-03
 */
public interface CInsuranceClaimsMapper 
{
    /**
     * 查询车辆管理-理赔
     * 
     * @param id 车辆管理-理赔ID
     * @return 车辆管理-理赔
     */
    public CInsuranceClaims selectCInsuranceClaimsById(String id);

    /**
     * 查询车辆管理-理赔列表
     * 
     * @param cInsuranceClaims 车辆管理-理赔
     * @return 车辆管理-理赔集合
     */
    public List<CInsuranceClaims> selectCInsuranceClaimsList(CInsuranceClaims cInsuranceClaims);

    /**
     * 新增车辆管理-理赔
     * 
     * @param cInsuranceClaims 车辆管理-理赔
     * @return 结果
     */
    public int insertCInsuranceClaims(CInsuranceClaims cInsuranceClaims);

    /**
     * 修改车辆管理-理赔
     * 
     * @param cInsuranceClaims 车辆管理-理赔
     * @return 结果
     */
    public int updateCInsuranceClaims(CInsuranceClaims cInsuranceClaims);

    /**
     * 删除车辆管理-理赔
     * 
     * @param id 车辆管理-理赔ID
     * @return 结果
     */
    public int deleteCInsuranceClaimsById(String id);

    /**
     * 批量删除车辆管理-理赔
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCInsuranceClaimsByIds(String[] ids);
}
