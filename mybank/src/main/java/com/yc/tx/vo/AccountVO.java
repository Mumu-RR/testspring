package com.yc.tx.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: testspring
 * @description:
 * @author: 作者
 * @create: 2021-04-25 18:43
 */
@Data
public class AccountVO implements Serializable {
    private static final long serialVersionUID = 3340290823802500612L;

    private Integer accountId;
    private Double money;
    private Integer inAccountId;


}
