package fpoly.namth.clean_architecture.auth.presentation

sealed interface AuthEvents{
    data object Error: AuthEvents
    data object Success: AuthEvents
}
