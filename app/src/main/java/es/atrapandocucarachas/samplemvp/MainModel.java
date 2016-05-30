package es.atrapandocucarachas.samplemvp;

import java.util.List;

/**
 * Created by Alejandro Platas Mallo
 * on 30/5/16.
 * V. 1.00
 */
public interface MainModel {

    interface OnFinishedListener {
        void onFinished(List<String> mItems);
    }

    void getData(OnFinishedListener listener);
}
