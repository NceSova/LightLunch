package com.example.lightlunch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ReciepeAdapter extends RecyclerView.Adapter<ReciepeAdapter.ReciepeViewHolder> {
    private List<Reciepe> reciepes;

    public ReciepeAdapter(List<Reciepe> reciepes) {
        this.reciepes = reciepes;
    }

    @Override
    public ReciepeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.reciepe_item, parent, false);
        return new ReciepeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReciepeViewHolder holder, int position) {
        Reciepe reciepe = reciepes.get(position);
        holder.titleTextView.setText(reciepe.getTitle());
        holder.descriptionTextView.setText(reciepe.getDescription());
    }

    @Override
    public int getItemCount() {
        return reciepes.size();
    }

    public static class ReciepeViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public TextView descriptionTextView;

        public ReciepeViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.title_text_view);
            descriptionTextView = itemView.findViewById(R.id.description_text_view);
        }
    }
}
