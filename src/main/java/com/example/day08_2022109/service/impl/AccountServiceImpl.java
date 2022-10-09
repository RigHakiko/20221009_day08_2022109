package com.example.day08_2022109.service.impl;

import com.example.day08_2022109.entity.Account;
import com.example.day08_2022109.mapper.AccountMapper;
import com.example.day08_2022109.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 朱虹运20221005
 * @since 2022-10-09
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
