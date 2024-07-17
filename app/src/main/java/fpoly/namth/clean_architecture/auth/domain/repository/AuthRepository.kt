package fpoly.namth.clean_architecture.auth.domain.repository

import fpoly.namth.clean_architecture.auth.domain.model.User
import fpoly.namth.clean_architecture.auth.presentation.AuthActions

interface AuthRepository {
    suspend fun loadData():User
    suspend fun login(email: String, password: String)

    suspend fun dsg()
}