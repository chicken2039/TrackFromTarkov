package com.chicken2039.trackfromtarkov.domain.entities

sealed class DomainEntity{

    data class TaskEntity(
        val head : HeadEntitiy,
        var conditions : List<ConditionEntitiy>,
        var description : DescriptionEntitiy
    ){
        var id = 0
    }

    data class HeadEntitiy(
        val title : String,
        val trader : String,
        val dialogue : String,
        val requirement : String
    ){
    }
    data class ConditionEntitiy(
        val text : String,
        val goal : Int,
        val now : Int
    ){
    }
    data class DescriptionEntitiy(
        val text : String,
        val goal : Int,
        val now : Int
    ){
    }

    data class UserEntity(
        val uid : String,
        var nowTask : List<TaskEntity>
    ){}
}
