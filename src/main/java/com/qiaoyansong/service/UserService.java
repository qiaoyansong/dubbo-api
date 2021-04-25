package com.qiaoyansong.service;

import com.qiaoyansong.entity.UserAddress;

import java.util.List;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2021/4/21 20:35
 */
public interface UserService {
	
	/**
	 * 按照用户id返回所有的收货地址
	 * @param userId
	 * @return
	 */
	List<UserAddress> getUserAddressList(String userId);

}
