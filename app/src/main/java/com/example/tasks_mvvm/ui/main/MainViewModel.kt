package com.example.tasks_mvvm.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tasks_mvvm.data.model.Task
import com.example.tasks_mvvm.data.repository.TasksRepository
import com.example.tasks_mvvm.dto.TaskDto

class MainViewModel: ViewModel() {

    private val repository = TasksRepository()

    private val _tasks = MutableLiveData<List<TaskDto>>()
    val tasks: LiveData<List<TaskDto>>
        get(){
            return _tasks
        }

    init{
        loadData()
    }

    private fun loadData(){
        /*val taskList = repository.findAll()
        val taskDtoList = taskList.map { task: Task -> TaskDto(task.id, task.description, task.isCompleted) }

        _tasks.value = taskDtoList*/
        val taskDtoList = listOf(
            TaskDto(1, "Arrumar a cama", false),
            TaskDto(2, "Tirar o lixo", false)
        )

        _tasks.value = taskDtoList
    }

}