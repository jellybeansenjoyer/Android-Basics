package com.example.roomdemo.UI

import androidx.lifecycle.*
import com.example.roomdemo.Data.WordRepository
import com.example.roomdemo.Room.Word
import com.example.roomdemo.Room.WordDao
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class WordViewModel(private val repository: WordRepository) : ViewModel() {

    val allWords : LiveData<List<Word>> = repository.wordList.asLiveData()

    fun insert(word: Word) = viewModelScope.launch {
        repository.insert(word)
    }

    fun delete() = viewModelScope.launch{
        repository.delete()
    }

    fun deleteThis(word: Word) = viewModelScope.launch{
        repository.deleteEach(word)
    }

}