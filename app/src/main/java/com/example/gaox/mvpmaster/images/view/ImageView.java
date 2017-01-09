package com.example.gaox.mvpmaster.images.view;


import com.example.gaox.mvpmaster.beans.ImageBean;

import java.util.List;

/**
 * Description :
 * Author : gx
 * Date   : 15/12/22
 */
public interface ImageView {
    void addImages(List<ImageBean> list);
    void showProgress();
    void hideProgress();
    void showLoadFailMsg();
}
