package com.example.monikaoshi.ui.Video.Contract;


import com.example.monikaoshi.base.Contract.BaseContract;
import com.example.monikaoshi.bean.VideoBean;

public interface VideoContract {
    interface View extends BaseContract.BaseView{
        void onSuccess(VideoBean videoBean);

    }
    interface Presenter extends BaseContract.BasePresenter<View>{
        void getVideo();
    }
}
