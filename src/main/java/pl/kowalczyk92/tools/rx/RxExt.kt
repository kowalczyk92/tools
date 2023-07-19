package pl.kowalczyk92.tools.rx

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.disposables.Disposable

fun <T : Any> Observable<T>.subscribeOnIoObserveOnUi(
    schedulers: ISchedulers,
    onError: (Throwable) -> Unit = { it.printStackTrace() },
    onComplete: () -> Unit = {},
    onNext: (T) -> Unit = {}
): Disposable =
    subscribeOn(schedulers.io)
        .observeOn(schedulers.ui)
        .subscribe(onNext, onError, onComplete)

fun <T : Any> Single<T>.subscribeOnIoObserveOnUi(
    schedulers: ISchedulers,
    onError: (Throwable) -> Unit = { it.printStackTrace() },
    onSuccess: (T) -> Unit = {}
): Disposable =
    subscribeOn(schedulers.io)
        .observeOn(schedulers.ui)
        .subscribe(onSuccess, onError)

fun Completable.subscribeOnIoObserveOnUi(
    schedulers: ISchedulers,
    onError: (Throwable) -> Unit = { it.printStackTrace() },
    onComplete: () -> Unit = {}
): Disposable =
    subscribeOn(schedulers.io)
        .observeOn(schedulers.ui)
        .subscribe(onComplete, onError)

fun <T : Any> Maybe<T>.subscribeOnIoObserveOnUi(
    schedulers: ISchedulers,
    onError: (Throwable) -> Unit = { it.printStackTrace() },
    onComplete: () -> Unit = {},
    onSuccess: (T) -> Unit = {}
): Disposable =
    subscribeOn(schedulers.io)
        .observeOn(schedulers.ui)
        .subscribe(onSuccess, onError, onComplete)

