package com.example.marsphotosapp.fake

import com.example.marsphotosapp.data.MarsPhotosRepository
import com.example.marsphotosapp.model.MarsPhoto

class FakeNetworkMarsPhotosRepository : MarsPhotosRepository{
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}