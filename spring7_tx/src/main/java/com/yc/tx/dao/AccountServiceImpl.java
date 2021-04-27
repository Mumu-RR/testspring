package com.yc.tx.dao;

import com.yc.tx.bean.Accounts;
import com.yc.tx.bean.OpRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: testspring
 * @description:
 * @author: 作者
 * @create: 2021-04-17 16:41
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,
        isolation = Isolation.DEFAULT,
        readOnly = false,
        timeout = 100,
        rollbackForClassName = {"RuntimeException"})
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountsDao accountsDao;
    @Autowired
    private OpRecordDao opRecordDao;

    @Override
    public Integer openAccount(Accounts account, double money) {
        return null;
    }

    @Override
    public Accounts deposite(Accounts account, double money, String optype, String transferid) {
        return null;
    }

    @Override
    public Accounts withdraw(Accounts account, double money, String optype, String transferid) {
        return null;
    }


    @Override
    public Accounts transfer(Accounts inAccount, Accounts outAccount, double money) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public Accounts showBalance(Accounts account) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<OpRecord> findById(Accounts account) {
        return null;
    }

}
