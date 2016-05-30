package es.atrapandocucarachas.samplemvp;

import java.util.List;

class MainPresenterImpl implements MainPresenter, GetDataInteractor.OnFinishedListener {

    private MainView mainView;
    private GetDataInteractor getDataInteractor;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
        getDataInteractor = new GetDataInteractorImpl();
    }

    @Override
    public void onResume() {
        getDataInteractor.getData(this);
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
