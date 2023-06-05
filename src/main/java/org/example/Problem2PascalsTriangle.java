package org.example;

import java.util.ArrayList;

public class Problem2PascalsTriangle {
    public ArrayList<ArrayList<Long>> generate(int n) {
        ArrayList<ArrayList<Long>> res = new ArrayList<>();

        ArrayList<Long> row, pre = null;

        for(int i=0; i< n; i++){
            row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i)
                    row.add(1l);
                else
                    row.add(pre.get(j-1)+ pre.get(j));
            }
            pre = row;
            res.add(row);
        }

        return res;
    }
}
