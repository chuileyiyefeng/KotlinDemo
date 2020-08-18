package org.weishe.kotlindemo.bean;

import java.util.List;

/**
 * panyi crate on 2020.08.17 17:04
 * desc
 */
public class FollowItemBean {

    /**
     * count : 4
     * total : 0
     * nextPageUrl : http://baobab.kaiyanapp.com/api/v4/tabs/follow?start=2&num=2&follow=false&startId=0
     * adExist : false
     * updateTime : null
     * refreshCount : 0
     * lastStartId : 0
     */

    private int count;
    private int total;
    private String nextPageUrl;
    private boolean adExist;
    private Object updateTime;
    private int refreshCount;
    private int lastStartId;
    private List<ItemListBeanX> itemList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNextPageUrl() {
        return nextPageUrl == null ? "" : nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public boolean isAdExist() {
        return adExist;
    }

    public void setAdExist(boolean adExist) {
        this.adExist = adExist;
    }

    public Object getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
    }

    public int getRefreshCount() {
        return refreshCount;
    }

    public void setRefreshCount(int refreshCount) {
        this.refreshCount = refreshCount;
    }

    public int getLastStartId() {
        return lastStartId;
    }

    public void setLastStartId(int lastStartId) {
        this.lastStartId = lastStartId;
    }

    public List<ItemListBeanX> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListBeanX> itemList) {
        this.itemList = itemList;
    }

    public static class ItemListBeanX {
        /**
         * type : videoCollectionWithBrief
         * tag : null
         * id : 0
         * adIndex : -1
         */

        private String type;
        private DataBeanX data;
        private Object tag;
        private int id;
        private int adIndex;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataBeanX getData() {
            return data;
        }

        public void setData(DataBeanX data) {
            this.data = data;
        }

        public Object getTag() {
            return tag;
        }

        public void setTag(Object tag) {
            this.tag = tag;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAdIndex() {
            return adIndex;
        }

        public void setAdIndex(int adIndex) {
            this.adIndex = adIndex;
        }

        public static class DataBeanX {
            /**
             * dataType : ItemCollection
             * header : {"id":5152,"icon":"http://img.kaiyanapp.com/fbb614d63e4b15d05dd1ed87b179ff42.png?imageMogr2/quality/60/format/jpg","iconType":"round","title":"帅soserious","subTitle":null,"description":"健身路上有我陪伴❤️\n微博:帅soserious\nYouTube/Ins:shuaisoserious","actionUrl":"eyepetizer://pgc/detail/5152/?title=%E5%B8%85soserious&userType=PGC&tabIndex=1","adTrack":null,"follow":{"itemType":"author","itemId":5152,"followed":false},"ifPgc":true,"uid":0,"ifShowNotificationIcon":false,"expert":false}
             * itemList : [{"type":"video","data":{"dataType":"VideoBeanForClient","id":208901,"title":"【拒绝节食!】6种健康餐让你越吃越瘦！","description":"今天这期视频给大家推荐6种不同的健康餐，不仅操作简单，而且更重要的是能帮助你达到增肌减脂目标哦！","library":"DEFAULT","tags":[{"id":4,"name":"运动健身","actionUrl":"eyepetizer://tag/4/?title=%E8%BF%90%E5%8A%A8%E5%81%A5%E8%BA%AB","adTrack":null,"desc":"冲浪、滑板、健身、跑酷，我过着停不下来的生活","bgPicture":"http://img.kaiyanapp.com/d9163ebc9c8ffcdccee2d7855b441d17.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/60ddce3880b4600474a329f772d10695.png?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":1022,"name":"运动","actionUrl":"eyepetizer://tag/1022/?title=%E8%BF%90%E5%8A%A8","adTrack":null,"desc":"冲浪、滑板、健身、跑酷，我过着停不下来的生活","bgPicture":"http://img.kaiyanapp.com/cb87116785473e4064687036b53b5af3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/481837cc0b1c52a3a87d6156d52cfdfa.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":718,"name":"美食教程","actionUrl":"eyepetizer://tag/718/?title=%E7%BE%8E%E9%A3%9F%E6%95%99%E7%A8%8B","adTrack":null,"desc":"","bgPicture":"http://img.kaiyanapp.com/403c8b2c0ffc94f8b80e4cb7779ac9bf.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/efd50bb0281c9ef9cf32ac84195f2136.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":717,"name":"美食发现","actionUrl":"eyepetizer://tag/717/?title=%E7%BE%8E%E9%A3%9F%E5%8F%91%E7%8E%B0","adTrack":null,"desc":"","bgPicture":"http://img.kaiyanapp.com/0721bf9375c81d6aa1c69862f4ed2256.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/3e5b0d86493c72b1c32d5a74894f573a.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":664,"name":"健身","actionUrl":"eyepetizer://tag/664/?title=%E5%81%A5%E8%BA%AB","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/9ae2257d8d569498c07c6b04b3257f66.gif","headerImage":"http://img.kaiyanapp.com/9ae2257d8d569498c07c6b04b3257f66.gif","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}],"consumption":{"collectionCount":0,"shareCount":0,"replyCount":0,"realCollectionCount":0},"resourceType":"video","slogan":null,"provider":{"name":"PGC","alias":"PGC","icon":""},"category":"运动","author":{"id":5152,"icon":"http://img.kaiyanapp.com/fbb614d63e4b15d05dd1ed87b179ff42.png?imageMogr2/quality/60/format/jpg","name":"帅soserious","description":"健身路上有我陪伴❤️\n微博:帅soserious\nYouTube/Ins:shuaisoserious","link":"","latestReleaseTime":1597646759000,"videoNum":17,"adTrack":null,"follow":{"itemType":"author","itemId":5152,"followed":false},"shield":{"itemType":"author","itemId":5152,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false},"cover":{"feed":"http://img.kaiyanapp.com/58860633e6bb14c02360d50460ac3fa1.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/58860633e6bb14c02360d50460ac3fa1.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/d13afe1a6be795e5887f831eb3d11713.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=208901&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss","thumbPlayUrl":null,"duration":560,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=208901","forWeibo":"http://www.eyepetizer.net/detail.html?vid=208901&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1597646759000,"playInfo":[],"campaign":null,"waterMarks":null,"ad":false,"adTrack":[],"type":"NORMAL","titlePgc":"【拒绝节食!】6种健康餐让你越吃越瘦！","descriptionPgc":"今天这期视频给大家推荐6种不同的健康餐，不仅操作简单，而且更重要的是能帮助你达到增肌减脂目标哦！","remark":"","ifLimitVideo":false,"searchWeight":0,"brandWebsiteInfo":null,"videoPosterBean":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1597646759000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"reallyCollected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null,"recallSource":null},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":206970,"title":"从\u201c瘦子\u201d到\u201c型男\u201d我都经历了什么?!","description":"怎么吃都不胖？你不是一个人！\n今天咱们就从训练，饮食，恢复以及心态这4个角度来分析一下，\n作为一个瘦子，要如何科学有效的增肌增重。","library":"DEFAULT","tags":[{"id":4,"name":"运动健身","actionUrl":"eyepetizer://tag/4/?title=%E8%BF%90%E5%8A%A8%E5%81%A5%E8%BA%AB","adTrack":null,"desc":"冲浪、滑板、健身、跑酷，我过着停不下来的生活","bgPicture":"http://img.kaiyanapp.com/d9163ebc9c8ffcdccee2d7855b441d17.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/60ddce3880b4600474a329f772d10695.png?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":1022,"name":"运动","actionUrl":"eyepetizer://tag/1022/?title=%E8%BF%90%E5%8A%A8","adTrack":null,"desc":"冲浪、滑板、健身、跑酷，我过着停不下来的生活","bgPicture":"http://img.kaiyanapp.com/cb87116785473e4064687036b53b5af3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/481837cc0b1c52a3a87d6156d52cfdfa.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":958,"name":"健身打卡","actionUrl":"eyepetizer://tag/958/?title=%E5%81%A5%E8%BA%AB%E6%89%93%E5%8D%A1","adTrack":null,"desc":"那些健身失败的段子，说的不是我！","bgPicture":"http://img.kaiyanapp.com/54e85339a9bba176eb376cb6b1167c46.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/54e85339a9bba176eb376cb6b1167c46.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":664,"name":"健身","actionUrl":"eyepetizer://tag/664/?title=%E5%81%A5%E8%BA%AB","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/9ae2257d8d569498c07c6b04b3257f66.gif","headerImage":"http://img.kaiyanapp.com/9ae2257d8d569498c07c6b04b3257f66.gif","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}],"consumption":{"collectionCount":544,"shareCount":198,"replyCount":4,"realCollectionCount":249},"resourceType":"video","slogan":null,"provider":{"name":"PGC","alias":"PGC","icon":""},"category":"运动","author":{"id":5152,"icon":"http://img.kaiyanapp.com/fbb614d63e4b15d05dd1ed87b179ff42.png?imageMogr2/quality/60/format/jpg","name":"帅soserious","description":"健身路上有我陪伴❤️\n微博:帅soserious\nYouTube/Ins:shuaisoserious","link":"","latestReleaseTime":1597646759000,"videoNum":17,"adTrack":null,"follow":{"itemType":"author","itemId":5152,"followed":false},"shield":{"itemType":"author","itemId":5152,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false},"cover":{"feed":"http://img.kaiyanapp.com/4caf0ae3f7cc344d4b17cb74e6ca33e4.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/4caf0ae3f7cc344d4b17cb74e6ca33e4.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/07b4df67728ecf55953415a6375d88cf.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=206970&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss","thumbPlayUrl":null,"duration":518,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=206970","forWeibo":"http://www.eyepetizer.net/detail.html?vid=206970&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1596893259000,"playInfo":[],"campaign":null,"waterMarks":null,"ad":false,"adTrack":[],"type":"NORMAL","titlePgc":"从\u201c瘦子\u201d到\u201c型男\u201d我都经历了什么?!","descriptionPgc":"怎么吃都不胖？你不是一个人！\n今天咱们就从训练，饮食，恢复以及心态这4个角度来分析一下，\n作为一个瘦子，要如何科学有效的增肌增重。","remark":"","ifLimitVideo":false,"searchWeight":0,"brandWebsiteInfo":null,"videoPosterBean":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1596893259000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"reallyCollected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null,"recallSource":null},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":206610,"title":"【在家拥有6块腹肌?】6分钟高效腹肌训练","description":"我相信很多小伙伴减脂的最终目的是为了能够拥有一副美观的腹肌\n然而错误的方法不仅不会帮助你达到这个目的\n还会让你走很多弯路\n所以今天我给大家介绍5个动作来帮你打造美观的腹肌\n不仅高效!而且不需要任何器械!在家里就能完成哦!","library":"DEFAULT","tags":[{"id":4,"name":"运动健身","actionUrl":"eyepetizer://tag/4/?title=%E8%BF%90%E5%8A%A8%E5%81%A5%E8%BA%AB","adTrack":null,"desc":"冲浪、滑板、健身、跑酷，我过着停不下来的生活","bgPicture":"http://img.kaiyanapp.com/d9163ebc9c8ffcdccee2d7855b441d17.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/60ddce3880b4600474a329f772d10695.png?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":1022,"name":"运动","actionUrl":"eyepetizer://tag/1022/?title=%E8%BF%90%E5%8A%A8","adTrack":null,"desc":"冲浪、滑板、健身、跑酷，我过着停不下来的生活","bgPicture":"http://img.kaiyanapp.com/cb87116785473e4064687036b53b5af3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/481837cc0b1c52a3a87d6156d52cfdfa.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":958,"name":"健身打卡","actionUrl":"eyepetizer://tag/958/?title=%E5%81%A5%E8%BA%AB%E6%89%93%E5%8D%A1","adTrack":null,"desc":"那些健身失败的段子，说的不是我！","bgPicture":"http://img.kaiyanapp.com/54e85339a9bba176eb376cb6b1167c46.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/54e85339a9bba176eb376cb6b1167c46.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":664,"name":"健身","actionUrl":"eyepetizer://tag/664/?title=%E5%81%A5%E8%BA%AB","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/9ae2257d8d569498c07c6b04b3257f66.gif","headerImage":"http://img.kaiyanapp.com/9ae2257d8d569498c07c6b04b3257f66.gif","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}],"consumption":{"collectionCount":778,"shareCount":161,"replyCount":1,"realCollectionCount":463},"resourceType":"video","slogan":null,"provider":{"name":"PGC","alias":"PGC","icon":""},"category":"运动","author":{"id":5152,"icon":"http://img.kaiyanapp.com/fbb614d63e4b15d05dd1ed87b179ff42.png?imageMogr2/quality/60/format/jpg","name":"帅soserious","description":"健身路上有我陪伴❤️\n微博:帅soserious\nYouTube/Ins:shuaisoserious","link":"","latestReleaseTime":1597646759000,"videoNum":17,"adTrack":null,"follow":{"itemType":"author","itemId":5152,"followed":false},"shield":{"itemType":"author","itemId":5152,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false},"cover":{"feed":"http://img.kaiyanapp.com/c81d0caf1b595b9912678060c14b8bfc.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/c81d0caf1b595b9912678060c14b8bfc.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/558d96893f0a32d5b4a06c0c24ce2564.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=206610&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss","thumbPlayUrl":null,"duration":500,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=206610","forWeibo":"http://www.eyepetizer.net/detail.html?vid=206610&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1596790834000,"playInfo":[],"campaign":null,"waterMarks":null,"ad":false,"adTrack":[],"type":"NORMAL","titlePgc":"【在家拥有6块腹肌?】6分钟高效腹肌训练","descriptionPgc":"我相信很多小伙伴减脂的最终目的是为了能够拥有一副美观的腹肌\n然而错误的方法不仅不会帮助你达到这个目的\n还会让你走很多弯路\n所以今天我给大家介绍5个动作来帮你打造美观的腹肌\n不仅高效!而且不需要任何器械!在家里就能完成哦!","remark":"","ifLimitVideo":false,"searchWeight":0,"brandWebsiteInfo":null,"videoPosterBean":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1596790834000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"reallyCollected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null,"recallSource":null},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":205952,"title":"1招帮你实现健身目标!(新手必看)","description":"这期我是一个工具人！如果大家遇到了瓶颈,或者不知道去健身房该练些什么\n可以点个\u201c收藏\u201d 。方便反复观看哦!","library":"DEFAULT","tags":[{"id":4,"name":"运动健身","actionUrl":"eyepetizer://tag/4/?title=%E8%BF%90%E5%8A%A8%E5%81%A5%E8%BA%AB","adTrack":null,"desc":"冲浪、滑板、健身、跑酷，我过着停不下来的生活","bgPicture":"http://img.kaiyanapp.com/d9163ebc9c8ffcdccee2d7855b441d17.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/60ddce3880b4600474a329f772d10695.png?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":1022,"name":"运动","actionUrl":"eyepetizer://tag/1022/?title=%E8%BF%90%E5%8A%A8","adTrack":null,"desc":"冲浪、滑板、健身、跑酷，我过着停不下来的生活","bgPicture":"http://img.kaiyanapp.com/cb87116785473e4064687036b53b5af3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/481837cc0b1c52a3a87d6156d52cfdfa.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":958,"name":"健身打卡","actionUrl":"eyepetizer://tag/958/?title=%E5%81%A5%E8%BA%AB%E6%89%93%E5%8D%A1","adTrack":null,"desc":"那些健身失败的段子，说的不是我！","bgPicture":"http://img.kaiyanapp.com/54e85339a9bba176eb376cb6b1167c46.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/54e85339a9bba176eb376cb6b1167c46.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":664,"name":"健身","actionUrl":"eyepetizer://tag/664/?title=%E5%81%A5%E8%BA%AB","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/9ae2257d8d569498c07c6b04b3257f66.gif","headerImage":"http://img.kaiyanapp.com/9ae2257d8d569498c07c6b04b3257f66.gif","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}],"consumption":{"collectionCount":717,"shareCount":169,"replyCount":6,"realCollectionCount":419},"resourceType":"video","slogan":null,"provider":{"name":"PGC","alias":"PGC","icon":""},"category":"运动","author":{"id":5152,"icon":"http://img.kaiyanapp.com/fbb614d63e4b15d05dd1ed87b179ff42.png?imageMogr2/quality/60/format/jpg","name":"帅soserious","description":"健身路上有我陪伴❤️\n微博:帅soserious\nYouTube/Ins:shuaisoserious","link":"","latestReleaseTime":1597646759000,"videoNum":17,"adTrack":null,"follow":{"itemType":"author","itemId":5152,"followed":false},"shield":{"itemType":"author","itemId":5152,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false},"cover":{"feed":"http://img.kaiyanapp.com/51fbaad5e5ef69820b1a91c5949f61af.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/51fbaad5e5ef69820b1a91c5949f61af.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/e0d32fac0578d29319f377d2eda2c2b3.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=205952&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss","thumbPlayUrl":null,"duration":644,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=205952","forWeibo":"http://www.eyepetizer.net/detail.html?vid=205952&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1596623147000,"playInfo":[],"campaign":null,"waterMarks":null,"ad":false,"adTrack":[],"type":"NORMAL","titlePgc":"1招帮你实现健身目标!(新手必看)","descriptionPgc":"这期我是一个工具人！如果大家遇到了瓶颈,或者不知道去健身房该练些什么\n可以点个\u201c收藏\u201d 。方便反复观看哦!","remark":"","ifLimitVideo":false,"searchWeight":0,"brandWebsiteInfo":null,"videoPosterBean":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1596623147000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"reallyCollected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null,"recallSource":null},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":205342,"title":"【克服懒惰】早晨做这4件事帮你快速起床!","description":"各位每天一遍,要来打卡哦!(不用和我一样凌晨4点...)","library":"DEFAULT","tags":[{"id":4,"name":"运动健身","actionUrl":"eyepetizer://tag/4/?title=%E8%BF%90%E5%8A%A8%E5%81%A5%E8%BA%AB","adTrack":null,"desc":"冲浪、滑板、健身、跑酷，我过着停不下来的生活","bgPicture":"http://img.kaiyanapp.com/d9163ebc9c8ffcdccee2d7855b441d17.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/60ddce3880b4600474a329f772d10695.png?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":1022,"name":"运动","actionUrl":"eyepetizer://tag/1022/?title=%E8%BF%90%E5%8A%A8","adTrack":null,"desc":"冲浪、滑板、健身、跑酷，我过着停不下来的生活","bgPicture":"http://img.kaiyanapp.com/cb87116785473e4064687036b53b5af3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/481837cc0b1c52a3a87d6156d52cfdfa.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":900,"name":"生活仪式感","actionUrl":"eyepetizer://tag/900/?title=%E7%94%9F%E6%B4%BB%E4%BB%AA%E5%BC%8F%E6%84%9F","adTrack":null,"desc":"生活仪式感就是：使某一天与其他日子不同，使某一时刻与其他时刻不同。","bgPicture":"http://img.kaiyanapp.com/1fbf4380cf8bea5f17e2886211a9dc84.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/1fbf4380cf8bea5f17e2886211a9dc84.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":729,"name":"生活方式","actionUrl":"eyepetizer://tag/729/?title=%E7%94%9F%E6%B4%BB%E6%96%B9%E5%BC%8F","adTrack":null,"desc":"在生活里找到理想的自己","bgPicture":"http://img.kaiyanapp.com/df0ad616931c3c08b6775b8be5f418fa.gif","headerImage":"http://img.kaiyanapp.com/df0ad616931c3c08b6775b8be5f418fa.gif","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":664,"name":"健身","actionUrl":"eyepetizer://tag/664/?title=%E5%81%A5%E8%BA%AB","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/9ae2257d8d569498c07c6b04b3257f66.gif","headerImage":"http://img.kaiyanapp.com/9ae2257d8d569498c07c6b04b3257f66.gif","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}],"consumption":{"collectionCount":1415,"shareCount":323,"replyCount":7,"realCollectionCount":947},"resourceType":"video","slogan":null,"provider":{"name":"PGC","alias":"PGC","icon":""},"category":"运动","author":{"id":5152,"icon":"http://img.kaiyanapp.com/fbb614d63e4b15d05dd1ed87b179ff42.png?imageMogr2/quality/60/format/jpg","name":"帅soserious","description":"健身路上有我陪伴❤️\n微博:帅soserious\nYouTube/Ins:shuaisoserious","link":"","latestReleaseTime":1597646759000,"videoNum":17,"adTrack":null,"follow":{"itemType":"author","itemId":5152,"followed":false},"shield":{"itemType":"author","itemId":5152,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false},"cover":{"feed":"http://img.kaiyanapp.com/e6c2085d308ae545d5869c52fd47f1ce.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/e6c2085d308ae545d5869c52fd47f1ce.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/49a7714d5e1938d78746ccfd12bd87ec.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=205342&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss","thumbPlayUrl":null,"duration":636,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=205342","forWeibo":"http://www.eyepetizer.net/detail.html?vid=205342&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1596455705000,"playInfo":[],"campaign":null,"waterMarks":null,"ad":false,"adTrack":[],"type":"NORMAL","titlePgc":"【克服懒惰】早晨做这4件事帮你快速起床!","descriptionPgc":"各位每天一遍,要来打卡哦!(不用和我一样凌晨4点...)","remark":"","ifLimitVideo":false,"searchWeight":0,"brandWebsiteInfo":null,"videoPosterBean":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1596455705000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"reallyCollected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null,"recallSource":null},"tag":null,"id":0,"adIndex":-1}]
             * count : 5
             * adTrack : null
             * footer : null
             */

            private String dataType;
            private HeaderBean header;
            private int count;
            private Object adTrack;
            private Object footer;
            private List<ItemListBean> itemList;

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }

            public HeaderBean getHeader() {
                return header;
            }

            public void setHeader(HeaderBean header) {
                this.header = header;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public Object getAdTrack() {
                return adTrack;
            }

            public void setAdTrack(Object adTrack) {
                this.adTrack = adTrack;
            }

            public Object getFooter() {
                return footer;
            }

            public void setFooter(Object footer) {
                this.footer = footer;
            }

            public List<ItemListBean> getItemList() {
                return itemList;
            }

            public void setItemList(List<ItemListBean> itemList) {
                this.itemList = itemList;
            }

            public static class HeaderBean {
                /**
                 * id : 5152
                 * icon : http://img.kaiyanapp.com/fbb614d63e4b15d05dd1ed87b179ff42.png?imageMogr2/quality/60/format/jpg
                 * iconType : round
                 * title : 帅soserious
                 * subTitle : null
                 * description : 健身路上有我陪伴❤️
                 * 微博:帅soserious
                 * YouTube/Ins:shuaisoserious
                 * actionUrl : eyepetizer://pgc/detail/5152/?title=%E5%B8%85soserious&userType=PGC&tabIndex=1
                 * adTrack : null
                 * follow : {"itemType":"author","itemId":5152,"followed":false}
                 * ifPgc : true
                 * uid : 0
                 * ifShowNotificationIcon : false
                 * expert : false
                 */

                private int id;
                private String icon;
                private String iconType;
                private String title;
                private Object subTitle;
                private String description;
                private String actionUrl;
                private Object adTrack;
                private FollowBean follow;
                private boolean ifPgc;
                private int uid;
                private boolean ifShowNotificationIcon;
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

                public String getIconType() {
                    return iconType;
                }

                public void setIconType(String iconType) {
                    this.iconType = iconType;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public Object getSubTitle() {
                    return subTitle;
                }

                public void setSubTitle(Object subTitle) {
                    this.subTitle = subTitle;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
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

                public FollowBean getFollow() {
                    return follow;
                }

                public void setFollow(FollowBean follow) {
                    this.follow = follow;
                }

                public boolean isIfPgc() {
                    return ifPgc;
                }

                public void setIfPgc(boolean ifPgc) {
                    this.ifPgc = ifPgc;
                }

                public int getUid() {
                    return uid;
                }

                public void setUid(int uid) {
                    this.uid = uid;
                }

                public boolean isIfShowNotificationIcon() {
                    return ifShowNotificationIcon;
                }

                public void setIfShowNotificationIcon(boolean ifShowNotificationIcon) {
                    this.ifShowNotificationIcon = ifShowNotificationIcon;
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
                     * itemId : 5152
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
            }

            public static class ItemListBean {
                /**
                 * type : video
                 * tag : null
                 * id : 0
                 * adIndex : -1
                 */

                private String type;
                private DataBean data;
                private Object tag;
                private int id;
                private int adIndex;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public DataBean getData() {
                    return data;
                }

                public void setData(DataBean data) {
                    this.data = data;
                }

                public Object getTag() {
                    return tag;
                }

                public void setTag(Object tag) {
                    this.tag = tag;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getAdIndex() {
                    return adIndex;
                }

                public void setAdIndex(int adIndex) {
                    this.adIndex = adIndex;
                }

                public static class DataBean {
                    /**
                     * dataType : VideoBeanForClient
                     * id : 208901
                     * title : 【拒绝节食!】6种健康餐让你越吃越瘦！
                     * description : 今天这期视频给大家推荐6种不同的健康餐，不仅操作简单，而且更重要的是能帮助你达到增肌减脂目标哦！
                     * library : DEFAULT
                     * tags : [{"id":4,"name":"运动健身","actionUrl":"eyepetizer://tag/4/?title=%E8%BF%90%E5%8A%A8%E5%81%A5%E8%BA%AB","adTrack":null,"desc":"冲浪、滑板、健身、跑酷，我过着停不下来的生活","bgPicture":"http://img.kaiyanapp.com/d9163ebc9c8ffcdccee2d7855b441d17.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/60ddce3880b4600474a329f772d10695.png?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":1022,"name":"运动","actionUrl":"eyepetizer://tag/1022/?title=%E8%BF%90%E5%8A%A8","adTrack":null,"desc":"冲浪、滑板、健身、跑酷，我过着停不下来的生活","bgPicture":"http://img.kaiyanapp.com/cb87116785473e4064687036b53b5af3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/481837cc0b1c52a3a87d6156d52cfdfa.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":718,"name":"美食教程","actionUrl":"eyepetizer://tag/718/?title=%E7%BE%8E%E9%A3%9F%E6%95%99%E7%A8%8B","adTrack":null,"desc":"","bgPicture":"http://img.kaiyanapp.com/403c8b2c0ffc94f8b80e4cb7779ac9bf.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/efd50bb0281c9ef9cf32ac84195f2136.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":717,"name":"美食发现","actionUrl":"eyepetizer://tag/717/?title=%E7%BE%8E%E9%A3%9F%E5%8F%91%E7%8E%B0","adTrack":null,"desc":"","bgPicture":"http://img.kaiyanapp.com/0721bf9375c81d6aa1c69862f4ed2256.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/3e5b0d86493c72b1c32d5a74894f573a.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":664,"name":"健身","actionUrl":"eyepetizer://tag/664/?title=%E5%81%A5%E8%BA%AB","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/9ae2257d8d569498c07c6b04b3257f66.gif","headerImage":"http://img.kaiyanapp.com/9ae2257d8d569498c07c6b04b3257f66.gif","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}]
                     * consumption : {"collectionCount":0,"shareCount":0,"replyCount":0,"realCollectionCount":0}
                     * resourceType : video
                     * slogan : null
                     * provider : {"name":"PGC","alias":"PGC","icon":""}
                     * category : 运动
                     * author : {"id":5152,"icon":"http://img.kaiyanapp.com/fbb614d63e4b15d05dd1ed87b179ff42.png?imageMogr2/quality/60/format/jpg","name":"帅soserious","description":"健身路上有我陪伴❤️\n微博:帅soserious\nYouTube/Ins:shuaisoserious","link":"","latestReleaseTime":1597646759000,"videoNum":17,"adTrack":null,"follow":{"itemType":"author","itemId":5152,"followed":false},"shield":{"itemType":"author","itemId":5152,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false}
                     * cover : {"feed":"http://img.kaiyanapp.com/58860633e6bb14c02360d50460ac3fa1.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/58860633e6bb14c02360d50460ac3fa1.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/d13afe1a6be795e5887f831eb3d11713.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null}
                     * playUrl : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=208901&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss
                     * thumbPlayUrl : null
                     * duration : 560
                     * webUrl : {"raw":"http://www.eyepetizer.net/detail.html?vid=208901","forWeibo":"http://www.eyepetizer.net/detail.html?vid=208901&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"}
                     * releaseTime : 1597646759000
                     * playInfo : []
                     * campaign : null
                     * waterMarks : null
                     * ad : false
                     * adTrack : []
                     * type : NORMAL
                     * titlePgc : 【拒绝节食!】6种健康餐让你越吃越瘦！
                     * descriptionPgc : 今天这期视频给大家推荐6种不同的健康餐，不仅操作简单，而且更重要的是能帮助你达到增肌减脂目标哦！
                     * remark :
                     * ifLimitVideo : false
                     * searchWeight : 0
                     * brandWebsiteInfo : null
                     * videoPosterBean : null
                     * idx : 0
                     * shareAdTrack : null
                     * favoriteAdTrack : null
                     * webAdTrack : null
                     * date : 1597646759000
                     * promotion : null
                     * label : null
                     * labelList : []
                     * descriptionEditor :
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
                    private int id;
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
                    private String titlePgc;
                    private String descriptionPgc;
                    private String remark;
                    private boolean ifLimitVideo;
                    private int searchWeight;
                    private Object brandWebsiteInfo;
                    private Object videoPosterBean;
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

                    public String getDataType() {
                        return dataType;
                    }

                    public void setDataType(String dataType) {
                        this.dataType = dataType;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
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

                    public String getTitlePgc() {
                        return titlePgc;
                    }

                    public void setTitlePgc(String titlePgc) {
                        this.titlePgc = titlePgc;
                    }

                    public String getDescriptionPgc() {
                        return descriptionPgc;
                    }

                    public void setDescriptionPgc(String descriptionPgc) {
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

                    public Object getVideoPosterBean() {
                        return videoPosterBean;
                    }

                    public void setVideoPosterBean(Object videoPosterBean) {
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
                         * collectionCount : 0
                         * shareCount : 0
                         * replyCount : 0
                         * realCollectionCount : 0
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
                         * name : PGC
                         * alias : PGC
                         * icon :
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
                         * id : 5152
                         * icon : http://img.kaiyanapp.com/fbb614d63e4b15d05dd1ed87b179ff42.png?imageMogr2/quality/60/format/jpg
                         * name : 帅soserious
                         * description : 健身路上有我陪伴❤️
                         * 微博:帅soserious
                         * YouTube/Ins:shuaisoserious
                         * link :
                         * latestReleaseTime : 1597646759000
                         * videoNum : 17
                         * adTrack : null
                         * follow : {"itemType":"author","itemId":5152,"followed":false}
                         * shield : {"itemType":"author","itemId":5152,"shielded":false}
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
                        private FollowBeanX follow;
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

                        public FollowBeanX getFollow() {
                            return follow;
                        }

                        public void setFollow(FollowBeanX follow) {
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

                        public static class FollowBeanX {
                            /**
                             * itemType : author
                             * itemId : 5152
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
                             * itemId : 5152
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
                         * feed : http://img.kaiyanapp.com/58860633e6bb14c02360d50460ac3fa1.png?imageMogr2/quality/60/format/jpg
                         * detail : http://img.kaiyanapp.com/58860633e6bb14c02360d50460ac3fa1.png?imageMogr2/quality/60/format/jpg
                         * blurred : http://img.kaiyanapp.com/d13afe1a6be795e5887f831eb3d11713.jpeg?imageMogr2/quality/60/format/jpg
                         * sharing : null
                         * homepage : null
                         */

                        private String feed;
                        private String detail;
                        private String blurred;
                        private Object sharing;
                        private Object homepage;

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

                        public Object getHomepage() {
                            return homepage;
                        }

                        public void setHomepage(Object homepage) {
                            this.homepage = homepage;
                        }
                    }

                    public static class WebUrlBean {
                        /**
                         * raw : http://www.eyepetizer.net/detail.html?vid=208901
                         * forWeibo : http://www.eyepetizer.net/detail.html?vid=208901&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0
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

                    public static class TagsBean {
                        /**
                         * id : 4
                         * name : 运动健身
                         * actionUrl : eyepetizer://tag/4/?title=%E8%BF%90%E5%8A%A8%E5%81%A5%E8%BA%AB
                         * adTrack : null
                         * desc : 冲浪、滑板、健身、跑酷，我过着停不下来的生活
                         * bgPicture : http://img.kaiyanapp.com/d9163ebc9c8ffcdccee2d7855b441d17.png?imageMogr2/quality/60/format/jpg
                         * headerImage : http://img.kaiyanapp.com/60ddce3880b4600474a329f772d10695.png?imageMogr2/quality/60/format/jpg
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
            }
        }
    }
}
