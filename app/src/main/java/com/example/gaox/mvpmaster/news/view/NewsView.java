package com.example.gaox.mvpmaster.news.view;


import com.example.gaox.mvpmaster.beans.NewsBean;

import java.util.List;

/**
 * Description :
 * Author : gx
 * Date   : 15/12/18
 */
public interface NewsView {

    void showProgress();

    void addNews(List<NewsBean> newsList);

    void hideProgress();

    void showLoadFailMsg();
}
