package fpoly.namth.clean_architecture.auth.data.repository

import android.content.SharedPreferences
import fpoly.namth.clean_architecture.auth.domain.model.User
import fpoly.namth.clean_architecture.auth.domain.repository.AuthRepository

class AuthRepositoryImpl(
    private val sharedPreferences: SharedPreferences,
):AuthRepository {
    override suspend fun loadData(): User {
        val userDto = api.post

        return userDto.toUser()
    }

    override suspend fun login(email: String, password: String) {

    }

    override suspend fun dsg() {

    }

}