package com.example.testprojekflashdelivery;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                Fragment selectedFragment = null;

                switch(menuItem.getItemId()) {
                    case R.id.nav_home :
                        selectedFragment = new HomeFragment();
                        break;
                    case R.id.nav_search :
                        selectedFragment = new CekStatusFragment();
                        break;
                    case R.id.nav_services :
                        selectedFragment = new ServicesFragment();
                        break;
                    case R.id.nav_about :
                        selectedFragment = new AboutFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragement_container,
                        selectedFragment).commit();

                // Tutup navigation drawer setelah klik item
                drawer.closeDrawer(GravityCompat.START);

                return true;
            }
        });

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        // set default fragment ketika app pertama kali jalan
        if(savedInstanceState == null) {

            // Kode untuk menampilkan tampilan MessageFragment sebagai halaman utama
            getSupportFragmentManager().beginTransaction().replace(R.id.fragement_container,
                    new HomeFragment()).commit();

            // Set item yang pertama kali di pilih adalah message item
            navigationView.setCheckedItem(R.id.nav_home);
        }
    }

    @Override
    public void onBackPressed() {

        // Jika tombol 'Back' di klik dan Navigation Drawer terbuka
        // maka tutup Navigation Drawer
        if(drawer.isDrawerOpen(GravityCompat.START)) {

            drawer.closeDrawer(GravityCompat.START);
        }

        // Jika Navigation drawer tidak terbuka dan back button di klik
        else {

            // balik ke activity sebelumnya
            super.onBackPressed();
        }
    }

    // Ubah title Activity / Fragment
    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }


}
