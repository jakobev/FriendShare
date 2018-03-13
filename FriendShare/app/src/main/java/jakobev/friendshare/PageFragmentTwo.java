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

public class PageFragmentTwo extends Fragment {
    public static final int PICK_IMAGE = 1;
    ImageView ivgallery;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.page_fragment_two, container, false);
        ivgallery = (ImageView) v.findViewById(R.id.ivgallery);
        ivgallery.setOnClickListener(new View.OnClickListener() {
            public static final int PICK_IMAGE = 1337;

            public void onClick(View V) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.setAction(Intent.ACTION_VIEW);
                startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE);
            }


        });
                return v;
    }
}
