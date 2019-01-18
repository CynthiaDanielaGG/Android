package dgg.cynthia.com.sockets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread tthread = new Thread(new Runnable(){
            @Override
            public void run() {
                Connect();
            }});
        tthread.start();
    }

    public void Connect(){
        try {
            Socket SOCK = new Socket("192.168.0.26", 9000);
            PrintWriter pw = new PrintWriter(SOCK.getOutputStream());
            pw.println("ANDROID");
            Log.e("enterado", "mensaje");
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
