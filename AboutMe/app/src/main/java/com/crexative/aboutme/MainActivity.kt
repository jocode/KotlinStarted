package com.crexative.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.crexative.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var  binding : ActivityMainBinding

    private val myName : MyName = MyName("Johan Mosquera")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Le colocamos el nombre a la vista, definido anteriormente
        binding.myName = myName

        /*findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickName(it)
        }*/
        binding.doneButton.setOnClickListener {
            addNickName(it)
        }
    }

    private fun addNickName(view : View) {

        /*val editText : EditText = findViewById(R.id.nickname_edit)
        val nicknameTextView : TextView = findViewById(R.id.nickname_text)

        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE*/

        binding.apply {
            //nicknameText.text = binding.nicknameEdit.text
            myName?.nickname = nicknameEdit.text.toString()
            invalidateAll()
            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
        }

        // Hide the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}