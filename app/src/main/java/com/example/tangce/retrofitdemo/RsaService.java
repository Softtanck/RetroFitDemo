package com.example.tangce.retrofitdemo;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Tanck on 9/6/2016.
 * <p>
 * Describe:
 */
public interface RsaService {
    @POST("csh-interface/endUser/rsa.jhtml")
    Call<ResponseBean> getRsaKey();

    //    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("csh-interface/endUser/resetPwd.jhtml")
    Call<BaseResponse> resetPwd(@Body HashMap<String, Object> body);
//    Call<BaseResponse> resetPwd(@Part("userName") String userName, @Part("smsToken") String smsToken);
}
