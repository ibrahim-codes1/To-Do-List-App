package com.example.to_dolist;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class toDoAdapter extends RecyclerView.Adapter<toDoAdapter.MyViewHolder> {

    //tasklist
    private List<toDoModel> tasklist;

    public  toDoAdapter(List<toDoModel> tasklist){
        this.tasklist = tasklist;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tasklayout,parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        toDoModel model = tasklist.get(position);
        holder.checkBox.setText(model.getTask());
        holder.checkBox.setChecked(model.isDone());
        if(model.isDone()){
            holder.checkBox.setPaintFlags(
                    holder.checkBox.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG
            );
        } else{
            holder.checkBox.setPaintFlags(
                    holder.checkBox.getPaintFlags() & ~Paint.STRIKE_THRU_TEXT_FLAG
            );
        }

        holder.checkBox.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            model.setDone(isChecked);

            if(isChecked){
                holder.checkBox.setPaintFlags(
                        holder.checkBox.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG
                );
            } else{
                holder.checkBox.setPaintFlags(
                        holder.checkBox.getPaintFlags() & ~Paint.STRIKE_THRU_TEXT_FLAG
                );
            }

        }));
    }

    @Override
    public int getItemCount() {
        return tasklist.size();
    }

    public void addTask(toDoModel task){
        tasklist.add(task);
        notifyItemInserted(tasklist.size() -1);
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        CheckBox checkBox;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            checkBox = itemView.findViewById(R.id.checkBox);
        }
    }


}
