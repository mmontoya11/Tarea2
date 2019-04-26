package com.example.tarea2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tarea2.beans.ItemProduct;

import java.util.ArrayList;

public class FragmentElectronics extends Fragment {

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public FragmentElectronics() {
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_electronics, container, false);
        RecyclerView recyclerView = (RecyclerView)
                view.findViewById(R.id.fragment_electronics_recycler_view);
        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // Use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        ArrayList<ItemProduct> myDataSet = new ArrayList<ItemProduct>();
        ItemProduct itemProduct = new ItemProduct();
        itemProduct.setTitle("Alienware 20\"");
        itemProduct.setStore("Walmart");
        itemProduct.setLocation("Zapotlanejo, Jalisco");
        itemProduct.setPhone("33 7345566");
        itemProduct.setImage(1);
        myDataSet.add(itemProduct);
        mAdapter = new AdapterProduct(getActivity(), myDataSet);
        recyclerView.setAdapter(mAdapter);
        return view;

    }

}
