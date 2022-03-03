package com.example.dipeshshome.theeasyfindings_jfp.DatabaseRelated;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.dipeshshome.theeasyfindings_jfp.R;

import java.util.ArrayList;

public class DatabaseMain extends AppCompatActivity {
DBhelper dbhelper;
ArrayAdapter<String>mAdapter;
ListView lsttask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_main);
        dbhelper =new DBhelper(this);
        lsttask=(ListView)findViewById(R.id.lsttask);
        LoadtaskList();
    }

    private void LoadtaskList() {
        ArrayList<String> taskList = dbhelper.getTaskList();
        if (mAdapter == null)
        {
            mAdapter=new ArrayAdapter<String>(this,R.layout.row,R.id.task,taskList);
            lsttask.setAdapter(mAdapter);
        }
        else
        {
            mAdapter.clear();
            mAdapter.addAll(taskList);
            mAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }
     //DIALOUGE BOX AND INSTRUCTION MESSAGE FOR INSERTING DATA AND SAVE DATA AND SHOW DATA//
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.actionAdd:
                final EditText taskEditText= new EditText(this);
                AlertDialog dialog = new AlertDialog.Builder(this)
                        .setTitle("Your Plan")
                        .setMessage("Add your Plan Here")
                        .setView(taskEditText)
                        .setPositiveButton("Add", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String task = String.valueOf(taskEditText.getText());
                                dbhelper.insertNewTask(task);
                                LoadtaskList();

                            }
                        })
                        .setNegativeButton("Cancel",null)
                        .create();
                        dialog.show();
                        return true;
        }
        return super.onOptionsItemSelected(item);
    }
   //BY CLICKING DELETE ICON DELETE DATA CODE //
    public void deleteTask(View view)
    {
        View parent=(View)view.getParent();
        TextView taskview = (TextView)parent.findViewById(R.id.task);
        String task= String.valueOf(taskview.getText());
        dbhelper.deleteTask(task);
        LoadtaskList();
    }
}
