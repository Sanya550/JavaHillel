package com.company.HW9;

public class InitilizationData {
private boolean ch;
    Information information = new Information();
    public void filling(){
        for(int i = 1;i<31;i++){
            information.fakeName.add("Genius "+ i);
            information.mails.add("Mail  "+ i+" @ukr.net");
            information.map.put(information.mails,information.fakeName);
        }

        for(int j = 50;j<60;j++){

            information.fakeName.add("alex "+j);
            information.mails.add("alex "+j);
            information.map.put(information.mails,information.mails);

        }
    }

    public boolean isCh() {
        return ch;
    }

    public void setCh(boolean ch) {
        if( (information.fakeName.size() == information.mails.size()) && (information.mails.size() == information.map.size()))
        {
            ch = false;
        }
        else{
            ch = true;
        }
        this.ch = ch;
    }

}
