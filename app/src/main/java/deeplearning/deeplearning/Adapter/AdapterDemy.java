package deeplearning.deeplearning.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import deeplearning.deeplearning.R;

public class AdapterDemy extends RecyclerView.Adapter<AdapterDemy.MyHolder> {

    private LayoutInflater mInflate;
    private ArrayList<String> mitems = new ArrayList<>();

    public AdapterDemy(Context context) {

        mInflate = LayoutInflater.from(context);
        mitems = generateValues();


    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = mInflate.inflate(R.layout.item_list, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {


        holder.demmy.setText(mitems.get(position).toString());

    }

    @Override
    public int getItemCount() {
        return 100;
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        TextView demmy;
        public MyHolder(View itemView) {
            super(itemView);
            demmy = itemView.findViewById(R.id.demmy);
        }
    }

    private static ArrayList<String> generateValues(){

        ArrayList<String> dummyValues = new ArrayList<>();
        for (int i=1; i< 101; i++ ){

            dummyValues.add("items" + i);
        }
    return dummyValues;
    }
}
