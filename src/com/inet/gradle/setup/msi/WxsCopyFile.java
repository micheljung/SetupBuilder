package com.inet.gradle.setup.msi;

/**
 * See <a href="https://wixtoolset.org/documentation/manual/v3/xsd/wix/copyfile.html">CopyFile Element</a>. Currently,
 * only copying a file specified by {@code sourceFileProperty} is supported.
 */
public class WxsCopyFile {
    private String sourceFileProperty;
    private String targetFile;

    public String getSourceFileProperty() {
        return sourceFileProperty;
    }

    public void setSourceFileProperty( String sourceFileProperty ) {
        this.sourceFileProperty = sourceFileProperty;
    }

    public String getTargetFile() {
        return targetFile;
    }

    public void setTargetFile( String targetFile ) {
        this.targetFile = targetFile;
    }
}
