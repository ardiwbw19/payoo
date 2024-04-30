package com.example.payoo

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.Observer
import com.example.payoo.databinding.ActivityMainBinding
import com.example.payoo.response.UserResponse
import com.example.payoo.response.UserResponseItem
import com.example.payoo.retrofit.ApiConfig
import com.google.android.material.navigation.NavigationView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var binding : ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        drawerLayout = findViewById(R.id.drawer_layout)

        val recyclerView = binding.rvCard

        val apiService = ApiConfig.getApiService()
        val userId = "1" // Ganti dengan ID pengguna yang sesuai

        apiService.getUserProfile(userId).enqueue(object : Callback<UserResponse> {
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                if (response.isSuccessful) {
                    val userResponse = response.body()
                    val username = userResponse?.userResponse?.get(0)?.username
                    binding.user.text = "Username: $username"
                    Toast.makeText(this@MainActivity, "Koneksi berhasil", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this@MainActivity, "Koneksi anu", Toast.LENGTH_SHORT).show()

                }
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {

                Toast.makeText(this@MainActivity, "Koneksi gagal", Toast.LENGTH_SHORT).show()
            }
        })


       binding.btnMenu.setOnClickListener {
            drawerLayout.openDrawer(binding.navMenu)
        }
        val navigationView: NavigationView = findViewById(R.id.nav_menu)
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_produk -> {
                    val intent = Intent(this@MainActivity, Menu3Activity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}