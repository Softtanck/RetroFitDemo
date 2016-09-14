package com.example.tangce.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://120.27.92.247:10001/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RsaService service = retrofit.create(RsaService.class);
        Call<ResponseBean> repos = service.getRsaKey();
        repos.enqueue(new Callback<ResponseBean>() {
            @Override
            public void onResponse(Call<ResponseBean> call, Response<ResponseBean> response) {
                Log.d("Tanck", response.body().getDesc());
            }

            @Override
            public void onFailure(Call<ResponseBean> call, Throwable t) {
                t.printStackTrace();
            }
        });


        HashMap<String, Object> param = new HashMap<>();
        param.put("userName", "18380477036");
        param.put("smsToken", "1111");
        Call<BaseResponse> resPwd = service.resetPwd(param);
        resPwd.enqueue(new Callback<BaseResponse>() {
            @Override
            public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
                Log.d("Tanck", response.body().getDesc());
//                Log.d("Tanck", response.message());
            }

            @Override
            public void onFailure(Call<BaseResponse> call, Throwable t) {

            }
        });

    }
}
