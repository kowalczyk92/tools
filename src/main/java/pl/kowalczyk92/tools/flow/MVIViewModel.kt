package pl.kowalczyk92.tools.flow

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow

abstract class MVIViewModel<T : UIState, in E : UIEvent> : ViewModel() {

    abstract val state: Flow<T>

    protected abstract fun reduce(event: E)
}