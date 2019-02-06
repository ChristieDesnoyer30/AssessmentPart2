package com.company;

import java.util.ArrayList;

public class Zoo {

    private ArrayList<Pen> zooPens = new ArrayList<>();
    int i = 0;

    public void addPenToZoo(Pen pens){

        zooPens.add(pens);
    }

    public void printZoo()
    {
      for(Pen pens : zooPens)  {

          pens.printPenDetails();
      }

    }






}
