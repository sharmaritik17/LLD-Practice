package proxyPattern.service.proxy;

import proxyPattern.domain.Video;
import proxyPattern.service.YouTubeLibrary;
import proxyPattern.service.library.ThirdPartyYouTubeClass;

import java.util.HashMap;

public class YouTubeCacheProxy implements YouTubeLibrary {
    private final ThirdPartyYouTubeClass thirdPartyYouTubeClass;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private final HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YouTubeCacheProxy() {
        this.thirdPartyYouTubeClass = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if(cachePopular.isEmpty()) {
            cachePopular = thirdPartyYouTubeClass.popularVideos();
        } else {
            System.out.println("Retrieved list from cache");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = thirdPartyYouTubeClass.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
