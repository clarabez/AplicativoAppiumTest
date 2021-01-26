package com.example.startingkotlin

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.Window
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.Any

class MainActivity : AppCompatActivity() {

    internal lateinit var btn: Button
    internal lateinit var myDialog: Dialog
    internal lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn = findViewById<View>(R.id.BotaoBotaoMaisInfos) as Button
        btn.setOnClickListener{
            ShowDialog()
        }

        btn = findViewById<Button>(R.id.botaoCadastrar) as Button
        btn.setOnClickListener{
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }


    fun ShowDialog(){
        myDialog = Dialog(this)
        myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        myDialog.setContentView(R.layout.dialog_activity)
        myDialog.setTitle("Meu diálogo")

        text = myDialog.findViewById<View>(R.id.button_ok) as TextView
        text.isEnabled = true
        text.setOnClickListener{
            Toast.makeText(applicationContext, "Obrigada por participar do curso :)", Toast.LENGTH_LONG).show()
            myDialog.cancel()
        }
        myDialog.show()
    }

    fun cliqueBotao(view: View){
        var texto = findViewById<TextView>(R.id.TextoApresentacao)
        texto.setText("Texto Alterado")
    }

}