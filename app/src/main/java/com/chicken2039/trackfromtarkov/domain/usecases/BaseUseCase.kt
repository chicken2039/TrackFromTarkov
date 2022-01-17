package com.chicken2039.trackfromtarkov.domain.usecases

import io.reactivex.rxjava3.core.Observable
import kotlinx.coroutines.*

abstract class BaseUseCase<Type,in Params> where Type:Any{
    abstract suspend fun run(param : Params) : Observable<Type>

    class None

    @DelicateCoroutinesApi
    fun execute(onResult : (Observable<Type>) -> Unit, param: Params){
        val job = GlobalScope.async { run(param) }
        GlobalScope.launch(Dispatchers.Main) { onResult.invoke(job.await()) }
    }
}