package pl.kowalczyk92.tools.flow

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow

abstract class MVIViewModel<T : UIState, in E : UIEvent> : ViewModel() {

    abstract val state: StateFlow<T>

    protected abstract fun reduce(event: E)
}