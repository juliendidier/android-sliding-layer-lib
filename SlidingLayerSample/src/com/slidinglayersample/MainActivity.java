/*
 * MainActivity.java
 * 
 * Copyright (C) 2013 6 Wunderkinder GmbH.
 * 
 * @author      Jose L Ugia - @Jl_Ugia
 * @author      Antonio Consuegra - @aconsuegra
 * @author      Cesar Valiente - @CesarValiente
 * @author      Benedikt Lehnert - @blehnert
 * @author      Timothy Achumba - @iam_timm
 * @version     1.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.slidinglayersample;

import android.annotation.SuppressLint;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends FragmentActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        SlideFragment slide = new SlideFragment();
        ft.add(R.id.detail_layout_wrapper, slide, "slide");
        ft.commit();
    }

    @SuppressLint("NewApi")
    @Override
    protected void onResume() {
        super.onResume();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
