package fpoly.namth.clean_architecture.auth.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import fpoly.namth.clean_architecture.auth.data.repository.AuthRepositoryImpl
import fpoly.namth.clean_architecture.auth.domain.usercase.LoginUserCase


@Composable
fun AuthScreen(
    modifier: Modifier = Modifier,
    viewModel: AuthViewModel = AuthViewModel(AuthRepositoryImpl(), LoginUserCase())
){
    viewModel.onAction(AuthActions.Login)

    LaunchedEffect(key1 = viewModel.authEventsFlow) {
        viewModel.authEventsFlow.collect{event ->
            when(event){
                AuthEvents.Error -> {
                    TODO()
                }
                AuthEvents.Success -> {
                    TODO()
                }
            }
        }
    }
}