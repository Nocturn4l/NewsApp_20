package com.example.dovah.newsapp_10;

/**
 * An {@link Article} object contains information related to a single article.
 */
public class Article {

    /**
     * Title of the article
     */
    private String mTitle;

    /**
     * Section of the article
     */
    private String mSection;

    /**
     * Author of the article, if present
     */
    private String mAuthor;

    /**
     * Date of the article
     */
    private String mDate;

    /**
     * Web url of the article
     */
    private String mUrl;


    /**
     * Constructs a new {@link Article} object.
     */
    public Article(String title, String section, String author, String date, String url) {
        mTitle = title;
        mSection = section;
        mAuthor = author;
        mDate = date;
        mUrl = url;
    }

    /**
     * Returns the Title of the article.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the Section of the article.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the author of the article.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the  Date of the article.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the website url of the article.
     */
    public String getUrl() {
        return mUrl;
    }
}