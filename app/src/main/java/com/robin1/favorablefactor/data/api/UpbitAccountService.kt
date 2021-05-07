/**
 * 업비트 자산
 */

package com.robin1.favorablefactor.data.api

import retrofit2.http.GET

interface UpbitAccountService {

    /**
     * 전체 계좌 조회
     */
    @GET("/v1/accounts")
    fun account()
}