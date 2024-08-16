import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.example.components.R
import com.example.components.databinding.ActivityDrawerBinding
import com.example.components.databinding.ActivityMainBinding

class drawerSetup : AppCompatActivity() {
    private lateinit var binding: ActivityDrawerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up DrawerLayout and NavigationView
        val drawerLayout: DrawerLayout = binding.drawerlayout
        val navView = binding.navView

        // Set up navigation drawer toggle
        val toggle = ActionBarDrawerToggle(this, drawerLayout, binding.topbar,R.string.open,
            R.string.close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // Handle navigation item clicks
        navView.setNavigationItemSelectedListener { menuItem ->
            // Handle navigation view item clicks here
            when (menuItem.itemId) {
                R.id.navhome -> {
                    // Handle Home click
                    true
                }
                R.id.task -> {
                    // Handle Task click
                    true
                }
                R.id.navaccountsummary -> {
                    // Handle Account Summary click
                    true
                }
                R.id.navtransfer -> {
                    // Handle Transfer click
                    true
                }
                else -> false
            }
        }
    }
}
