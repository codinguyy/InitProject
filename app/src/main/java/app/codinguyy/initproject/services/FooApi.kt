package app.codinguyy.initproject.services

import app.codinguyy.initproject.data.Foo
import retrofit2.http.GET

interface FooApi {

    @GET("")
    suspend fun getFoo(): Foo
}
