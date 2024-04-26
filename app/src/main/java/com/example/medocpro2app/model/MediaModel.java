package com.example.medocpro2app.model;

import java.io.File;

public class MediaModel {
    private String fileName;
    private File file;
    private int position;
    private byte[] bytesFile;
    private String mediaType;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public byte[] getBytesFile() {
        return bytesFile;
    }

    public void setBytesFile(byte[] bytesFile) {
        this.bytesFile = bytesFile;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @Override
    public String toString() {
        return "MediaModel{" +
                "fileName='" + fileName + '\'' +
                ", file=" + file +
                ", position=" + position +
                ", bytesFile=" + bytesFile.length +
                ", mediaType='" + mediaType + '\'' +
                '}';
    }

}
