package com.example.memeshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // loadMeme() - calling this function will give us a string response
    }



/*
    //Created a private function loadMeme, which takes the volley code

    private fun loadMeme () {
        val textView = findViewById<TextView>(R.id.text)
// ...

// Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        val url = "https://www.google.com"

// Request a string response from the provided URL.
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            Response.Listener<String> { response ->
                // Display the first 500 characters of the response string.
Log.d("Success Response" , response.substring(0, 500))            },
            Response.ErrorListener {
                Log.d("error", it.localizedMessage)
            })

// Add the request to the RequestQueue.
        queue.add(stringRequest)

    }


 */





    //Created a private function loadMeme, which takes the volley code
    //we need to get the json response for the meme api

    private fun loadMeme () {
        val textView = findViewById<TextView>(R.id.text)
// ...

// Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)

// Request a string response from the provided URL.
        val url = "https://reddit-meme-api.herokuapp.com/"

        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null,
            Response.Listener {response -> val url = response.getString("url")},
            Response.ErrorListener {}
        )

// Add the request to the RequestQueue.
        queue.add(jsonObjectRequest)


Glide.with(this).load(url).into(memeImageView)




        fun shareMeme(view: View) {


    }



    fun nextMeme(view: View) {


    }
}

    fun nextMeme(view: View) {}
    fun shareMeme(view: View) {}
}