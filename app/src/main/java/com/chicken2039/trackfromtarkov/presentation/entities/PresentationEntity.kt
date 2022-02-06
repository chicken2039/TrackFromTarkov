package com.chicken2039.trackfromtarkov.presentation.entities


sealed class PresentationEntity{

    data class TaskEntity(
        val title : TitleEntitiy,
        var conditions : List<ConditionEntitiy>,
        var description : DescriptionEntitiy
    ){
        var id = 0
    }

    data class TitleEntitiy(
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
    ){
    }
    data class UserEntity(
        val uid : String,
        var nowTask : List<TaskEntity>
    ){}
}
