package pl.kowalczyk92.tools.rx

import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable

abstract class RxViewModel : ViewModel() {

    private val compositeDisposable = CompositeDisposable()

    fun Disposable.addSubscription() = compositeDisposable.add(this)

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}