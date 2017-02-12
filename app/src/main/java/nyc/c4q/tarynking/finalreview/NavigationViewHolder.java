package nyc.c4q.tarynking.finalreview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by tarynking on 2/11/17.
 */

public class NavigationViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public NavigationViewHolder(View itemView) {//get views
        super(itemView);
        textView = (TextView)itemView.findViewById(R.id.list_item_textView);
    }

    public void bind (int position){
        textView.setText(String.valueOf(position));
    }
}
