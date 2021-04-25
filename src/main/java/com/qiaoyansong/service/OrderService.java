package com.qiaoyansong.service;

import com.qiaoyansong.entity.UserAddress;

import java.util.List;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2021/4/21 20:35
 */
public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId 用户ID
	 * @return 返回值
	 */
	List<UserAddress> initOrder(String userId);

}
