package dgg.cynthia.com.audiomediaplayer;

import android.content.Intent;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mediaPlayer = new MediaPlayer();
    Button play,stop, examinar;
    private final int PICKER=1;
    private int State =1;
    private final int Playing =1;
    private final int Pausing=2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        examinar = (Button) findViewById(R.id.ID_Examinar);
        play = (Button)findViewById(R.id.ID_Play);
        stop=(Button)findViewById(R.id.ID_Stop);
        examinar.setOnClickListener(this);
        play.setOnClickListener(this);
        stop.setOnClickListener(this);
        mediaPlayer=MediaPlayer.create(this,R.raw.brillas);
        mediaPlayer.setLooping(true);

    }
    private void pickFile(){
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("audio/*");
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        try{
            startActivityForResult(
                    Intent.createChooser(intent,"Instale un administrador de archivos"), PICKER);

        }catch(android.content.ActivityNotFoundException ex){

        }
    }
        protected void onActivityResult(int requestCode, int resultCode, Intent data){
        switch(requestCode){
            case PICKER:
                if(resultCode == RESULT_OK){
                    Uri FilePath = data.getData();
                    String FilePathAudio = getRealPathFromURI(FilePath);
                    try{
                        mediaPlayer.setDataSource(FilePathAudio);
                        mediaPlayer.prepare();

                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
                break;
        }

    }
    public String getRealPathFromURI(Uri contentUri){
        Cursor cursor =null;
        try{
            String[] proj = {MediaStore.Audio.Media.DATA};
            cursor = getApplicationContext().getContentResolver().query(contentUri, proj,null,null, null);
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA);
            cursor.moveToFirst();
            return  cursor.getString(column_index);
        }finally {
            if(cursor !=null){
                cursor.close();
            }
        }
    }
    public void onClick(View v){
      if(v==examinar){
          pickFile();
      }else{
          if(v == play){
              switch (State){
                  case Playing:
                      mediaPlayer.start();
                      State = Pausing;
                      play.setText("Pausa");
                      break;
                  case Pausing:
                      mediaPlayer.pause();
                      State = Playing;
                      play.setText("Play");
                      break;
              }
          }else{
              if(v==stop){
                  mediaPlayer.stop();
                  play.setText("Stop");

              }
          }
      }
    }
}
