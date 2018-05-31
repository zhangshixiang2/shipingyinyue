package com.example.monikaoshi.net;





import com.example.monikaoshi.bean.VideoBean;

import io.reactivex.Observable;
import retrofit2.http.GET;



public interface VideoAPiService {
    @GET("satinApi?type=4&page=1")
    Observable<VideoBean> getVideo();

}
