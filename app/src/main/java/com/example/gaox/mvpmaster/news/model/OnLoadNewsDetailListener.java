package com.example.gaox.mvpmaster.news.model;


import com.example.gaox.mvpmaster.beans.NewsDetailBean;

/**
 * Description : 新闻详情加载回调
 * Author : gx
 * Date   : 2016/8/28
 */
public interface OnLoadNewsDetailListener {

    void onSuccess(NewsDetailBean newsDetailBean);

    void onFailure(String msg, Exception e);
}
