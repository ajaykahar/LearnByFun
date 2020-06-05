package com.example.learnbyfun;

public class Word {
    private String eng_word;
    private String hindi_word;
    private  int No_image_provided = -1;

    private int image_resource_id = No_image_provided;

    private int audio_resource_id = -1;

    public Word(String english,String hindi,int audio_id)
    {
        eng_word=english;
        hindi_word=hindi;
        audio_resource_id=audio_id;
    }

    public Word(String english,String hindi,int Image_id,int audio_id)
    {
        eng_word=english;
        hindi_word=hindi;
        image_resource_id=Image_id;
        audio_resource_id=audio_id;
    }
    public String getEng_word()
    {
        return eng_word;
    }
    public String getHindi_word()
    {
        return hindi_word;
    }
    public int getImage_resource_id()
    { return image_resource_id; }
    public int getAudio_resource_id()
    { return audio_resource_id; }
    public boolean hasImage()
    {
        if(image_resource_id==-1) {return false; }
        else { return true;}
    }

}
