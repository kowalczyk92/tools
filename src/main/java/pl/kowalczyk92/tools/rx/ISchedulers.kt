package pl.kowalczyk92.tools.rx

import io.reactivex.rxjava3.core.Scheduler

interface ISchedulers {
    val io: Scheduler
    val ui: Scheduler
}