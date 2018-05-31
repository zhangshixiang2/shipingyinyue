package com.example.monikaoshi.Component;





import com.example.monikaoshi.Modul.HttpModule;
import com.example.monikaoshi.ui.Potho.PothoFragment;
import com.example.monikaoshi.ui.Video.VideoFragment;

import dagger.Component;


@Component(modules = HttpModule.class)
public interface HttpComponent {
    void inject(PothoFragment pothoFragment);
    void inject(VideoFragment videoFragment);
}
