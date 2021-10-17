package ru.bozhenka2311.imgurmvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import ru.bozhenka2311.imgurmvvm.data.repository.NetworkState
import ru.bozhenka2311.imgurmvvm.models.SingleImageWithInfo
import ru.bozhenka2311.imgurmvvm.network.ApiInterface

class SingleImageNetworkDataSource (
    private val apiService: ApiInterface,
    private val compositeDisposable: CompositeDisposable
    ) { /*

    private val _networkState = MutableLiveData<NetworkState>()
    val networkState: LiveData<NetworkState> = _networkState

    private val _downloadedSingleImageResponse = MutableLiveData<SingleImageWithInfo>()
    val downloadedSingleImageResponse: LiveData<SingleImageWithInfo> = _downloadedSingleImageResponse

    fun fetchSingleImageWithInfo(imageId: String) {
        _networkState.postValue(NetworkState.LOADING)

        try {
            compositeDisposable.add(
                apiService.getImageInfo(imageId)
                    .isSuccessful(Schedulers.io())
                    .s

            )
        }
    }*/
}

