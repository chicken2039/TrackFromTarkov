package com.chicken2039.trackfromtarkov.domain.usecases

import io.reactivex.rxjava3.core.Completable
import kotlinx.coroutines.*

abstract class CompletableUseCase  <Type, in Params> where Type:Any{
    abstract suspend fun run(param :Params ) : Type
    class  None
    @DelicateCoroutinesApi
    fun execute(onResult : (Type) -> Completable,param: Params){
        val job = GlobalScope.async { run(param) }
        GlobalScope.launch( Dispatchers.Main ) {onResult.invoke(job.await())}
    }
}