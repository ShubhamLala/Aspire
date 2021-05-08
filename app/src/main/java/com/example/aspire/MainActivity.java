package com.example.aspire;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuItemCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    SearchView searchView;
    Button button;
    TextView tv;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button2);
        tv=findViewById(R.id.randq);
        final String[] Arr={"The only way to learn mathematics is to do mathematics  Paul Halmos", "The journey is the reward. —Chinese Proverb","The best way to predict your future is to create it. —Abraham Lincoln","Success is walking from failure to failure with no loss of enthusiasm. –Winston Churchill","Success is no accident. It is hard work, perseverance, learning, studying, sacrifice and most of all, love of what you are doing or learning to do. –Pele","Studying whether there’s life on Mars or studying how the universe began, there’s something magical about pushing back the frontiers of knowledge. That’s something that is almost part of being human, and I’m certain that will continue.–Sally Ride","Real difficulties can be overcome; it is only the imaginary ones that are unconquerable. –Theodore N. Vail","People who succeed have momentum. The more they succeed, the more they want to succeed, and the more they find a way to succeed. Similarly, when someone is failing, the tendency is to get on a downward spiral that can even become a self-fulfilling prophecy. –Tony Robbins","People often say that motivation doesn’t last. Well, neither does bathing – that’s why we recommend it daily.–Zig Ziglar","Our greatest fear should not be of failure but of succeeding at things in life that don’t really matter. –Francis Chan","Only put off until tomorrow what you are willing to die having left undone.–Pablo Picasso","No profit grows where is no pleasure ta’en. In brief, sir, study what you most affect. ― William Shakespeare, The Taming of the Shrew","No masterpiece was ever created by a lazy artist.–Anonymous","Motivation is what gets you started. Habit is what keeps you going.–Jim Ryun","Learning is like rowing upstream, not to advance is to drop back. —Chinese Proverb","Learn from yesterday, live for today, hope for tomorrow.—Albert Einstein","It is wiser to find out than to suppose. —Mark Twain","It does not matter where you go and what you study, what matters most is what you share with yourself and the world.― Santosh Kalwar","Innovation distinguishes between a leader and a follower. –Steve Jobs","In my experience, there is only one motivation, and that is desire. No reasons or principle contain it or stand against it. –Jane Smiley","If you want to make a permanent change, stop focusing on the size of your problems and start focusing on the size of you!–T. Harv Eker","If you have a dream, you can spend a lifetime studying, planning, and getting ready for it. What you should be doing is getting started.–Drew Houston","If education were the same as information, the encyclopedias would be the greatest sages in the world.―Abhijit Naskar","I find that the harder I work, the more luck I seem to have. –Thomas Jefferson","Experience: that most brutal of teachers. But you learn, my God do you learn.–C.S. Lewis","Even if you’re on the right track, you’ll get run over if you just sit there.—Will Rogers","Education is what survives when what has been learned has been forgotten. —B. F. Skinner","Education enables the humans to achieve their fullest mental and physical potential in both personal and social life.―Abhijit Naskar","Do one thing every day that scares you.–Anonymous","Do not wait to strike till the iron is hot; but make it hot by striking.—William Butler Yeats","Be miserable. Or motivate yourself. Whatever has to be done, it’s always your choice. –Wayne Dyer","Be a student as long as you still have something to learn, and this will mean all your life.—Henry L. Doherty","All progress takes place outside the comfort zone.–Michael John Bobak","Acquiring knowledge is the most fruitful effort. ―Eraldo Banovac","In real life, there is no such thing as second place. Either you are a winner, or you’re not.–Anonymous","You’ve got to get up every morning with determination if you’re going to go to bed with satisfaction. –George Lorimer","You may have to fight a battle more than once to win it.–Margaret Thatcher","Without mathematics, there’s nothing you can do. Everything around you is mathematics. Everything around you is numbers.– Shakuntala Devi","When it’s finals week and you’ve been studying for five hours straight, you need three things to get you through the night. The biggest Slurpee you can find, half cherry half Coke. Pajama pants, the kind that have been washed so many times they are tissue-paper thin. And finally, dance breaks. Lots of dance breaks.― Jenny Han","Whatever you can do, or dream you can do, begin it. Boldness has genius, power, and magic in it. Begin it now.—Goethe","What seems to us as bitter trials are often blessings in disguise.– Oscar Wilde","We do what we have to so we can do what we want to.― James Farmer","Try not to become a person of success, but rather try to become a person of value.– Albert Einstein","Trust because you are willing to accept the risk, not because it’s safe or certain. – Anonymous","To acquire knowledge, one must study; but to acquire wisdom, one must observe.― Marilyn Vos Savant","The successful warrior is the average man, with laser-like focus.–Bruce Lee","The study of mathematics, like the Nile, begins in minuteness but ends in magnificence. – Charles Caleb Colton","The reason most people never reach their goals is that they don’t define them, or ever seriously consider them as believable or achievable. Winners can tell you where they are going, what they plan to do along the way, and who will be sharing the adventure with them. –Denis Watiley","The purpose of learning is growth, and our minds, unlike our bodies, can continue growing as long as we live.—Mortimer Adler","Be the change you want to see in the world - M.K. Gandhi"};
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rando=(int)(Math.random()*50);
                tv.setText(Arr[rando]);
            }
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawer);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        searchView = findViewById(R.id.search);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
        TextView studyTextView = findViewById(R.id.study);
        FloatingActionButton floatingActionButton = findViewById(R.id.floatingAction);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TextRecognition.class));
            }
        });
        studyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,StudyMaterial.class));
            }
        });
        TextView testTextView = findViewById(R.id.test);
        testTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Test.class));
            }
        });


    NavigationView navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                menuItem.setChecked(true);
                drawerLayout.closeDrawers();
                String message = null;
                switch (menuItem.getItemId()){
                    case R.id.grapher:
                        message = "https://www.desmos.com/calculator";
                        break;
                    case R.id.equation:
                        message = "https://www.wolframalpha.com/widgets/view.jsp?id=ae438682ce61743f90d4693c497621b7";
                        break;
                    case R.id.matrix:
                        message = "https://m.matrix.reshish.com";
                }
                Intent intent = new Intent(MainActivity.this,Utilites.class);
                intent.putExtra("url",message);
                startActivity(intent);
                return true;
            }
        });
    }


        @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        final MenuItem searchItem = menu.findItem(R.id.search);
        searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                String string = searchView.getQuery().toString();
                Intent newIntent = new Intent(Intent.ACTION_WEB_SEARCH);
                newIntent.putExtra(SearchManager.QUERY,string);
                startActivity(newIntent);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return true;
    }
}
