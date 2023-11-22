package com.example.epl498luxzio;

import static android.content.ContentValues.TAG;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import android.widget.Toast;


public class SplashActivity extends AppCompatActivity {
    private static final int SPLASH_DELAY = 8000; // Splash screen duration in milliseconds
    private static final int BOUNCE_DURATION = 1000; // Bouncing animation duration in milliseconds
    private static final int SECONDARY_MOVEMENT_DELAY = 1000; // Delay for secondary movement in milliseconds
    private static final int SECONDARY_MOVEMENT_DURATION = 2000; // Duration of secondary movement in milliseconds
    private static final int FADE_OUT_DURATION = 5500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView logoImageView = findViewById(R.id.logoImageView);

        // Bouncing entrance animation for the logo
        ScaleAnimation bounceAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        bounceAnimation.setDuration(BOUNCE_DURATION);
        bounceAnimation.setInterpolator(new BounceInterpolator());

        // Secondary movement animation for the logo
        Animation secondaryMovementAnimation = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        secondaryMovementAnimation.setStartOffset(SECONDARY_MOVEMENT_DELAY);
        secondaryMovementAnimation.setDuration(SECONDARY_MOVEMENT_DURATION);

        // Fade-out animation for the logo
        AlphaAnimation fadeOutAnimation = new AlphaAnimation(1.0f, 0.0f);
        fadeOutAnimation.setDuration(FADE_OUT_DURATION);

        // Animation set to combine all animations
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(bounceAnimation);
        animationSet.addAnimation(secondaryMovementAnimation);
        animationSet.addAnimation(fadeOutAnimation);

        // Set the animation listener to start the next activity after the animation ends
        animationSet.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Animation start
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Animation end
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Animation repeat
            }
        });

        // Add a listener to the secondary movement animation to trigger the fade-out animation
        secondaryMovementAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Secondary movement animation start
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Secondary movement animation end
                logoImageView.startAnimation(fadeOutAnimation);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Secondary movement animation repeat
            }
        });

        // Apply the animation to the logo
        logoImageView.startAnimation(animationSet);
        logoImageView.setVisibility(ImageView.VISIBLE);

        // Use a Handler to delay the transition to the main activity
        new Handler().postDelayed(() -> {
            Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(mainIntent);
            finish();
        }, SPLASH_DELAY);

        // Retrieve the FCM registration token
        FirebaseMessaging.getInstance().getToken()
                .addOnCompleteListener(new OnCompleteListener<String>() {
                    @Override
                    public void onComplete(Task<String> task) {
                        if (!task.isSuccessful()) {
                            Log.w(TAG, "Fetching FCM registration token failed", task.getException());
                            return;
                        }

                        // Get the FCM registration token
                        String token = task.getResult();

                        // TODO: do smth when opening the push notification
                        // for now we just toast the firebase cloud messaging registration code
                        String msg = "FCM Registration token: " + token;
                        Log.d(TAG, msg);
                        //Toast.makeText(SplashActivity.this, msg, Toast.LENGTH_SHORT).show();
                    }
                });
    }
}