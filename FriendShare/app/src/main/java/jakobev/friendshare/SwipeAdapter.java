package jakobev.friendshare;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Marv & Jutta on 22.05.2017.
 */

public class SwipeAdapter extends FragmentStatePagerAdapter {
    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int arg0) {

        switch (arg0){
            case 0:
                return new PageFragmentOne();
            case 1:
                return new PageFragmentTwo();
            case 2:
                return new PageFragmentThree();

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
