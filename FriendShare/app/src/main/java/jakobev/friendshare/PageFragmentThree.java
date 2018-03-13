package jakobev.friendshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Marv & Jutta on 23.05.2017.
 */

public class PageFragmentThree extends Fragment {

    ImageView ivupload;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.page_fragment_three, container, false);
        ivupload = (ImageView)v.findViewById(R.id.ivupload);
        ivupload.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, 1);
            }
        });
        return v;
    }
}
