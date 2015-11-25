package com.example.android.rabbit;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

/**
 * Created by sagar_000 on 11/12/2015.
 */
public class CameraFragment extends Fragment {

    //Activity request codes
    private static final int CAMERA_CAPTURE_IMAGE_REQUEST_CODE = 100;
    private static final int CAMER_CAPTURE_VIDEO_REQUEST_CODE = 200;
    private static final int MEDIA_TYPE_IMAGE = 1;
    private static final int MEDIA_TYPE_VIDEO = 2;

    //directory name to store captured images and video
    private static final String IMAGE_DIRECTORY_NAME = "Rabbit";

    private Uri fileUri; //file url to store image/video

    private ImageView imgPreview;
    private VideoView videoPreview;
    private Button btnCapturePicture, btnRecordeVideo;

    //Copied from MainActivity
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_camera, container, false);
        return rootView;

        imgPreview =(ImageView) findViewById(R.id.imgPreview);
        videoPreview = (VideoView) findViewById(R.id.videoPreview);
        btnCapturePicture = (Button) findViewbyId(R.id.button);
        btnRecordeVideo = (Button) findViewById(R.id.button)
    }


}
