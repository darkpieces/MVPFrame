package com.example.gaox.mvpmaster.news.model;

/**
 * Description :
 * Author : gx
 * Date   : 15/12/19
 */
public interface NewsModel {

    void loadNews(String url, int type, OnLoadNewsListListener listener);

    void loadNewsDetail(String docid, OnLoadNewsDetailListener listener);

}
