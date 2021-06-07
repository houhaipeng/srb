package com.atguigu.srb.core.service.impl;

import com.atguigu.srb.core.pojo.entity.UserInfo;
import com.atguigu.srb.core.mapper.UserInfoMapper;
import com.atguigu.srb.core.pojo.vo.RegisterVO;
import com.atguigu.srb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author Helen
 * @since 2021-02-20
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Override
    public void register(RegisterVO registerVO) {
        //插入用户信息:user_info

        //插入用户账户记录:user_account
    }
}
