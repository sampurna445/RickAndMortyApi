package com.example.rickandmortyapi.ui.characters

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmortyapi.data.model.characters.CharactersModel
import com.example.rickandmortyapi.data.model.characters.ResultModel
import com.example.rickandmortyapi.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {


    val characters: MutableLiveData<CharactersModel> = MutableLiveData()
    val chars : MutableLiveData<List<ResultModel?>?> = MutableLiveData()



    fun getCharacters() {
        viewModelScope.launch {
            val repository = repository.getCharacters()
            characters.postValue(repository)
        }
    }


}