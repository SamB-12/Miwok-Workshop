package com.example.miwok_workshop;

public class MiwokModel {

    String miwokWord,miwokTranslate;
    int imagResId = 0;

    public MiwokModel(String mMiwokword, String  mMiwokTranslate, int mImagResId){
        this.miwokWord = mMiwokword;
        this.miwokTranslate = mMiwokTranslate;
        this.imagResId = mImagResId;
    }

    public MiwokModel(String mMiwokword, String mMiwokTranslate){
        this.miwokWord = mMiwokword;
        this.miwokTranslate = mMiwokTranslate;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public void setMiwokWord(String miwokWord) {
        this.miwokWord = miwokWord;
    }

    public String getMiwokTranslate() {
        return miwokTranslate;
    }

    public void setMiwokTranslate(String miwokTranslate) {
        this.miwokTranslate = miwokTranslate;
    }

    public int getImagResId() {
        return imagResId;
    }

    public void setImagResId(int imagResId) {
        this.imagResId = imagResId;
    }

    public boolean hasImage(){
        return imagResId!=0;
    }
}
