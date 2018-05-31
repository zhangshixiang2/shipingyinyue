package com.example.monikaoshi.ui.Video.Presenter;





import com.example.monikaoshi.base.Presenter.BasePresenter;
import com.example.monikaoshi.bean.VideoBean;
import com.example.monikaoshi.net.VideoAPi;
import com.example.monikaoshi.ui.Video.Contract.VideoContract;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;



public class VideoPresenter extends BasePresenter<VideoContract.View> implements VideoContract.Presenter {
    private VideoAPi videoAPi;
    @Inject
    public VideoPresenter(VideoAPi videoAPi) {
        this.videoAPi = videoAPi;
    }

    @Override
    public void getVideo() {
        videoAPi.getVideo()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<VideoBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(VideoBean videoBean) {
                        mView.onSuccess(videoBean);

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
