package com.example.gaox.mvpmaster.images.presenter;


import com.example.gaox.mvpmaster.beans.ImageBean;
import com.example.gaox.mvpmaster.images.model.ImageModel;
import com.example.gaox.mvpmaster.images.model.ImageModelImpl;
import com.example.gaox.mvpmaster.images.view.ImageView;

import java.util.List;

/**
 * Description :
 * Author : gx
 * Date   : 15/12/22
 */
public class ImagePresenterImpl implements ImagePresenter, ImageModelImpl.OnLoadImageListListener {

    private ImageModel mImageModel;
    private ImageView mImageView;

    public ImagePresenterImpl(ImageView imageView) {
        this.mImageModel = new ImageModelImpl();
        this.mImageView = imageView;
    }

    @Override
    public void loadImageList() {
        mImageView.showProgress();
        mImageModel.loadImageList(this);
    }

    @Override
    public void onSuccess(List<ImageBean> list) {
        mImageView.addImages(list);
        mImageView.hideProgress();
    }

    @Override
    public void onFailure(String msg, Exception e) {
        mImageView.hideProgress();
        mImageView.showLoadFailMsg();
    }
}
