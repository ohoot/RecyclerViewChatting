package friendslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.joo.recyclerviewchatting.R;

public class FriendsListActivity extends AppCompatActivity {

    ListView friendsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_list);

        friendsList = (ListView) findViewById(R.id.list_friends);
    }
}
