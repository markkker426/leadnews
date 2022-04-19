package com.tanran.admin.service.impl.commfilter;

import com.tanran.model.admin.dtos.CommonDto;
import com.tanran.model.admin.dtos.CommonWhereDto;
import com.tanran.model.admin.pojos.AdUser;


/**
 *
 *
 * @author liuht26262@yunrong.cn
 * @version V3.0
 * @description
 * @since 2022/4/17 9:40
 */


/**
 * 通用过滤的过滤类  后置增强类
 */
public interface BaseCommonFilter {

    void doListAfter(AdUser user, CommonDto dto);
    void doUpdateAfter(AdUser user, CommonDto dto);
    void doInsertAfter(AdUser user, CommonDto dto);
    void doDeleteAfter(AdUser user, CommonDto dto);

    /**
     * 获取更新字段里面的值
     * @param filed
     * @param dto
     * @return
     */
    default CommonWhereDto findUpdateValue(String filed,CommonDto dto){
        if(dto!=null){
            for (CommonWhereDto cw : dto.getSets()) {
                if(filed.equals(cw.getFiled())){
                    return cw;
                }
            }
        }
        return null;
    }

    /**
     * 获取查询字段里面的值
     * @param filed
     * @param dto
     * @return
     */
    default CommonWhereDto findWhereValue(String filed,CommonDto dto){
        if(dto!=null){
            for (CommonWhereDto cw : dto.getWhere()) {
                if(filed.equals(cw.getFiled())){
                    return cw;
                }
            }
        }
        return null;
    }
}
