package com.ecnu.leondu.readingschedule;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    RecyclerView recyclerView;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_View);

//        recyclerView = (RecyclerView) container.findViewById(R.id.recycler_View);
        // 创建线性布局管理器（默认是垂直方向）
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.addItemDecoration(new RecycleViewDivider(getActivity(),LinearLayoutManager.HORIZONTAL));
        // 匿名类
        recyclerView.setAdapter(new BookRecyclerViewAdapter());


        return view;
    }

    private class BookRecyclerViewAdapter extends RecyclerView.Adapter {
        class BookViewHolder extends RecyclerView.ViewHolder {

            private TextView bookNameTextView;
            private TextView bookReadingStatusTextView;
            private ImageView bookCoverImage;

            public BookViewHolder(View itemView) {
                super(itemView);
                bookNameTextView = (TextView) itemView.findViewById(R.id.txt_bookName);
                bookReadingStatusTextView = (TextView) itemView.findViewById(R.id.txt_bookReadingStatus);
                bookCoverImage = (ImageView) itemView.findViewById(R.id.img_bookImage);

            }

            public TextView getBookNameTextView() {
                return bookNameTextView;
            }

            public TextView getBookReadingStatusTextView() {
                return bookReadingStatusTextView;
            }

            public ImageView getBookCoverImage() {
                return bookCoverImage;
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            return new BookRecyclerViewAdapter.BookViewHolder(LayoutInflater.from(getContext()).inflate(R.layout.item_book, null));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

            final BookViewHolder viewHolder = (BookRecyclerViewAdapter.BookViewHolder) holder;
            viewHolder.getBookNameTextView().setText("书名" + position + "号");
            viewHolder.getBookCoverImage().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), "点击了第" + position + "个控件", Toast.LENGTH_SHORT).show();
                }
            });
            viewHolder.getBookReadingStatusTextView().setText("已阅读" + "(" + position + "/100)页");
        }

        @Override
        public int getItemCount() {
            return 1000;
        }
    }
}
