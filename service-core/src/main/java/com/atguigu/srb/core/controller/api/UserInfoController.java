package com.atguigu.srb.core.controller.api;


import com.atguigu.common.exception.Assert;
import com.atguigu.common.result.R;
import com.atguigu.common.result.ResponseEnum;
import com.atguigu.srb.core.pojo.vo.RegisterVO;
import com.atguigu.srb.core.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 用户基本信息 前端控制器
 * </p>
 *
 * @author Helen
 * @since 2021-02-20
 */
@Api(tags = "会员接口")
@RestController
@RequestMapping("/api/core/userInfo")
@Slf4j
@CrossOrigin
public class UserInfoController {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private UserInfoService userInfoService;

    @ApiOperation("会员注册")
    @PostMapping("/register")
    public R register(@RequestBody RegisterVO registerVO) {

        String mobile = registerVO.getMobile();
        String code = registerVO.getCode();

        //校验验证码是否正确
        String codeGen = (String) redisTemplate.opsForValue().get("srb:sms:code:" + mobile);
        Assert.equals(code, codeGen, ResponseEnum.CODE_ERROR);
        //注册
        userInfoService.register(registerVO);
        return R.ok().message("注册成功");
    }
}

