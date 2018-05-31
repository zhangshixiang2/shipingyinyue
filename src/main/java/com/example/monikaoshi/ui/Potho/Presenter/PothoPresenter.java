package com.example.monikaoshi.ui.Potho.Presenter;



;

import com.example.monikaoshi.base.Presenter.BasePresenter;
import com.example.monikaoshi.bean.PothoBean;
import com.example.monikaoshi.net.PothoAPi;
import com.example.monikaoshi.ui.Potho.Contract.PothoContract;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;



public class PothoPresenter extends BasePresenter<PothoContract.View> implements PothoContract.Presenter {
    private PothoAPi pothoAPi;
    @Inject
    public PothoPresenter(PothoAPi pothoAPi) {
        this.pothoAPi = pothoAPi;
    }

    @Override
    public void getPotho() {
        pothoAPi.getPotho()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<PothoBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(PothoBean pothoBean) {
                        mView.onSuccess(pothoBean);

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
