package com.yc.tx.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: testspring
 * @description:
 * @author: 作者
 * @create: 2021-04-25 18:48
 */
@Data
public class ResultVO<T> implements Serializable {
    private static final long serialVersionUID = 4489019702689061082L;
    private Integer code;
    private T data;
    private String msg;
}
