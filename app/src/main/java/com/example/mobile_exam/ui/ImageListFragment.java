package com.example.mobile_exam.ui;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mobile_exam.R;
import com.example.mobile_exam.adapters.ImageListRecyclerAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ImageListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ImageListFragment extends Fragment implements ImageListRecyclerAdapter.ImageListRecyclerClickListener{

    private static final String TAG = "ImageListFragment";
    private static final int NUM_COLUMNS = 2;

    //widgets
    private RecyclerView mRecyclerView;


    //vars
    private ArrayList<Integer> mImageResources = new ArrayList<>();
    private IProfile mIProfile;

    public ImageListFragment() {
        // Required empty public constructor
    }


    public static ImageListFragment newInstance() {
        return new ImageListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image_list, container, false);
        mRecyclerView = view.findViewById(R.id.image_list_recyclerview);

        getImageResouces();
        initRecyclerview();

        return view;
    }

    private void getImageResouces(){
        mImageResources.add(R.drawable.cwm_logo);
        mImageResources.add(R.drawable.cartman_cop);
        //mImageResources.add(R.drawable.eric_cartman);
        //mImageResources.add(R.drawable.ike);
        //mImageResources.add(R.drawable.kyle);
        //mImageResources.add(R.drawable.satan);
        //mImageResources.add(R.drawable.chef);
        //mImageResources.add(R.drawable.tweek);
        mImageResources.add(R.drawable.cinema);
        mImageResources.add(R.drawable.glasses);
        mImageResources.add(R.drawable.knight);
        mImageResources.add(R.drawable.knight_a);
        //mImageResources.add(R.drawable.knight_b);
        mImageResources.add(R.drawable.man);
        mImageResources.add(R.drawable.man_a);
        mImageResources.add(R.drawable.man_b);
        //mImageResources.add(R.drawable.man_c);
        //mImageResources.add(R.drawable.man_d);
        mImageResources.add(R.drawable.man_e);
        mImageResources.add(R.drawable.man_f);
        //mImageResources.add(R.drawable.man_g);
        mImageResources.add(R.drawable.man_h);
        mImageResources.add(R.drawable.man_i);
        mImageResources.add(R.drawable.man_j);
        mImageResources.add(R.drawable.man_k);
        //mImageResources.add(R.drawable.man_l);
        mImageResources.add(R.drawable.man_m);
        mImageResources.add(R.drawable.man_n);
        mImageResources.add(R.drawable.man_o);
        mImageResources.add(R.drawable.man_p);
        //mImageResources.add(R.drawable.man_q);
        mImageResources.add(R.drawable.man_r);
        //mImageResources.add(R.drawable.man_s);
        mImageResources.add(R.drawable.man_t);
        mImageResources.add(R.drawable.man_u);
        mImageResources.add(R.drawable.man_v);
        mImageResources.add(R.drawable.man_x);
        mImageResources.add(R.drawable.people);
        mImageResources.add(R.drawable.people_a);
        mImageResources.add(R.drawable.people_b);
        mImageResources.add(R.drawable.people_c);
        mImageResources.add(R.drawable.people_d);
        mImageResources.add(R.drawable.people_e);
        mImageResources.add(R.drawable.people_f);
        mImageResources.add(R.drawable.people_g);
        mImageResources.add(R.drawable.people_h);
        mImageResources.add(R.drawable.people_i);
        mImageResources.add(R.drawable.people_j);
        mImageResources.add(R.drawable.people_k);
        mImageResources.add(R.drawable.people_l);
        mImageResources.add(R.drawable.people_m);
        mImageResources.add(R.drawable.people_n);
        mImageResources.add(R.drawable.people_o);
        mImageResources.add(R.drawable.people_p);
        mImageResources.add(R.drawable.people_q);
        mImageResources.add(R.drawable.people_r);
        mImageResources.add(R.drawable.people_s);
        mImageResources.add(R.drawable.people_t);
        mImageResources.add(R.drawable.people_u);
        mImageResources.add(R.drawable.people_v);
        mImageResources.add(R.drawable.people_w);
        mImageResources.add(R.drawable.people_x);
        mImageResources.add(R.drawable.people_y);
        mImageResources.add(R.drawable.people_z);
        //mImageResources.add(R.drawable.people_aa);
        mImageResources.add(R.drawable.people_ab);
        //mImageResources.add(R.drawable.people_ac);
        mImageResources.add(R.drawable.people_ad);
        mImageResources.add(R.drawable.people_ae);
        //mImageResources.add(R.drawable.people_af);
        mImageResources.add(R.drawable.people_ag);
        //mImageResources.add(R.drawable.people_ah);
        //mImageResources.add(R.drawable.people_ai);
        //mImageResources.add(R.drawable.people_aj);
        //mImageResources.add(R.drawable.people_ak);
        //mImageResources.add(R.drawable.people_al);
        //mImageResources.add(R.drawable.people_am);
        //mImageResources.add(R.drawable.people_an);
        mImageResources.add(R.drawable.people_ao);
        //mImageResources.add(R.drawable.people_ap);
        mImageResources.add(R.drawable.people_aq);
        //mImageResources.add(R.drawable.people_ar);
        mImageResources.add(R.drawable.people_as);
        //mImageResources.add(R.drawable.people_at);
        //mImageResources.add(R.drawable.people_au);
        //mImageResources.add(R.drawable.people_av);
        //mImageResources.add(R.drawable.people_ax);
        //mImageResources.add(R.drawable.people_ay);
        //mImageResources.add(R.drawable.people_az);
        mImageResources.add(R.drawable.people_ba);
        mImageResources.add(R.drawable.people_bb);
        //mImageResources.add(R.drawable.people_bc);
        //mImageResources.add(R.drawable.people_bd);
        //mImageResources.add(R.drawable.people_be);
        mImageResources.add(R.drawable.people_bf);
        //mImageResources.add(R.drawable.people_bg);
        //mImageResources.add(R.drawable.people_bh);
        mImageResources.add(R.drawable.people_bi);
        mImageResources.add(R.drawable.people_bj);
        mImageResources.add(R.drawable.people_bk);
        mImageResources.add(R.drawable.people_bl);
        mImageResources.add(R.drawable.people_bm);
        //mImageResources.add(R.drawable.security);
        //mImageResources.add(R.drawable.security_a);
        mImageResources.add(R.drawable.security_b);
        //mImageResources.add(R.drawable.security_c);
        //mImageResources.add(R.drawable.security_d);
        mImageResources.add(R.drawable.security_e);
        mImageResources.add(R.drawable.wizard);
        mImageResources.add(R.drawable.wizard_a);


    }

    private void initRecyclerview(){
        ImageListRecyclerAdapter mAdapter = new ImageListRecyclerAdapter(getActivity(), mImageResources, this);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(staggeredGridLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mIProfile = (IProfile) getActivity();
    }

    @Override
    public void onImageSelected(int position) {
        mIProfile.onImageSelected(mImageResources.get(position));
    }
}








