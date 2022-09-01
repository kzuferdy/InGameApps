package com.kzuferdy.ingameapps.kegiatan

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kzuferdy.ingameapps.kegiatan.api.RetrofitClient
import com.kzuferdy.ingameapps.kegiatan.model.PostResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class KegiatanViewModel : ViewModel() {
    val status = MutableLiveData<String>()

    fun postData(nama: String, kegiatan: String){
        RetrofitClient.instance
            .postData(nama, kegiatan)
            .enqueue(object : Callback<PostResponse>{
                override fun onResponse(
                    call: Call<PostResponse>,
                    response: Response<PostResponse>
                ) {
                    if(response.isSuccessful){
                        status.postValue(response.body()?.status)
                    }
                }

                override fun onFailure(call: Call<PostResponse>, t: Throwable) {
                    t.message?.let { Log.e("onFailure", it) }
                }

            })
    }
    fun getStatus(): LiveData<String>{
        return status
    }
}