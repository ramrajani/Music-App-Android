package r_square_corporation.pianio;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private int mNOTE1;
    private int mNOTE2;
    private int mNOTE3;
    private int mNOTE4;
    private int mNOTE5;
    private int mNOTE6;
    private int mNOTE7;
    private SoundPool mSoundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSoundPool = new SoundPool(7, AudioManager.STREAM_MUSIC, 0);
        mNOTE1 = mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        mNOTE2 = mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        mNOTE3 = mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        mNOTE4 = mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        mNOTE5 = mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1);
        mNOTE6 = mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        mNOTE7 = mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1);

    }

    public void playC(View v)
    {
        mSoundPool.play(mNOTE1,1.0f,1.0f,1,0,1.0f);
    }
    public void playD(View v)
    {
        mSoundPool.play(mNOTE2,1.0f,1.0f,1,0,1.0f);
    }
    public void playE(View v)
    {
        mSoundPool.play(mNOTE3,1.0f,1.0f,1,0,1.0f);
    }
    public void playF(View v)
    {
        mSoundPool.play(mNOTE4,1.0f,1.0f,1,0,1.0f);
    }
    public void playG(View v)
    {
        mSoundPool.play(mNOTE5,1.0f,1.0f,1,0,1.0f);
    }
    public void playA(View v)
    {
        mSoundPool.play(mNOTE6,1.0f,1.0f,1,0,1.0f);
    }
    public void playB(View v)
    {
        mSoundPool.play(mNOTE7,1.0f,1.0f,1,0,1.0f);
    }

}
