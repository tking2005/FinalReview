package nyc.c4q.tarynking.finalreview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tarynking on 2/11/17.
 */

public class NavigationAdapter extends RecyclerView.Adapter <NavigationViewHolder>{


    @Override
    public NavigationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nav_item_layout,parent,false);
        return new NavigationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NavigationViewHolder holder, int position) {
        holder.bind(position);

    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
