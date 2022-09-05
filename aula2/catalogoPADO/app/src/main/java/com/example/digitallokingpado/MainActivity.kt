package com.example.digitallokingpado

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainToolbar = findViewById<MaterialToolbar>(R.id.mainToolBar)
        mainToolbar.setNavigationOnClickListener {
            Toast.makeText(this,
             "Hamburguer pressionado!!!",
            Toast.LENGTH_SHORT)
                .show()
        }
        mainToolbar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_item_notications -> {
                    Toast.makeText(
                        this,
                        "Ir para a página de notificações!!!",
                        Toast.LENGTH_SHORT
                    ).show()

                    true
                }
                R.id.menu_item_cart -> {
                    Toast.makeText(
                        this,
                        "Ir para a página do carrinho!!!",
                    Toast.LENGTH_SHORT)
                    .show()

                    true
                }
                else -> false
            }
        }
    }
}