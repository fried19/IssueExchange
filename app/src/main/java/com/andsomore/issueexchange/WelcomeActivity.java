package com.andsomore.issueexchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.andsomore.issueexchange.R;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {
        private ImageView ivExchange;
        private TextView tvExchanche;
        private EditText edEmail;
        private EditText edPassword;
        Button btValider;
        private ProgressBar progressBar;
        private RelativeLayout rootView,afterAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initViews();
        new CountDownTimer(4000, 1000) {


            @Override
            public void onFinish() {
                tvExchanche.setVisibility(View.GONE);
                progressBar.setVisibility(View.GONE);
                rootView.setBackgroundColor(ContextCompat.getColor(WelcomeActivity.this, R.color.colorSplashText));
                ivExchange.setImageResource(R.drawable.ic_communication_black);
                startAnimation();


            }
            @Override
            public void onTick(long millisUntilFinished) {

            }
        }.start();
         btValider.setOnClickListener(this);

    }

    private void startAnimation() {
        ObjectAnimator animator=null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Path path = new Path();
            path.arcTo(-650f, 50f, 500f, 500f, 120f, -200f, true);
            try {
                animator = ObjectAnimator.ofFloat(ivExchange,View.X,View.Y, path);
            }catch (Exception e){
                Log.e("Erreur",e.getMessage());
            }

            animator.setDuration(2000);
            animator.start();
            animator.addListener( new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) {

                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    afterAnimationView.setVisibility(View.VISIBLE);
                }

                @Override
                public void onAnimationCancel(Animator animation) {

                }

                @Override
                public void onAnimationRepeat(Animator animation) {

                }
            });





        }
    }

    private void initViews() {
        ivExchange = findViewById(R.id.ivExchange);
        tvExchanche = findViewById(R.id.tvExchange);
        edEmail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);
        progressBar = findViewById(R.id.pgBar);
        rootView = findViewById(R.id.welcomeView);
        afterAnimationView = findViewById(R.id.afterAnimationView);
        btValider = findViewById(R.id.btLogin);
    }

    @Override
    public void onClick(View v) {
        if(v == btValider){

        }
    }

    public void afficherMessageErreur(){
        if((TextUtils.isEmpty(edEmail.getText().toString()))
                &&(TextUtils.isEmpty(edPassword.getText().toString()))){
            edEmail.requestFocus();
            edEmail.setError("Veuiller saisir le mail");
            edPassword.setError("Veuillez saisir le mot de passe");

        }else if(TextUtils.isEmpty(edEmail.getText().toString())){
            edEmail.requestFocus();
            edEmail.setError("Veuiller saisir le mail");


        }else if(TextUtils.isEmpty(edPassword.getText().toString())){
            edPassword.requestFocus();
            edPassword.setError("Veuillez saisir le mot de passe");

        }
    }

}
