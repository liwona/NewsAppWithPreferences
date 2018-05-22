package com.example.android.newsapp;


public class News {

    /** Title of the news */
    private String mTitle;

    /** Section of the news */
    private String mSection;

    /** Publication Date of the news */
    private String mPublicationDate;

    /** Author of the news */
    private String mAuthor;

    /** Website of the news */
    private String mUrl;

    /**
     * Create a new News object.
     *
     * @param title is webTitle of the News
     * @param section is the section which the News belongs to
     * @param publicationDate is the date the News was published
     * @param author is the author of the News
     * @param url is the website URL to find more details about the news
     */
    public News(String title, String section, String publicationDate, String author,
                String url){
        mTitle = title;
        mSection = section;
        mPublicationDate = publicationDate;
        mAuthor = author;
        mUrl = url;
    }

    /**
     * @return title of the news
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * @return section of the news
     */
    public String getSection() {
        return mSection;
    }

    /**
     * @return publication date of the news
     */
    public String getPublicationDate() {
        return mPublicationDate;
    }

    /**
     * @return author name of the news
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * @return URL of the news
     */
    public String getUrl() {
        return mUrl;
    }
}
