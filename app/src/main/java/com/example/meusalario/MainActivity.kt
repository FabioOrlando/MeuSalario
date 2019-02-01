package com.example.meusalario

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {


             var valorHoraTrabalhada = txtValorHoraTrabalhada.toString().toFloat()
             var qtdDiasTrabalhados = txtQtdDiasTrabalhados.toString().toInt()
             var qtdHorasPorDia = txtQtdHorasPorDia.toString().toInt()

             var iss = 0.05
             var fgts = 0.08

             var salarioBruto = qtdHorasPorDia * qtdDiasTrabalhados * valorHoraTrabalhada
             var descISS = salarioBruto * iss
             var descFGTS = salarioBruto * fgts
             var salarioLiquido = salarioBruto - (descISS + descFGTS)

            lblSalarioBruto.text ="Salário Bruto: ${salarioBruto}"
            lblDescISS.text = "Desc. ISS: ${descISS}"
            lblDescFGTS.text = "Desc. FGTS: ${descFGTS}"
            lblSalarioLiquido.text ="Salário Líquido: ${salarioLiquido}"

        }





    }
}
