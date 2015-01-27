package com.example.andres.avenpol;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;



import java.util.ArrayList;
import java.util.List;



import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemLongClickListener;

/**
 * Created by Administrador on 31/08/13.
 */
public class Comentarios extends Activity implements OnClickListener {

    // Array of options --> ArrayAdapter --> ListView

    //List view: {views: da_items.xml}
    private Button btnAddComent;
    private EditText etComentario;
    private ListView lv;
    ArrayList<String> list = new ArrayList<String>();
    ArrayAdapter<String> adapter;
    ListView mListView;
    EditText mValue;
    Button mAdd;
    Bundle tit;
    List<String> data = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_comentarios);
        tit=getIntent().getExtras();


        btnAddComent = (Button)findViewById(R.id.btnAddComent);
        btnAddComent.setOnClickListener(this);
        etComentario = (EditText)findViewById(R.id.etComentario);

        adapter = new ArrayAdapter<String>(this, R.layout.da_item, list);
        adapter.add("Para: Malicia \n La comida esta mala");
        // set the lv variable to your list in the xml
        lv=(ListView)findViewById(R.id.list);
        lv.setAdapter(adapter);

	    /*lv.setOnItemLongClickListener(new OnItemLongClickListener() {
            // setting onItemLongClickListener and passing the position to the function
                      @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
                    int position, long arg3) {
                    	  list.remove(position);
                          adapter.notifyDataSetChanged();

                return true;
            }
        });*/
        // registerForContextMenu(lv);


	   /* mListView = (ListView) findViewById(R.id.custom_list);
	    mValue = (EditText) findViewById(R.id.text_to_add);
	    mAdd = (Button) findViewById(R.id.add_string);

	    mListView.setAdapter(new ArrayAdapter<String>(this,
	            android.R.layout.simple_list_item_1, data));
	    mAdd.setOnClickListener(new OnClickListener() {

	        @Override
	        public void onClick(View currentView) {
	            data.add(new String(mValue.getText().toString()));
	        }
	    });*/
    }
    /*protected void removeItemFromList(int position) {
        final int deletePosition = position;
        data.remove(deletePosition);
        adapter.notifyDataSetChanged();
        adapter.notifyDataSetInvalidated();

        /*AlertDialog.Builder alert = new AlertDialog.Builder(
                MainActivity.this);

        alert.setTitle("Delete");
        alert.setMessage("Do you want delete this item?");
        alert.setPositiveButton("YES", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TOD O Auto-generated method stub

                    // main code on after clicking yes
                    data.remove(deletePosition);
                    adapter.notifyDataSetChanged();
                    adapter.notifyDataSetInvalidated();

            }

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

            }
        });
        alert.setNegativeButton("CANCEL", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
                dialog.dismiss();
            }
        });


        alert.show();


    }*/
    public void onClick(View v)
    {
        String local= tit.getString("name");
        String input = "Para: "+local+ "\n"+etComentario.getText().toString();
        if(input.length() > 0)
        {
            // add string to the adapter, not the listview
            adapter.add(input);
            // no need to call adapter.notifyDataSetChanged(); as it is done by the adapter.add() method
        }
    }
    /*@Override
    public void onCreateContextMenu(ContextMenu menu, View v,
        ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Modificar");
        menu.add(0, v.getId(), 0, "Editar");
        menu.add(0, v.getId(), 0, "Eliminar");
      if (v.getId()==R.id.list) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)menuInfo;
        //menu.setHeaderTitle(Countries[info.position]);
      String[] menuItems = getResources().getStringArray(R.array.menu);
        for (int i = 0; i<menuItems.length; i++) {
          menu.add(Menu.NONE, i, i, menuItems[i]);
        }
      }
    }*/
	/*@Override
   public boolean onContextItemSelected(MenuItem item) {
        if(item.getTitle()=="Editar"){Editar(item.getItemId());}
        else if(item.getTitle()=="Eliminar"){Eliminar(item.getItemId());}
        else {return false;}
    return true;
    }

    public void Editar(int id){
        Toast.makeText(this, "Producto Editado" , Toast.LENGTH_SHORT).show();
    }
    public void Eliminar(int id){
        Toast.makeText(this, "Producto Eliminado", Toast.LENGTH_SHORT).show();
    }
*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_comentarios, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
