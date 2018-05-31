package com.example.monikaoshi.net;




import com.example.monikaoshi.bean.PothoBean;

import io.reactivex.Observable;
import retrofit2.http.GET;



public interface PothoAPiService {
    @GET("satinApi?type=3&page=1")
    Observable<PothoBean> getPotho();

}
