package com.example.ermasofttest;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ermasofttest.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView carListRecyclerView;
    private CarAdapter carAdapter;
    private List<Car> carList = new ArrayList<>();
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carListRecyclerView = findViewById(R.id.car_list);
        carAdapter = new CarAdapter(generateCarList());
        carListRecyclerView.setAdapter(carAdapter);
        carListRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public List<Car> generateCarList() {
        Manufacturer audi = new Manufacturer(ManufacturerName.AUDI);
        Manufacturer lexus = new Manufacturer(ManufacturerName.LEXUS);
        Manufacturer kia = new Manufacturer(ManufacturerName.KIA);

        HashMap<String, Integer> details1 = new HashMap<>();
        HashMap<String, Integer> details2 = new HashMap<>();
        HashMap<String, Integer> details3 = new HashMap<>();
        details1.put("Датчик осадков", 30000);
        details1.put("Парктроник", 15000);
        details2.put("Подогрев руля", 10000);
        details2.put("Подогрев сидений", 50000);
        details3.put("ABS", 40000);
        details3.put("ESP", 15000);

        carList.add(new Car(new Model("A7", audi, 5000000), details1));
        carList.add(new Car(new Model("UX", lexus, 7300000), details2));
        carList.add(new Car(new Model("Ceed", kia, 1800000), details3));
        carList.add(new Car(new Model("RX", lexus, 6700000), details2));
        carList.add(new Car(new Model("ES", lexus, 11200000), details3));
        carList.add(new Car(new Model("R8", audi, 9000000), details1));
        carList.add(new Car(new Model("Q7", audi, 10500000), details1));
        carList.add(new Car(new Model("Sportage", kia, 3000000), details3));
        carList.add(new Car(new Model("Stinger", kia, 3500000), details2));
        carList.add(new Car(new Model("A7", audi, 5000000), details1));
        return carList;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}