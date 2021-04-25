package com.qiaoyansong.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2021/4/21 20:35
 * description：用户收货地址，建议将entity以及service全部提取出来
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress implements Serializable {

    private static final long serialVersionUID = -1377308691839209777L;

    private Integer id;
    /**
     * 用户地址
     */
    private String userAddress;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 收货人
     */
    private String consignee;
    /**
     * 电话号码
     */
    private String phoneNum;
    /**
     * 是否为默认地址    Y-是     N-否
     */
    private String isDefault;

}
