package com.example.javadesignpattern.mediator;

public class Champions extends WuLinAlliance {

    public ShaoLin shaoLin;
    public WuDang wuDang;
    public EMei eMei;

    public void setShaoLin(ShaoLin shaoLin) {
        this.shaoLin = shaoLin;
    }

    public void setWuDang(WuDang wuDang) {
        this.wuDang = wuDang;
    }

    public void seteMei(EMei eMei) {
        this.eMei = eMei;
    }

    @Override
    public void notice(String message, United united) {
        if(united instanceof ShaoLin){
            wuDang.getNotice(message);
            eMei.getNotice(message);
        }else if(united instanceof WuDang){
            shaoLin.getNotice(message);
        }else if(united instanceof EMei){
            shaoLin.getNotice(message);
        }
    }
}
