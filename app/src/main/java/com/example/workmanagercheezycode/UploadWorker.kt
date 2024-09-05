package com.example.workmanagercheezycode

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import com.example.workmanagercheezycode.MainActivity.Companion.KEY_IMAGE_URI
import retrofit2.Response


/**
 * Created by Himanshu Verma on 25/06/24.
 **/
class UploadWorker(appContext: Context, workerParams: WorkerParameters) :
    Worker(appContext, workerParams) {

    override fun doWork(): Result {
        try {
            // Get the input
            val imageUriInput = inputData.getString(KEY_IMAGE_URI)

            // Do the work
//            val response = imageUriInput?.let { upload(it) }
//
//            // Create the output of the work
//            val imageResponse = response.body()
            val imgLink = "imageResponse.data.link"
            // workDataOf (part of KTX) converts a list of pairs to a [Data] object.
            val outputData = workDataOf(KEY_IMAGE_URI to imgLink)

            return Result.success(outputData)

        } catch (e: Exception) {
            return Result.failure()
        }
    }

//    fun upload(imageUri: String): Response {
//
//        // Webservice request code here; note this would need to be run
//        // synchronously for reasons explained below.
//    }

}