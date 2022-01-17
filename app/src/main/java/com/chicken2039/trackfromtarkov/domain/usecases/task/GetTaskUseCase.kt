package com.chicken2039.trackfromtarkov.domain.usecases.task

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import com.chicken2039.trackfromtarkov.domain.entities.DomainEntity
import com.chicken2039.trackfromtarkov.domain.repositories.TaskRepository
import com.chicken2039.trackfromtarkov.domain.usecases.BaseUseCase

class GetTaskUseCase(private val taskRepository: TaskRepository) : BaseUseCase<DomainEntity.TaskEntity,GetTaskUseCase.Param>() {

    data class Param(val id : Int)
    override suspend fun run(param: Param): Observable<DomainEntity.TaskEntity> = taskRepository.getTask(param.id)
}