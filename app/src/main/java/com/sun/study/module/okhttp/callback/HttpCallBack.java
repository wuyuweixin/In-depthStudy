package com.sun.study.module.okhttp.callback;

/**
 * Created by sunfusheng on 15/12/08.
 */
public interface HttpCallBack {

    //请求开始回调
    void onCallStart();

    //上传、下载进度回调
    void onLoading(float progress);

    //请求成功回调
	void onSuccess(String responseInfo);

    //请求失败回调
    void onFailure(Exception error, String msg);

}