package com.example.gaox.mvpmaster.news.model;


import com.example.gaox.mvpmaster.beans.NewsBean;

import java.util.List;

/**
 * Description : 新闻列表加载回调
 * Author : gx
 * Date   : 2016/8/28
 */
public interface OnLoadNewsListListener {

    void onSuccess(List<NewsBean> list);

    void onFailure(String msg, Exception e);
}
