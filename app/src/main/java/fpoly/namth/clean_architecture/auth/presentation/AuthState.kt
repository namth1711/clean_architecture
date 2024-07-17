package fpoly.namth.clean_architecture.auth.presentation

import fpoly.namth.clean_architecture.auth.domain.model.User

data class AuthState (
    val email: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val user: User,
)