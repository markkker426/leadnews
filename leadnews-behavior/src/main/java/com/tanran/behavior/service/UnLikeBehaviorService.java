package com.tanran.behavior.service;

import com.tanran.common.result.RespResult;
import com.tanran.model.behavior.dtos.ShowBehaviorDto;
import com.tanran.model.behavior.dtos.UnLikesBehaviorDto;

/**
 * TODO
 *
 * @author liuht26262@yunrong.cn
 * @version V3.0
 * @description
 * @since 3.0.x 2022/3/23 17:37
 */
public interface UnLikeBehaviorService {
    RespResult SaveUnLikeBehavior(UnLikesBehaviorDto dto);
    RespResult deleteUsweBehavior(UnLikesBehaviorDto dto);

}
