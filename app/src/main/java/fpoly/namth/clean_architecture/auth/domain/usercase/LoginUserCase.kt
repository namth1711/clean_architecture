package fpoly.namth.clean_architecture.auth.domain.usercase

import fpoly.namth.clean_architecture.auth.domain.repository.AuthRepository

class LoginUserCase(
    private  val authRepository: AuthRepository
) {
    suspend fun login(email: String, password: String){

        if (email.isBlank()||password.isBlank()){
            return
        }

        authRepository.login(email,password)
    }
}