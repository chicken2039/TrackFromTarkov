package com.chicken2039.trackfromtarkov.domain.usecases

import io.reactivex.rxjava3.core.Single
import kotlinx.coroutines.*

abstract class SingleUseCase <Type,in Params> where Type : Any {
    abstract suspend fun run(param : Params) :Single<Type>

    @DelicateCoroutinesApi
    fun execute(onResult :(Single<Type>)->Unit ,param: Params){
        val job = GlobalScope.async { run(param) }
        GlobalScope.launch(Dispatchers.Main) { onResult.invoke(job.await())
    }
}}