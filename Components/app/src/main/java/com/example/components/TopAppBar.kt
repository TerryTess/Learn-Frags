import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.components.R
import com.example.components.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set toolbar as support action bar
        setSupportActionBar(binding.topbar)

        // Handle menu item clicks
        binding.topbar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.search -> {
                    // Handle settings click
                    Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.favorite -> {
                    // Handle about click
                    Toast.makeText(this, "About clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        // Handle button click
        binding.textbutton.setOnClickListener {
            Toast.makeText(this, "Text Button clicked", Toast.LENGTH_SHORT).show()
            // Add more functionality here if needed
        }

        // Handle image view click (if needed)
        binding.imageview.setOnClickListener {
            Toast.makeText(this, "Image clicked", Toast.LENGTH_SHORT).show()
            // Add more functionality related to the image here
        }
    }
}
