package com.karen.photopicker.fragment_utils;


public enum FragmentTag {

    GALLERY("Gallery"),
    FAVORITE("Favorite");
    private String tag;

    FragmentTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return tag;
    }
}
