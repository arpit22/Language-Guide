
package com.example.android.miwok;



public class Word {



    private int mDefaultTranslationId;

    private int mMiwokTranslationId;


    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(int defaultTranslationId, int miwokTranslationId, int audioResourceId) {
        mDefaultTranslationId = defaultTranslationId;
        mMiwokTranslationId = miwokTranslationId;
        mAudioResourceId = audioResourceId;
    }



    public Word(int defaultTranslationId, int miwokTranslationId, int imageResourceId,
                int audioResourceId) {
        mDefaultTranslationId = defaultTranslationId;
        mMiwokTranslationId = miwokTranslationId;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }



    public int getDefaultTranslationId() {
        return mDefaultTranslationId;
    }



    public int getMiwokTranslationId() {
        return mMiwokTranslationId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}