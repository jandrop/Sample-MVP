package es.atrapandocucarachas.samplemvp;

import java.util.List;

class MainPresenterImpl implements MainPresenter, MainModel.OnFinishedListener {

    private MainView mainView;
    private MainModel mainModel;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
        mainModel = new MainModelImpl();
    }

    @Override
    public void onResume() {
        mainModel.getData(this);
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }

    @Override
    public void onFinished(List<String> mItems) {
        if(mainView!=null){
            mainView.setItems(mItems);
        }
    }
}
