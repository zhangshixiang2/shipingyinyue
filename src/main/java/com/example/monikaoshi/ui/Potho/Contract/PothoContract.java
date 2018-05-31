package com.example.monikaoshi.ui.Potho.Contract;


import com.example.monikaoshi.base.Contract.BaseContract;
import com.example.monikaoshi.bean.PothoBean;

public interface PothoContract {
    interface View extends BaseContract.BaseView{
        void onSuccess(PothoBean pothoBean);

    }
    interface Presenter extends BaseContract.BasePresenter<View>{
        void getPotho();
    }

}
