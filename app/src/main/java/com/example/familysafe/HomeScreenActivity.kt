package com.example.familysafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        val bottomBar:BottomNavigationView = findViewById(R.id.bottomBar)

        bottomBar.setOnItemSelectedListener {
            if(it.itemId==R.id.nav_guard){
                inflateGuardFragment(GuardFragment.newInstance("h","e"))
            }else if(it.itemId==R.id.nav_home){
                inflateGuardFragment(HomeFragment.newInstance("h","e"))
            }else if(it.itemId==R.id.nav_dashboard){
                inflateGuardFragment(DashboardFragment.newInstance("h","e"))
            }else if(it.itemId==R.id.nav_user){
                inflateGuardFragment(UserFragment.newInstance("h","e"))
            }
            true

        }
    }

    private fun inflateGuardFragment(p1: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout,p1)
        transaction.commit()
    }
}