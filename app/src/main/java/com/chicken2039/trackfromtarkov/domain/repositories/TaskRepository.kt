package com.chicken2039.trackfromtarkov.domain.repositories

import com.chicken2039.trackfromtarkov.domain.entities.DomainEntity
import io.reactivex.rxjava3.core.Observable

interface TaskRepository : Repository{
    fun getTask(id:Int) : Observable<DomainEntity.TaskEntity>
}