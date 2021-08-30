package com.example.android02.login;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android02.listview.R;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvUser;
    private Button btEdit;
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        tvUser = (TextView)findViewById(R.id.tvUserName);
        btEdit = (Button)findViewById(R.id.btEdit);
        btEdit.setOnClickListener(this);

        Intent intent = getIntent();
        String username = intent.getStringExtra("USER_NAME");
        tvUser.setText(username);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btEdit:
                onEdit();
                break;
            default:
                break;
        }
    }

    private void onEdit() {
        Intent intent = new Intent(this, EditUserActivity.class);
        intent.putExtra("USER_NAME", tvUser.getText().toString());
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                String result = data.getStringExtra("RESULT");
                tvUser.setText(result);
            }
        }
    }
}