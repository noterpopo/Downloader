package com.example.popo.downloaddemo;

/**
 * Created by popo on 2018/3/8.
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
