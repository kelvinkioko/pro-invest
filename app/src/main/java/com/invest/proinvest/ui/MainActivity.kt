package com.invest.proinvest.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.findNavController
import com.invest.proinvest.R
import com.invest.proinvest.databinding.ActivityMainBinding
import com.invest.proinvest.ui.menu.MainMenuDialog

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpBottomNavigationAndFab()
    }

    private fun setUpBottomNavigationAndFab() {
        binding.apply {
            bottomAppBar.replaceMenu(R.menu.main_menu)

            findNavController(R.id.navHostFragment).addOnDestinationChangedListener { _, _, args ->
                bottomAppBar.isVisible = (args?.getBoolean("hasBottomNav") == true)
            }

            bottomAppBarContentContainer.setOnClickListener { }

            bottomAppBar.setOnMenuItemClickListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.menu_item_menu -> {
                        // Handle search icon press
                        val bottomSheetFragment = MainMenuDialog()
                        bottomSheetFragment.show(this@MainActivity.supportFragmentManager, bottomSheetFragment.tag)
                        true
                    }
                    else -> false
                }
            }
        }
    }
}
