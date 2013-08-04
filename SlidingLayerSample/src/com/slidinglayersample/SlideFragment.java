package com.slidinglayersample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.slidinglayer.SlidingLayer;
import android.view.KeyEvent;
import android.graphics.drawable.Drawable;

public class SlideFragment extends Fragment
{
    private TextView swipeText;
    private SlidingLayer mSlidingLayer;

    private String mStickContainerToRightLeftOrMiddle;
    private boolean mShowShadow;
    private boolean mShowOffset;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.slide_view, container, false);

        getPrefs(view);
        bindViews(view);
        initState(view);

        return view;
    }

    /**
     * View binding
     */
    private void bindViews(View view) {
        mSlidingLayer = (SlidingLayer) view.findViewById(R.id.slidingLayer1);
        swipeText = (TextView) view.findViewById(R.id.swipeText);
    }

    /**
     * Get current value for preferences
     */
    private void getPrefs(View view) {
        mStickContainerToRightLeftOrMiddle = "bottom";
        mShowShadow = false;
        mShowOffset = true;
    }

    /**
     * Initializes the origin state of the layer
     */
    private void initState(View view) {

        // Sticks container to right or left
        LayoutParams rlp = (LayoutParams) mSlidingLayer.getLayoutParams();
        int textResource;
        Drawable d;

        textResource = R.string.swipe_down_label;
        d = getResources().getDrawable(R.drawable.container_rocket);

        mSlidingLayer.setStickTo(SlidingLayer.STICK_TO_BOTTOM);
        rlp.width = LayoutParams.MATCH_PARENT;
        rlp.height = getResources().getDimensionPixelSize(R.dimen.layer_width);

        d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
        swipeText.setCompoundDrawables(null, d, null, null);
        swipeText.setText(getResources().getString(textResource));
        mSlidingLayer.setLayoutParams(rlp);

        // shadow
        mSlidingLayer.setShadowWidth(0);
        mSlidingLayer.setShadowDrawable(null);

        // offset
        mSlidingLayer.setOffsetWidth(getResources().getDimensionPixelOffset(R.dimen.offset_width));
    }

    // @Override
    // public boolean onKeyDown(int keyCode, KeyEvent event) {
    //     switch (keyCode) {
    //     case KeyEvent.KEYCODE_BACK:
    //         if (mSlidingLayer.isOpened()) {
    //             mSlidingLayer.closeLayer(true);
    //             return true;
    //         }

    //     default:
    //         return super.onKeyDown(keyCode, event);
    //     }
    // }
}
