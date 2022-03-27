
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.geekbrains_login.LoginPage
import com.example.geekbrains_login.ui.login.LoginActivity
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class LoginTests {

    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun checkLogin() {
        LoginPage()
            .setUserName("Maksim")
            .checkLoginButtonIsDisable()
    }

    @Test
    fun checkPassword() {
        LoginPage()
            .setPassword("12345")
            .checkLoginButtonIsDisable()
    }

}