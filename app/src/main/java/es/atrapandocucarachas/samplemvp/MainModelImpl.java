package es.atrapandocucarachas.samplemvp;

/**
 * Created by Alejandro Platas Mallo
 * on 30/5/16.
 * V. 1.00
 */

public class MainModelImpl implements MainModel {

    @Override
    public void getData(OnFinishedListener listener) {
        listener.onFinished(Data.getData());
    }
}
