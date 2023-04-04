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
            when (it.itemId) {
                R.id.nav_guard -> {
                    inflateGuardFragment(GuardFragment.newInstance("h","e"))
                }
                R.id.nav_home -> {
                    inflateGuardFragment(HomeFragment.newInstance("h","e"))
                }
                R.id.nav_dashboard -> {
                    inflateGuardFragment(DashboardFragment.newInstance("h","e"))
                }
                R.id.nav_user -> {
                    inflateGuardFragment(UserFragment.newInstance("h","e"))
                }
            }
            true
        }
        bottomBar.selectedItemId=R.id.nav_home
    }

    private fun inflateGuardFragment(p1: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout,p1)
        transaction.commit()
    }
}