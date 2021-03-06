package com.example.monikaoshi.net;





import com.example.monikaoshi.bean.PothoBean;

import io.reactivex.Observable;



public class PothoAPi {
    private static PothoAPi pothoAPi;
    private PothoAPiService pothoAPiService;


    private PothoAPi(PothoAPiService pothoAPiService) {
        this.pothoAPiService = pothoAPiService;
    }


    public static PothoAPi getPothoAPi(PothoAPiService pothoAPiService) {
        if (pothoAPi == null) {
            pothoAPi = new PothoAPi(pothoAPiService);
        }
        return pothoAPi;
    }


    public Observable<PothoBean> getPotho() {
        return pothoAPiService.getPotho();
    }
}
