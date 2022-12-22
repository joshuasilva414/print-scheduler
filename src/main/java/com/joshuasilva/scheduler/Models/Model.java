package com.joshuasilva.scheduler.Models;

import com.joshuasilva.scheduler.Views.ViewFactory;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;

    public Operation op;

    private Model() {
        this.viewFactory = new ViewFactory();
        this.op = new Operation();
    }

    public static synchronized Model getInstance() {
        if(model == null) {
            model = new Model();
        }
        return model;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }
}