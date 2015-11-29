package com.example.android.rabbit;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.android.rabbit.appstart.SmsPrefManager;


public class MainActivity extends FragmentActivity {

    // private SmsPrefManager pref;
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;

    SmsPrefManager pref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the app.
        mSectionsPagerAdapter = new SectionsPagerAdapter(this,
                getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        //pref = new SmsPrefManager(getApplicationContext());

        //Checking if user session
        //if not logged in, take user to sms screen
         //if (!pref.isLoggedIn()) {
         //logout();
         //}
    //}

   // private void logout(){
   // pref.clearSession();

    //Intent intent = new Intent(MainActivity.this, SmsActivity.class);
    // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);

     //startActivity(intent);

     //finish();
    //}
    //@Override
   // public boolean onCreateOptionsMenu(Menu menu) {
     //   getMenuInflater().inflate(R.menu.menu_main, menu);
      //  return true;
    }

   // @Override
   // public boolean onOptionsItemSelected(MenuItem item) {
       // int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       // if (id == R.id.action_logout) {
            // logout();
          //  return true;
        }

       // return super.onOptionsItemSelected(item);
   // }

//}