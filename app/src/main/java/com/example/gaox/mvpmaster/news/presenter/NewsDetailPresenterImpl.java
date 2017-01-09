package com.example.gaox.mvpmaster.news.presenter;

import android.content.Context;

import com.example.gaox.mvpmaster.beans.NewsDetailBean;
import com.example.gaox.mvpmaster.news.model.NewsModel;
import com.example.gaox.mvpmaster.news.model.NewsModelImpl;
import com.example.gaox.mvpmaster.news.model.OnLoadNewsDetailListener;
import com.example.gaox.mvpmaster.news.view.NewsDetailView;


/**
 * Description :
 * Author : gx
 * Date   : 2015/12/21
 */
public class NewsDetailPresenterImpl implements NewsDetailPresenter, OnLoadNewsDetailListener {

    private Context mContent;
    private NewsDetailView mNewsDetailView;
    private NewsModel mNewsModel;

    public NewsDetailPresenterImpl(Context mContent, NewsDetailView mNewsDetailView) {
        this.mContent = mContent;
        this.mNewsDetailView = mNewsDetailView;
        mNewsModel = new NewsModelImpl();
    }

    @Override
    public void loadNewsDetail(final String docId) {
        mNewsDetailView.showProgress();
        mNewsModel.loadNewsDetail(docId, this);
    }


    @Override
    public void onSuccess(NewsDetailBean newsDetailBean) {
        if (newsDetailBean != null) {
            mNewsDetailView.showNewsDetialContent(newsDetailBean.getBody());
        }
        mNewsDetailView.hideProgress();
    }

    @Override
    public void onFailure(String msg, Exception e) {
        mNewsDetailView.hideProgress();
    }
}
