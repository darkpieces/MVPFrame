package com.example.gaox.mvpmaster.images.model;


import com.example.gaox.mvpmaster.beans.ImageBean;
import com.example.gaox.mvpmaster.commons.Urls;
import com.example.gaox.mvpmaster.images.ImageJsonUtils;
import com.example.gaox.mvpmaster.utils.OkHttpUtils;

import java.util.List;

/**
 * Description :
 * Author : gx
 * Date   : 15/12/22
 */
public class ImageModelImpl implements ImageModel {

    /**
     * 获取图片列表
     * @param listener
     */
    @Override
    public void loadImageList(final OnLoadImageListListener listener) {
        String url = Urls.IMAGES_URL;
        OkHttpUtils.ResultCallback<String> loadNewsCallback = new OkHttpUtils.ResultCallback<String>() {
            @Override
            public void onSuccess(String response) {
                List<ImageBean> iamgeBeanList = ImageJsonUtils.readJsonImageBeans(response);
                listener.onSuccess(iamgeBeanList);
            }

            @Override
            public void onFailure(Exception e) {
                listener.onFailure("load image list failure.", e);
            }
        };
        OkHttpUtils.get(url, loadNewsCallback);
    }

    public interface OnLoadImageListListener {
        void onSuccess(List<ImageBean> list);
        void onFailure(String msg, Exception e);
    }
}
