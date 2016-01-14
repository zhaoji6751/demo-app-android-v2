/*
    ShengDao Android Client, OnDataListener
    Copyright (c) 2014 ShengDao Tech Company Limited
 */

package io.rong.app.server.network.async;


import io.rong.app.server.network.http.HttpException;

public interface OnDataListener {

	/**
	 * 异步耗时方法
	 * @param requsetCode 请求码
	 * @return
	 * @throws HttpException
	 */
	public Object doInBackground(int requsetCode) throws HttpException;
	
	/**
	 * 成功方法（可直接更新UI）
	 * @param requestCode 请求码
	 * @param result 返回结果
	 */
	public void onSuccess(int requestCode, Object result);
	
	/**
	 * 失败方法（可直接更新UI）
	 * @param requestCode 请求码
	 * @param state 返回状态
	 * @param result 返回结果
	 */
	public void onFailure(int requestCode, int state, Object result);
}
