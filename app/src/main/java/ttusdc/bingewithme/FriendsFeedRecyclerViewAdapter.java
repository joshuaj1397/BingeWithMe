package ttusdc.bingewithme;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ttusdc.bingewithme.FriendsFeedFragment.OnListFragmentInteractionListener;

import java.util.List;

public class FriendsFeedRecyclerViewAdapter extends
    RecyclerView.Adapter<FriendsFeedRecyclerViewAdapter.ViewHolder> {

  private final List<FriendsFeedItem> mValues;
  private final OnListFragmentInteractionListener mListener;

  public FriendsFeedRecyclerViewAdapter(List<FriendsFeedItem> items,
      OnListFragmentInteractionListener listener) {
    mValues = items;
    mListener = listener;
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.fragment_item, parent, false);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(final ViewHolder holder, int position) {
    holder.mItem = mValues.get(position);
    holder.mMediaNameView.setText(mValues.get(position).getMediaName());
    holder.mProfileNameView.setText(mValues.get(position).getProfileName());
    holder.mProgressView.setText(mValues.get(position).getmediaProgress());

    holder.mView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (null != mListener) {
          // Notify the active callbacks interface (the activity, if the
          // fragment is attached to one) that an item has been selected.
          mListener.onListFragmentInteraction(holder.mItem);
        }
      }
    });
  }

  @Override
  public int getItemCount() {
    return mValues.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {
    public final View mView;
    public final TextView mProfileNameView;
    public final TextView mMediaNameView;
    public final TextView mProgressView;
    public FriendsFeedItem mItem;

    public ViewHolder(View view) {
      super(view);
      mView = view;
      mProfileNameView = (TextView) mView.findViewById(R.id.profileName);
      mMediaNameView = (TextView) mView.findViewById(R.id.mediaName);
      mProgressView = (TextView) mView.findViewById(R.id.mediaProgress);
    }

    @Override
    public String toString() {
      return super.toString() + " '" + mProfileNameView.getText() + "'";
    }
  }
}
