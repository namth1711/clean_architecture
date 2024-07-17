package fpoly.namth.clean_architecture.auth.presentation

sealed interface AuthActions {

    data object Login   : AuthActions
    data object Register: AuthActions

    data class UpdatePassword(val password: String): AuthActions
}