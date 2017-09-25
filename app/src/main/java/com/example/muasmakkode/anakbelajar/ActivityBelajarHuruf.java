package com.example.muasmakkode.anakbelajar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ActivityBelajarHuruf extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_huruf);

        ImageView imageView = (ImageView) findViewById(R.id.imageView_utama);
        imageView.setImageResource(R.drawable.huruf_a);


        View imageButtona = (ImageButton) findViewById(R.id.imageView_a);
        View imageButtonb = (ImageButton) findViewById(R.id.imageView_b);
        View imageButtonc = (ImageButton) findViewById(R.id.imageView_c);
        View imageButtond = (ImageButton) findViewById(R.id.imageView_d);
        View imageButtone = (ImageButton) findViewById(R.id.imageView_e);
        View imageButtonf = (ImageButton) findViewById(R.id.imageView_f);
        View imageButtong = (ImageButton) findViewById(R.id.imageView_g);
        View imageButtonh = (ImageButton) findViewById(R.id.imageView_h);
        View imageButtoni = (ImageButton) findViewById(R.id.imageView_i);
        View imageButtonj = (ImageButton) findViewById(R.id.imageView_j);
        View imageButtonk = (ImageButton) findViewById(R.id.imageView_k);
        View imageButtonl = (ImageButton) findViewById(R.id.imageView_l);
        View imageButtonm = (ImageButton) findViewById(R.id.imageView_m);
        View imageButtonn = (ImageButton) findViewById(R.id.imageView_n);
        View imageButtono = (ImageButton) findViewById(R.id.imageView_o);
        View imageButtonp = (ImageButton) findViewById(R.id.imageView_p);
        View imageButtonq = (ImageButton) findViewById(R.id.imageView_q);
        View imageButtonr = (ImageButton) findViewById(R.id.imageView_r);
        View imageButtons = (ImageButton) findViewById(R.id.imageView_s);
        View imageButtont = (ImageButton) findViewById(R.id.imageView_t);
        View imageButtonu = (ImageButton) findViewById(R.id.imageView_u);
        View imageButtonv = (ImageButton) findViewById(R.id.imageView_v);
        View imageButtonw = (ImageButton) findViewById(R.id.imageView_w);
        View imageButtonx = (ImageButton) findViewById(R.id.imageView_x);
        View imageButtony = (ImageButton) findViewById(R.id.imageView_y);
        View imageButtonz = (ImageButton) findViewById(R.id.imageView_z);


        imageButtona.setOnClickListener(this);
        imageButtonb.setOnClickListener(this);
        imageButtonc.setOnClickListener(this);
        imageButtond.setOnClickListener(this);
        imageButtone.setOnClickListener(this);
        imageButtonf.setOnClickListener(this);
        imageButtong.setOnClickListener(this);
        imageButtonh.setOnClickListener(this);
        imageButtoni.setOnClickListener(this);
        imageButtonj.setOnClickListener(this);
        imageButtonk.setOnClickListener(this);
        imageButtonl.setOnClickListener(this);
        imageButtonm.setOnClickListener(this);
        imageButtonn.setOnClickListener(this);
        imageButtono.setOnClickListener(this);
        imageButtonp.setOnClickListener(this);
        imageButtonq.setOnClickListener(this);
        imageButtonr.setOnClickListener(this);
        imageButtons.setOnClickListener(this);
        imageButtont.setOnClickListener(this);
        imageButtonu.setOnClickListener(this);
        imageButtonv.setOnClickListener(this);
        imageButtonw.setOnClickListener(this);
        imageButtonx.setOnClickListener(this);
        imageButtony.setOnClickListener(this);
        imageButtonz.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        // Play only one sound at a time
        if(mp != null) mp.release();

        // Find which ImageButton was pressed and take appropriate action

        switch (v.getId()) {

            // The huruf a button
            case R.id.imageView_a:
                ImageView iView_a = (ImageView) findViewById(R.id.imageView_utama);
                iView_a.setImageResource(R.drawable.huruf_a);
                mp = MediaPlayer.create(this, R.raw.a);
                break;

            // The huruf b button
            case R.id.imageView_b:
                ImageView iView_b = (ImageView) findViewById(R.id.imageView_utama);
                iView_b.setImageResource(R.drawable.huruf_b);
                mp = MediaPlayer.create(this, R.raw.b);
                break;

            // The huruf c button
            case R.id.imageView_c:
                ImageView iView_c = (ImageView) findViewById(R.id.imageView_utama);
                iView_c.setImageResource(R.drawable.huruf_c);
                mp = MediaPlayer.create(this, R.raw.c);
                break;

            // The huruf d button
            case R.id.imageView_d:
                ImageView iView_d = (ImageView) findViewById(R.id.imageView_utama);
                iView_d.setImageResource(R.drawable.huruf_d);
                mp = MediaPlayer.create(this, R.raw.d);
                break;

            // The huruf d button
            case R.id.imageView_e:
                ImageView iView_e = (ImageView) findViewById(R.id.imageView_utama);
                iView_e.setImageResource(R.drawable.huruf_e);
                mp = MediaPlayer.create(this, R.raw.e);
                break;

            // The huruf d button
            case R.id.imageView_f:
                ImageView iView_f = (ImageView) findViewById(R.id.imageView_utama);
                iView_f.setImageResource(R.drawable.huruf_f);
                mp = MediaPlayer.create(this, R.raw.f);
                break;

            // The huruf d button
            case R.id.imageView_g:
                ImageView iView_g = (ImageView) findViewById(R.id.imageView_utama);
                iView_g.setImageResource(R.drawable.huruf_g);
                mp = MediaPlayer.create(this, R.raw.g);
                break;

            // The huruf d button
            case R.id.imageView_h:
                ImageView iView_h = (ImageView) findViewById(R.id.imageView_utama);
                iView_h.setImageResource(R.drawable.huruf_h);
                mp = MediaPlayer.create(this, R.raw.h);
                break;

            // The huruf d button
            case R.id.imageView_i:
                ImageView iView_i = (ImageView) findViewById(R.id.imageView_utama);
                iView_i.setImageResource(R.drawable.huruf_i);
                mp = MediaPlayer.create(this, R.raw.i);
                break;

            // The huruf d button
            case R.id.imageView_j:
                ImageView iView_j = (ImageView) findViewById(R.id.imageView_utama);
                iView_j.setImageResource(R.drawable.huruf_j);
                mp = MediaPlayer.create(this, R.raw.j);
                break;

            // The huruf d button
            case R.id.imageView_k:
                ImageView iView_k = (ImageView) findViewById(R.id.imageView_utama);
                iView_k.setImageResource(R.drawable.huruf_k);
                mp = MediaPlayer.create(this, R.raw.k);
                break;

            // The huruf d button
            case R.id.imageView_l:
                ImageView iView_l = (ImageView) findViewById(R.id.imageView_utama);
                iView_l.setImageResource(R.drawable.huruf_l);
                mp = MediaPlayer.create(this, R.raw.l);
                break;

            // The huruf d button
            case R.id.imageView_m:
                ImageView iView_m = (ImageView) findViewById(R.id.imageView_utama);
                iView_m.setImageResource(R.drawable.huruf_m);
                mp = MediaPlayer.create(this, R.raw.m);
                break;

            // The huruf d button
            case R.id.imageView_n:
                ImageView iView_n = (ImageView) findViewById(R.id.imageView_utama);
                iView_n.setImageResource(R.drawable.huruf_n);
                mp = MediaPlayer.create(this, R.raw.n);
                break;

            // The huruf d button
            case R.id.imageView_o:
                ImageView iView_o = (ImageView) findViewById(R.id.imageView_utama);
                iView_o.setImageResource(R.drawable.huruf_o);
                mp = MediaPlayer.create(this, R.raw.o);
                break;

            // The huruf d button
            case R.id.imageView_p:
                ImageView iView_p = (ImageView) findViewById(R.id.imageView_utama);
                iView_p.setImageResource(R.drawable.huruf_p);
                mp = MediaPlayer.create(this, R.raw.p);
                break;

            // The huruf d button
            case R.id.imageView_q:
                ImageView iView_q = (ImageView) findViewById(R.id.imageView_utama);
                iView_q.setImageResource(R.drawable.huruf_q);
                mp = MediaPlayer.create(this, R.raw.q);
                break;

            // The huruf d button
            case R.id.imageView_r:
                ImageView iView_r = (ImageView) findViewById(R.id.imageView_utama);
                iView_r.setImageResource(R.drawable.huruf_r);
                mp = MediaPlayer.create(this, R.raw.r);
                break;

            // The huruf d button
            case R.id.imageView_s:
                ImageView iView_s = (ImageView) findViewById(R.id.imageView_utama);
                iView_s.setImageResource(R.drawable.huruf_s);
                mp = MediaPlayer.create(this, R.raw.s);
                break;

            // The huruf d button
            case R.id.imageView_t:
                ImageView iView_t = (ImageView) findViewById(R.id.imageView_utama);
                iView_t.setImageResource(R.drawable.huruf_t);
                mp = MediaPlayer.create(this, R.raw.t);
                break;

            // The huruf d button
            case R.id.imageView_u:
                ImageView iView_u = (ImageView) findViewById(R.id.imageView_utama);
                iView_u.setImageResource(R.drawable.huruf_u);
                mp = MediaPlayer.create(this, R.raw.u);
                break;

            // The huruf d button
            case R.id.imageView_v:
                ImageView iView_v = (ImageView) findViewById(R.id.imageView_utama);
                iView_v.setImageResource(R.drawable.huruf_v);
                mp = MediaPlayer.create(this, R.raw.v);
                break;

            // The huruf d button
            case R.id.imageView_w:
                ImageView iView_w = (ImageView) findViewById(R.id.imageView_utama);
                iView_w.setImageResource(R.drawable.huruf_w);
                mp = MediaPlayer.create(this, R.raw.w);
                break;

            // The huruf d button
            case R.id.imageView_x:
                ImageView iView_x = (ImageView) findViewById(R.id.imageView_utama);
                iView_x.setImageResource(R.drawable.huruf_x);
                mp = MediaPlayer.create(this, R.raw.x);
                break;

            // The huruf d button
            case R.id.imageView_y:
                ImageView iView_y = (ImageView) findViewById(R.id.imageView_utama);
                iView_y.setImageResource(R.drawable.huruf_y);
                mp = MediaPlayer.create(this, R.raw.y);
                break;

            // The huruf d button
            case R.id.imageView_z:
                ImageView iView_z = (ImageView) findViewById(R.id.imageView_utama);
                iView_z.setImageResource(R.drawable.huruf_z);
                mp = MediaPlayer.create(this, R.raw.z);
                break;

        }
        mp.seekTo(0);
        mp.start();
    }

    @Override
    public void onPause() {
        super.onPause();
        // Release the MediaPlayer if going into background if it isn't null
        if(mp != null) mp.release();
    }
}
