package ru.bozhenka2311.imgurmvvm.data.repository

//типобезопасный
enum class Status {
    RUNNING,
    SUCCESS,
    FAILED
}

class NetworkState (
    val status: Status,
    val msg: String
    ) {

    companion object {
        val LOADED: NetworkState
        val LOADING: NetworkState
        val ERROR: NetworkState

        init {
            LOADED = NetworkState(Status.SUCCESS, "Успешно")

            LOADING = NetworkState(Status.RUNNING, "Загружается")

            ERROR = NetworkState(Status.FAILED, "Упс... что-то пошло не так")

        }
    }
}