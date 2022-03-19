package com.example.tp_cycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tp_cycle.adapter.StarAdapter;
import com.example.tp_cycle.beans.Star;
import com.example.tp_cycle.service.StarService;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private List<Star> stars;
    private RecyclerView recyclerView;
    private StarAdapter starAdapter = null;
    private StarService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        stars = new ArrayList<>();
        service = StarService.getInstance();
        init();
        recyclerView = findViewById(R.id.recycle_view); //insérer le code
        //

        starAdapter = new StarAdapter(this, service.findAll());
        recyclerView.setAdapter(starAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void init() {

        service.create(new Star("Louis Vuitton", "https://i.pinimg.com/564x/5c/6b/9e/5c6b9ef4951161adeb7964867d848a68.jpg", 1));
        service.create(new Star("Polo Ralph Lauren", "https://i.pinimg.com/564x/11/c6/97/11c697f3682ba0b0dad311b31be8a76f.jpg", 1));
        service.create(new Star("H & M", "https://i.pinimg.com/564x/57/7e/07/577e0712b26a7f9ab959a9a0f44148c4.jpg", 1));
        service.create(new Star("Valentino", "https://i.pinimg.com/564x/d4/ec/2c/d4ec2c82e05e3a06c78361ddbc6386d9.jpg", 1));


        service.create(new Star("Chanel", "https://i.pinimg.com/564x/23/63/42/236342768eba3cf4684296a860dfede3.jpg", 3.5f));
        service.create(new Star("ZARA", "https://i.pinimg.com/564x/48/64/fd/4864fd205ac63a7663224b8c1f8baed2.jpg", 3));
        service.create(new Star("Nike", "https://i.pinimg.com/736x/34/c3/57/34c357ee31431b6cd13fe1ebe1d47980.jpg", 5));
        service.create(new Star("Adidas", "https://i.pinimg.com/564x/ec/5e/e1/ec5ee13b12698ee6abcde8b8cf8a601a.jpg", 1));
        service.create(new Star("Lacoste", "https://i.pinimg.com/564x/bc/25/99/bc25991e180a2fabe713d257187638f1.jpg", 5));
        service.create(new Star("Prada", "https://i.pinimg.com/564x/ff/63/30/ff63305199b7e4f5e0acf6ecca1973d7.jpg", 1));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem menuItem = menu.findItem(R.id.app_bar_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (starAdapter != null) {
                    starAdapter.getFilter().filter(newText);
                }
                return true;
            }
        });
        return true;
    }
    @Override public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.share)
        { String txt = "Stars";
            String mimeType = "text/plain";
            ShareCompat.IntentBuilder .from(this) .setType(mimeType) .setChooserTitle("Stars") .setText(txt) .startChooser();
        }
        return super.onOptionsItemSelected(item); }
}
