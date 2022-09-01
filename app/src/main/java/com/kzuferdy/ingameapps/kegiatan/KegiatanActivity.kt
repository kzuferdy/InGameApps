package com.kzuferdy.ingameapps.kegiatan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.kzuferdy.ingameapps.R
import com.kzuferdy.ingameapps.databinding.ActivityKegiatanBinding

class KegiatanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityKegiatanBinding
    private lateinit var viewModel: KegiatanViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKegiatanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(KegiatanViewModel::class.java)

        binding.btnSubmit.setOnClickListener {
            val nama = binding.etNama.text.toString()
            val kegiatan = binding.etKegiatan.text.toString()
            viewModel.postData(nama, kegiatan)
        }
        viewModel.getStatus().observe(this, {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        })
    }
}