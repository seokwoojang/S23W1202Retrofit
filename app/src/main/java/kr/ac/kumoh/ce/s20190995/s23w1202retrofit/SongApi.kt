package kr.ac.kumoh.ce.s20190995.s23w1202retrofit

import retrofit2.http.GET

interface SongApi {
    @GET("song") // annotation
    suspend fun getSong(): List<Song>
}