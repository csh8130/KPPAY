package com.coders.crud.kppay;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.M) {



                    /* 사용자 단말기의 권한 중 "전화걸기" 권한이 허용되어 있는지 체크한다.

                    *  int를 쓴 이유? 안드로이드는 C기반이기 때문에, Boolean 이 잘 안쓰인다.

                    */

            int permissionResult = checkSelfPermission(Manifest.permission.CAMERA);



                    /* CALL_PHONE의 권한이 없을 때 */

            // 패키지는 안드로이드 어플리케이션의 아이디다.( 어플리케이션 구분자 )

            if (permissionResult == PackageManager.PERMISSION_DENIED) {





                        /* 사용자가 CALL_PHONE 권한을 한번이라도 거부한 적이 있는 지 조사한다.

                        * 거부한 이력이 한번이라도 있다면, true를 리턴한다.

                        */

                if (shouldShowRequestPermissionRationale(Manifest.permission.CAMERA)) {



                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);

                    dialog.setTitle("권한이 필요합니다.")

                            .setMessage("이 기능을 사용하기 위해서는 단말기의 \"카메라\" 권한이 필요합니다. 계속하시겠습니까?")

                            .setPositiveButton("네", new DialogInterface.OnClickListener() {

                                @Override

                                public void onClick(DialogInterface dialog, int which) {



                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

                                        requestPermissions(new String[]{Manifest.permission.CAMERA}, 1000);

                                    }



                                }

                            })

                            .setNegativeButton("아니오", new DialogInterface.OnClickListener() {

                                @Override

                                public void onClick(DialogInterface dialog, int which) {

                                    Toast.makeText(MainActivity.this, "기능을 취소했습니다.", Toast.LENGTH_SHORT).show();

                                }

                            })

                            .create()

                            .show();

                }



                //최초로 권한을 요청할 때

                else {

                    // CALL_PHONE 권한을 Android OS 에 요청한다.

                    requestPermissions(new String[]{Manifest.permission.CAMERA}, 1000);

                }



            }

                    /* CALL_PHONE의 권한이 있을 때 */

            else {

            }



        }

                /* 사용자의 OS 버전이 마시멜로우 이하일 떄 */

        else {

        }

    }
    public void onSignInBtClicked(View v){
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA},1000);
        startActivity(new Intent(MainActivity.this, LogInActivity.class));
    }
    public void onSignUpBtClicked(View v){
        startActivity(new Intent(MainActivity.this, CustomerSignUpActivity.class));
    }
}
