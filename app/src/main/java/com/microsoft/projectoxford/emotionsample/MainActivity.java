//
// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license.
//
// Microsoft Cognitive Services (formerly Project Oxford): https://www.microsoft.com/cognitive-services
//
// Microsoft Cognitive Services (formerly Project Oxford) GitHub:
// https://github.com/Microsoft/Cognitive-Emotion-Android
//
// Copyright (c) Microsoft Corporation
// All rights reserved.
//
// MIT License:
// Permission is hereby granted, free of charge, to any person obtaining
// a copy of this software and associated documentation files (the
// "Software"), to deal in the Software without restriction, including
// without limitation the rights to use, copy, modify, merge, publish,
// distribute, sublicense, and/or sell copies of the Software, and to
// permit persons to whom the Software is furnished to do so, subject to
// the following conditions:
//
// The above copyright notice and this permission notice shall be
// included in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED ""AS IS"", WITHOUT WARRANTY OF ANY KIND,
// EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
// MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
// LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
// OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
// WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
//
package com.microsoft.projectoxford.emotionsample;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activityRecognize(View v) {
        Intent intent = new Intent(this, RecognizeActivity.class);
        startActivity(intent);
    }

    public void Happy(View view) {
        Intent intent = new Intent(this, ChangeMoodActivity.class);
        intent.putExtra("mood","happy");
        startActivity(intent);
    }

    public void Sad(View view) {
        Intent intent = new Intent(this, ChangeMoodActivity.class);
        intent.putExtra("mood","sad");
        startActivity(intent);
    }

    public void Angry(View view) {
        Intent intent = new Intent(this, ChangeMoodActivity.class);
        intent.putExtra("mood","angry");
        startActivity(intent);
    }

    public void Contempt(View view) {
        Intent intent = new Intent(this, ChangeMoodActivity.class);
        intent.putExtra("mood","contempt");
        startActivity(intent);
    }

    public void Disgust(View view) {
        Intent intent = new Intent(this, ChangeMoodActivity.class);
        intent.putExtra("mood","disgust");
        startActivity(intent);
    }

    public void Fear(View view) {
        Intent intent = new Intent(this, ChangeMoodActivity.class);
        intent.putExtra("mood","fear");
        startActivity(intent);
    }

    public void Neutral(View view) {
        Intent intent = new Intent(this, ChangeMoodActivity.class);
        intent.putExtra("mood","neutral");
        startActivity(intent);
    }

    public void Surprise(View view) {
        Intent intent = new Intent(this, ChangeMoodActivity.class);
        intent.putExtra("mood","surprise");
        startActivity(intent);
    }
}
