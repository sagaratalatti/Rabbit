package com.example.android.rabbit.camera;

import android.net.Uri;
import android.support.v4.app.Fragment;
/**
 * Created by sagar_000 on 11/30/2015.
 */
public class BaseFragment extends Fragment {

    public static final String ARG_SECTION_NUMBER = "ARG_SECTION_NUMBER";

    /**
     * Default empty constructor
     */
    public BaseFragment(){
        //
    }

    /**
     * This interface must be implemented by activities that contain this
     * mFragment to allow an interaction in this mFragment to be communicated
     * to the mActivity and potentially other fragments contained in that
     * mActivity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        public void onFragmentInteraction(Uri uri);
        public void onFragmentInteraction(String id);
        public void onFragmentInteraction(int actionId);
    }
}
