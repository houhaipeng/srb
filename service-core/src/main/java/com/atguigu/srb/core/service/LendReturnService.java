package com.atguigu.srb.core.service;

import com.atguigu.srb.core.pojo.entity.LendReturn;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 还款记录表 服务类
 * </p>
 *
 * @author Helen
 * @since 2021-02-20
 */
public interface LendReturnService extends IService<LendReturn> {

    List<LendReturn> selectByLendId(Long lendId);
}
