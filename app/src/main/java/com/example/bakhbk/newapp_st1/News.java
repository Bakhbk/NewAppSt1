package com.example.bakhbk.newapp_st1;

class News {

    // Section name of the news
    private final String mSectionName;
    // Web title of the news
    private final String mWebTitle;

    // Date of the news
    private final String mDate;

    // Date of the news
    private final String mArticleAuthor;

    // Website URL of the news
    private final String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param sectionName is the sectionName of the news
     * @param webTitle    is the webTitle of the news
     * @param date        is the time in date when the news happened
     * @param url         is the website URL to find more details about the news
     */
    public News(String sectionName, String webTitle, String date, String articleAuthor, String url) {
        mSectionName = sectionName;
        mWebTitle = webTitle;
        mDate = date;
        mArticleAuthor = articleAuthor;
        mUrl = url;
    }

    // Returns the section name of the news
    public String getSectionName() {
        return mSectionName;
    }

    /// Returns the web title of the news
    public String getWebTitle() {
        return mWebTitle;
    }

    // Returns the date when the news happened
    public String getDate() {
        return mDate;
    }

    /// Returns the web title of the news
    public String getArticleAuthor() {
        return mArticleAuthor;
    }

    // Returns the website URL to find more information about the earthquake.
    public String getUrl() {
        return mUrl;
    }
}