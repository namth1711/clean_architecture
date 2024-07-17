package fpoly.namth.clean_architecture.auth.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import fpoly.namth.clean_architecture.auth.domain.repository.AuthRepository
import fpoly.namth.clean_architecture.auth.domain.usercase.LoginUserCase
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class AuthViewModel(
    private val repository: AuthRepository,
    private val loginUserCase: LoginUserCase
):ViewModel() {

    var state by mutableStateOf(AuthState())
        private set

    private val _authChannel = Channel<AuthEvents>()
    val authEventsFlow = _authChannel.receiveAsFlow()

    init {
        viewModelScope.launch {
            state = state.copy(user = repository.loadData())
        }
    }

    fun onAction(action: AuthActions){
        when(action){

            AuthActions.Login -> {
            }

            AuthActions.Register -> {
                TODO()
            }

            is AuthActions.UpdatePassword -> {
                state = state.copy(password = action.password)
            }
        }
    }


    fun login(){
        viewModelScope.launch {

            loginUserCase.login(state.email, state.password)
            _authChannel.send(AuthEvents.Success)

        }
    }
    fun register(){

    }
}