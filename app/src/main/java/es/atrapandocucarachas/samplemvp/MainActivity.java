package es.atrapandocucarachas.samplemvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity
        implements MainView {

    private MainPresenter presenter;
    private ListView list;

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenterImpl(this);

        list = (ListView) this.findViewById(R.id.list);


    }

    @Override
    public void setItems(List<String> mItems) {
        ArrayAdapter<String> mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mItems);
        list.setAdapter(mAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
