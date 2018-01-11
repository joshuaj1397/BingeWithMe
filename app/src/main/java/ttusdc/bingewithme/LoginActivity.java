package ttusdc.bingewithme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

  @BindView(R.id.fb_login_button) LoginButton loginButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    ButterKnife.bind(this);

    CallbackManager callbackManager = CallbackManager.Factory.create();
    loginButton.setReadPermissions("email", "public profile", "user_friends");
    loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {

      // TODO: Implement successful login method
      @Override
      public void onSuccess(LoginResult loginResult) {
        // App code
      }

      @Override
      public void onCancel() {
        // Do nothing
      }

      // TODO: Implement debug logging
      @Override
      public void onError(FacebookException exception) {
        // App code
      }
    });
  }
}