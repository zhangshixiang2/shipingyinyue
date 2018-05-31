package com.example.monikaoshi.net;





import com.example.monikaoshi.bean.VideoBean;

import io.reactivex.Observable;



public class VideoAPi {
    private static VideoAPi videoAPi;
    private VideoAPiService videoAPiService;


    private VideoAPi(VideoAPiService videoAPiService) {

        this.videoAPiService = videoAPiService;
    }


    public static VideoAPi getVideoAPi(VideoAPiService videoAPiService) {
        if (videoAPi == null) {
            videoAPi = new VideoAPi(videoAPiService);
        }
        return videoAPi;
    }


    public Observable<VideoBean> getVideo() {
        return videoAPiService.getVideo();
    }
}
