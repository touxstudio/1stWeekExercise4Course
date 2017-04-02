package org.coursera.apiRest;

import org.coursera.apiRest.model.PetResponse;
import org.coursera.apiRest.model.UserIdResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by TouxStudio on 29/03/2017.
 */

public interface IApiEndPoints {

    @GET
    public Call<PetResponse> getRecentMedia(@Url String url);
}