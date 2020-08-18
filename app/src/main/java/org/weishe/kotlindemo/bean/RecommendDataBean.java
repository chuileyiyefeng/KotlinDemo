package org.weishe.kotlindemo.bean;

import java.util.List;

/**
 * panyi crate on 2020.08.14 16:57
 * desc 相关视频类
 */
public class RecommendDataBean {

    /**
     * dataType : VideoBeanForClient
     * id : 207942
     * title : 音乐盒创意制作：安康祈愿
     * description : 这部短片和音乐盒的创作本身承载着创作者的信念和祝福——向妈祖祈愿，祈祷世界和平，祈祷家人安康。
     * library : DEFAULT
     * tags : [{"id":744,"name":"每日创意灵感","actionUrl":"eyepetizer://tag/744/?title=%E6%AF%8F%E6%97%A5%E5%88%9B%E6%84%8F%E7%81%B5%E6%84%9F","adTrack":null,"desc":"技术与审美结合，探索视觉的无限可能","bgPicture":"http://img.kaiyanapp.com/bc2479c09cd15cb93b69d82e5f21c3fc.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/bc2479c09cd15cb93b69d82e5f21c3fc.png?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":2,"name":"创意","actionUrl":"eyepetizer://tag/2/?title=%E5%88%9B%E6%84%8F","adTrack":null,"desc":"技术与审美结合，探索视觉的无限可能","bgPicture":"http://img.kaiyanapp.com/1b457058cf2b317304ff9f70543c040d.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/fdefdb34cbe3d2ac9964d306febe9025.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}]
     * consumption : {"collectionCount":45,"shareCount":0,"replyCount":0,"realCollectionCount":19}
     * resourceType : video
     * slogan : null
     * provider : {"name":"Vimeo","alias":"vimeo","icon":"http://img.kaiyanapp.com/c3ad630be461cbb081649c9e21d6cbe3.png"}
     * category : 创意
     * author : {"id":2004,"icon":"http://img.kaiyanapp.com/df1b783bf74646c894e32faa9ed24ff9.png?imageMogr2/quality/60/format/jpg","name":"创意动画短片","description":"给你好看。","link":"","latestReleaseTime":1597334475000,"videoNum":372,"adTrack":null,"follow":{"itemType":"author","itemId":2004,"followed":false},"shield":{"itemType":"author","itemId":2004,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false}
     * cover : {"feed":"http://img.kaiyanapp.com/8ff6f560faaedd85fa0883078bde8cfa.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/8ff6f560faaedd85fa0883078bde8cfa.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/0f69f5d1c53741087a146a559d0dfcd3.png?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/8ff6f560faaedd85fa0883078bde8cfa.png?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"}
     * playUrl : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=207942&amp;resourceType=video&amp;editionType=default&amp;source=aliyun&amp;playUrlType=url_oss
     * thumbPlayUrl : null
     * duration : 60
     * webUrl : {"raw":"http://www.eyepetizer.net/detail.html?vid=207942","forWeibo":"http://www.eyepetizer.net/detail.html?vid=207942"}
     * releaseTime : 1597334475000
     * playInfo : []
     * campaign : null
     * waterMarks : null
     * ad : false
     * adTrack : []
     * type : NORMAL
     * titlePgc : null
     * descriptionPgc : null
     * remark :
     * ifLimitVideo : false
     * searchWeight : 0
     * brandWebsiteInfo : null
     * videoPosterBean : {"scale":null,"url":null,"fileSizeStr":null}
     * idx : 0
     * shareAdTrack : null
     * favoriteAdTrack : null
     * webAdTrack : null
     * date : 1597334475000
     * promotion : null
     * label : null
     * labelList : []
     * descriptionEditor : 这部短片和音乐盒的创作本身承载着创作者的信念和祝福——向妈祖祈愿，祈祷世界和平，祈祷家人安康。
     * collected : false
     * reallyCollected : false
     * played : false
     * subtitles : []
     * lastViewTime : null
     * playlists : null
     * src : null
     * recallSource : null
     */

    private String dataType;
    private Long id;
    private String title;
    private String description;
    private String library;
    private ConsumptionBean consumption;
    private String resourceType;
    private Object slogan;
    private ProviderBean provider;
    private String category;
    private AuthorBean author;
    private CoverBean cover;
    private String playUrl;
    private Object thumbPlayUrl;
    private Long duration;
    private WebUrlBean webUrl;
    private long releaseTime;
    private Object campaign;
    private Object waterMarks;
    private boolean ad;
    private String type;
    private Object titlePgc;
    private Object descriptionPgc;
    private String remark;
    private boolean ifLimitVideo;
    private int searchWeight;
    private Object brandWebsiteInfo;
    private VideoPosterBeanBean videoPosterBean;
    private int idx;
    private Object shareAdTrack;
    private Object favoriteAdTrack;
    private Object webAdTrack;
    private long date;
    private Object promotion;
    private Object label;
    private String descriptionEditor;
    private boolean collected;
    private boolean reallyCollected;
    private boolean played;
    private Object lastViewTime;
    private Object playlists;
    private Object src;
    private Object recallSource;
    private List<TagsBean> tags;
    private List<?> playInfo;
    private List<?> adTrack;
    private List<?> labelList;
    private List<?> subtitles;
    private String text;

    public String getText() {
        return text == null ? "" : text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLibrary() {
        return library;
    }

    public void setLibrary(String library) {
        this.library = library;
    }

    public ConsumptionBean getConsumption() {
        return consumption;
    }

    public void setConsumption(ConsumptionBean consumption) {
        this.consumption = consumption;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Object getSlogan() {
        return slogan;
    }

    public void setSlogan(Object slogan) {
        this.slogan = slogan;
    }

    public ProviderBean getProvider() {
        return provider;
    }

    public void setProvider(ProviderBean provider) {
        this.provider = provider;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public AuthorBean getAuthor() {
        return author;
    }

    public void setAuthor(AuthorBean author) {
        this.author = author;
    }

    public CoverBean getCover() {
        return cover;
    }

    public void setCover(CoverBean cover) {
        this.cover = cover;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public Object getThumbPlayUrl() {
        return thumbPlayUrl;
    }

    public void setThumbPlayUrl(Object thumbPlayUrl) {
        this.thumbPlayUrl = thumbPlayUrl;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public WebUrlBean getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(WebUrlBean webUrl) {
        this.webUrl = webUrl;
    }

    public long getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(long releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Object getCampaign() {
        return campaign;
    }

    public void setCampaign(Object campaign) {
        this.campaign = campaign;
    }

    public Object getWaterMarks() {
        return waterMarks;
    }

    public void setWaterMarks(Object waterMarks) {
        this.waterMarks = waterMarks;
    }

    public boolean isAd() {
        return ad;
    }

    public void setAd(boolean ad) {
        this.ad = ad;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getTitlePgc() {
        return titlePgc;
    }

    public void setTitlePgc(Object titlePgc) {
        this.titlePgc = titlePgc;
    }

    public Object getDescriptionPgc() {
        return descriptionPgc;
    }

    public void setDescriptionPgc(Object descriptionPgc) {
        this.descriptionPgc = descriptionPgc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public boolean isIfLimitVideo() {
        return ifLimitVideo;
    }

    public void setIfLimitVideo(boolean ifLimitVideo) {
        this.ifLimitVideo = ifLimitVideo;
    }

    public int getSearchWeight() {
        return searchWeight;
    }

    public void setSearchWeight(int searchWeight) {
        this.searchWeight = searchWeight;
    }

    public Object getBrandWebsiteInfo() {
        return brandWebsiteInfo;
    }

    public void setBrandWebsiteInfo(Object brandWebsiteInfo) {
        this.brandWebsiteInfo = brandWebsiteInfo;
    }

    public VideoPosterBeanBean getVideoPosterBean() {
        return videoPosterBean;
    }

    public void setVideoPosterBean(VideoPosterBeanBean videoPosterBean) {
        this.videoPosterBean = videoPosterBean;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public Object getShareAdTrack() {
        return shareAdTrack;
    }

    public void setShareAdTrack(Object shareAdTrack) {
        this.shareAdTrack = shareAdTrack;
    }

    public Object getFavoriteAdTrack() {
        return favoriteAdTrack;
    }

    public void setFavoriteAdTrack(Object favoriteAdTrack) {
        this.favoriteAdTrack = favoriteAdTrack;
    }

    public Object getWebAdTrack() {
        return webAdTrack;
    }

    public void setWebAdTrack(Object webAdTrack) {
        this.webAdTrack = webAdTrack;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public Object getPromotion() {
        return promotion;
    }

    public void setPromotion(Object promotion) {
        this.promotion = promotion;
    }

    public Object getLabel() {
        return label;
    }

    public void setLabel(Object label) {
        this.label = label;
    }

    public String getDescriptionEditor() {
        return descriptionEditor;
    }

    public void setDescriptionEditor(String descriptionEditor) {
        this.descriptionEditor = descriptionEditor;
    }

    public boolean isCollected() {
        return collected;
    }

    public void setCollected(boolean collected) {
        this.collected = collected;
    }

    public boolean isReallyCollected() {
        return reallyCollected;
    }

    public void setReallyCollected(boolean reallyCollected) {
        this.reallyCollected = reallyCollected;
    }

    public boolean isPlayed() {
        return played;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }

    public Object getLastViewTime() {
        return lastViewTime;
    }

    public void setLastViewTime(Object lastViewTime) {
        this.lastViewTime = lastViewTime;
    }

    public Object getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Object playlists) {
        this.playlists = playlists;
    }

    public Object getSrc() {
        return src;
    }

    public void setSrc(Object src) {
        this.src = src;
    }

    public Object getRecallSource() {
        return recallSource;
    }

    public void setRecallSource(Object recallSource) {
        this.recallSource = recallSource;
    }

    public List<TagsBean> getTags() {
        return tags;
    }

    public void setTags(List<TagsBean> tags) {
        this.tags = tags;
    }

    public List<?> getPlayInfo() {
        return playInfo;
    }

    public void setPlayInfo(List<?> playInfo) {
        this.playInfo = playInfo;
    }

    public List<?> getAdTrack() {
        return adTrack;
    }

    public void setAdTrack(List<?> adTrack) {
        this.adTrack = adTrack;
    }

    public List<?> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<?> labelList) {
        this.labelList = labelList;
    }

    public List<?> getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(List<?> subtitles) {
        this.subtitles = subtitles;
    }

    public static class ConsumptionBean {
        /**
         * collectionCount : 45
         * shareCount : 0
         * replyCount : 0
         * realCollectionCount : 19
         */

        private int collectionCount;
        private int shareCount;
        private int replyCount;
        private int realCollectionCount;

        public int getCollectionCount() {
            return collectionCount;
        }

        public void setCollectionCount(int collectionCount) {
            this.collectionCount = collectionCount;
        }

        public int getShareCount() {
            return shareCount;
        }

        public void setShareCount(int shareCount) {
            this.shareCount = shareCount;
        }

        public int getReplyCount() {
            return replyCount;
        }

        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }

        public int getRealCollectionCount() {
            return realCollectionCount;
        }

        public void setRealCollectionCount(int realCollectionCount) {
            this.realCollectionCount = realCollectionCount;
        }
    }

    public static class ProviderBean {
        /**
         * name : Vimeo
         * alias : vimeo
         * icon : http://img.kaiyanapp.com/c3ad630be461cbb081649c9e21d6cbe3.png
         */

        private String name;
        private String alias;
        private String icon;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public static class AuthorBean {
        /**
         * id : 2004
         * icon : http://img.kaiyanapp.com/df1b783bf74646c894e32faa9ed24ff9.png?imageMogr2/quality/60/format/jpg
         * name : 创意动画短片
         * description : 给你好看。
         * link :
         * latestReleaseTime : 1597334475000
         * videoNum : 372
         * adTrack : null
         * follow : {"itemType":"author","itemId":2004,"followed":false}
         * shield : {"itemType":"author","itemId":2004,"shielded":false}
         * approvedNotReadyVideoCount : 0
         * ifPgc : true
         * recSort : 0
         * expert : false
         */

        private int id;
        private String icon;
        private String name;
        private String description;
        private String link;
        private long latestReleaseTime;
        private int videoNum;
        private Object adTrack;
        private FollowBean follow;
        private ShieldBean shield;
        private int approvedNotReadyVideoCount;
        private boolean ifPgc;
        private int recSort;
        private boolean expert;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public long getLatestReleaseTime() {
            return latestReleaseTime;
        }

        public void setLatestReleaseTime(long latestReleaseTime) {
            this.latestReleaseTime = latestReleaseTime;
        }

        public int getVideoNum() {
            return videoNum;
        }

        public void setVideoNum(int videoNum) {
            this.videoNum = videoNum;
        }

        public Object getAdTrack() {
            return adTrack;
        }

        public void setAdTrack(Object adTrack) {
            this.adTrack = adTrack;
        }

        public FollowBean getFollow() {
            return follow;
        }

        public void setFollow(FollowBean follow) {
            this.follow = follow;
        }

        public ShieldBean getShield() {
            return shield;
        }

        public void setShield(ShieldBean shield) {
            this.shield = shield;
        }

        public int getApprovedNotReadyVideoCount() {
            return approvedNotReadyVideoCount;
        }

        public void setApprovedNotReadyVideoCount(int approvedNotReadyVideoCount) {
            this.approvedNotReadyVideoCount = approvedNotReadyVideoCount;
        }

        public boolean isIfPgc() {
            return ifPgc;
        }

        public void setIfPgc(boolean ifPgc) {
            this.ifPgc = ifPgc;
        }

        public int getRecSort() {
            return recSort;
        }

        public void setRecSort(int recSort) {
            this.recSort = recSort;
        }

        public boolean isExpert() {
            return expert;
        }

        public void setExpert(boolean expert) {
            this.expert = expert;
        }

        public static class FollowBean {
            /**
             * itemType : author
             * itemId : 2004
             * followed : false
             */

            private String itemType;
            private int itemId;
            private boolean followed;

            public String getItemType() {
                return itemType;
            }

            public void setItemType(String itemType) {
                this.itemType = itemType;
            }

            public int getItemId() {
                return itemId;
            }

            public void setItemId(int itemId) {
                this.itemId = itemId;
            }

            public boolean isFollowed() {
                return followed;
            }

            public void setFollowed(boolean followed) {
                this.followed = followed;
            }
        }

        public static class ShieldBean {
            /**
             * itemType : author
             * itemId : 2004
             * shielded : false
             */

            private String itemType;
            private int itemId;
            private boolean shielded;

            public String getItemType() {
                return itemType;
            }

            public void setItemType(String itemType) {
                this.itemType = itemType;
            }

            public int getItemId() {
                return itemId;
            }

            public void setItemId(int itemId) {
                this.itemId = itemId;
            }

            public boolean isShielded() {
                return shielded;
            }

            public void setShielded(boolean shielded) {
                this.shielded = shielded;
            }
        }
    }

    public static class CoverBean {
        /**
         * feed : http://img.kaiyanapp.com/8ff6f560faaedd85fa0883078bde8cfa.png?imageMogr2/quality/60/format/jpg
         * detail : http://img.kaiyanapp.com/8ff6f560faaedd85fa0883078bde8cfa.png?imageMogr2/quality/60/format/jpg
         * blurred : http://img.kaiyanapp.com/0f69f5d1c53741087a146a559d0dfcd3.png?imageMogr2/quality/60/format/jpg
         * sharing : null
         * homepage : http://img.kaiyanapp.com/8ff6f560faaedd85fa0883078bde8cfa.png?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim
         */

        private String feed;
        private String detail;
        private String blurred;
        private Object sharing;
        private String homepage;

        public String getFeed() {
            return feed;
        }

        public void setFeed(String feed) {
            this.feed = feed;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public String getBlurred() {
            return blurred;
        }

        public void setBlurred(String blurred) {
            this.blurred = blurred;
        }

        public Object getSharing() {
            return sharing;
        }

        public void setSharing(Object sharing) {
            this.sharing = sharing;
        }

        public String getHomepage() {
            return homepage;
        }

        public void setHomepage(String homepage) {
            this.homepage = homepage;
        }
    }

    public static class WebUrlBean {
        /**
         * raw : http://www.eyepetizer.net/detail.html?vid=207942
         * forWeibo : http://www.eyepetizer.net/detail.html?vid=207942
         */

        private String raw;
        private String forWeibo;

        public String getRaw() {
            return raw;
        }

        public void setRaw(String raw) {
            this.raw = raw;
        }

        public String getForWeibo() {
            return forWeibo;
        }

        public void setForWeibo(String forWeibo) {
            this.forWeibo = forWeibo;
        }
    }

    public static class VideoPosterBeanBean {
        /**
         * scale : null
         * url : null
         * fileSizeStr : null
         */

        private Object scale;
        private Object url;
        private Object fileSizeStr;

        public Object getScale() {
            return scale;
        }

        public void setScale(Object scale) {
            this.scale = scale;
        }

        public Object getUrl() {
            return url;
        }

        public void setUrl(Object url) {
            this.url = url;
        }

        public Object getFileSizeStr() {
            return fileSizeStr;
        }

        public void setFileSizeStr(Object fileSizeStr) {
            this.fileSizeStr = fileSizeStr;
        }
    }

    public static class TagsBean {
        /**
         * id : 744
         * name : 每日创意灵感
         * actionUrl : eyepetizer://tag/744/?title=%E6%AF%8F%E6%97%A5%E5%88%9B%E6%84%8F%E7%81%B5%E6%84%9F
         * adTrack : null
         * desc : 技术与审美结合，探索视觉的无限可能
         * bgPicture : http://img.kaiyanapp.com/bc2479c09cd15cb93b69d82e5f21c3fc.png?imageMogr2/quality/60/format/jpg
         * headerImage : http://img.kaiyanapp.com/bc2479c09cd15cb93b69d82e5f21c3fc.png?imageMogr2/quality/60/format/jpg
         * tagRecType : IMPORTANT
         * childTagList : null
         * childTagIdList : null
         * haveReward : false
         * ifNewest : false
         * newestEndTime : null
         * communityIndex : 0
         */

        private int id;
        private String name;
        private String actionUrl;
        private Object adTrack;
        private String desc;
        private String bgPicture;
        private String headerImage;
        private String tagRecType;
        private Object childTagList;
        private Object childTagIdList;
        private boolean haveReward;
        private boolean ifNewest;
        private Object newestEndTime;
        private int communityIndex;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getActionUrl() {
            return actionUrl;
        }

        public void setActionUrl(String actionUrl) {
            this.actionUrl = actionUrl;
        }

        public Object getAdTrack() {
            return adTrack;
        }

        public void setAdTrack(Object adTrack) {
            this.adTrack = adTrack;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getBgPicture() {
            return bgPicture;
        }

        public void setBgPicture(String bgPicture) {
            this.bgPicture = bgPicture;
        }

        public String getHeaderImage() {
            return headerImage;
        }

        public void setHeaderImage(String headerImage) {
            this.headerImage = headerImage;
        }

        public String getTagRecType() {
            return tagRecType;
        }

        public void setTagRecType(String tagRecType) {
            this.tagRecType = tagRecType;
        }

        public Object getChildTagList() {
            return childTagList;
        }

        public void setChildTagList(Object childTagList) {
            this.childTagList = childTagList;
        }

        public Object getChildTagIdList() {
            return childTagIdList;
        }

        public void setChildTagIdList(Object childTagIdList) {
            this.childTagIdList = childTagIdList;
        }

        public boolean isHaveReward() {
            return haveReward;
        }

        public void setHaveReward(boolean haveReward) {
            this.haveReward = haveReward;
        }

        public boolean isIfNewest() {
            return ifNewest;
        }

        public void setIfNewest(boolean ifNewest) {
            this.ifNewest = ifNewest;
        }

        public Object getNewestEndTime() {
            return newestEndTime;
        }

        public void setNewestEndTime(Object newestEndTime) {
            this.newestEndTime = newestEndTime;
        }

        public int getCommunityIndex() {
            return communityIndex;
        }

        public void setCommunityIndex(int communityIndex) {
            this.communityIndex = communityIndex;
        }
    }
}
