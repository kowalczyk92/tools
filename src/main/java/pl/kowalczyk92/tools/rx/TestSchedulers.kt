package pl.kowalczyk92.tools.rx

import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.schedulers.Schedulers

class TestSchedulers: ISchedulers {
    override val io: Scheduler = Schedulers.trampoline()
    override val ui: Scheduler = Schedulers.trampoline()
}