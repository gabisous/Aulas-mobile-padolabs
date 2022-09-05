package com.example.calculadoraimc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtPeso = findViewById<EditText>(R.id.txtPeso)
        val txtAltura = findViewById<EditText>(R.id.txtAltura)
        val buttonCalcular = findViewById<Button>(R.id.buttonCalcular)
        val resultado = findViewById<TextView>(R.id.resultado)

        buttonCalcular.setOnClickListener {
            val Altura = txtAltura.text.toString().toDouble()
            val Peso = txtPeso.text.toString().toDouble()

            var imc = (Peso/(Altura*Altura))
            var imcf = "%.2f".format(imc)
            if (imc < 19) {
                resultado.setText("Seu imc é =" + imcf + "Peso Baixo")
            } else if (imc >= 19 && imc < 24.9) {
                resultado.setText("Seu imc é =" +imcf + "Peso normal")
            } else if (imc >=25 && imc <= 29.9) {
                resultado.setText("Seu imc é =" + imcf + "Pré Obesidade")
            } else if (imc >= 30 && imc <= 34.9) {
                resultado.setText("Seu imc é = "+ imcf + "Obesidade")
            } else if (imc >= 35 && imc <= 39.9) {
                resultado.setText("Seu imc é =" + imcf + "Obesidade grave")
            }
        }
    }
}