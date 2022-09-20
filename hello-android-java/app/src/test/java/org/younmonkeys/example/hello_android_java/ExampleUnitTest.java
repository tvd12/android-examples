package org.younmonkeys.example.hello_android_java;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import static org.junit.Assert.*;

import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void jsonTest() throws Exception {
        String text = "{\n" +
                "   \"$\":{\n" +
                "      \"generated\":\"2021-08-30 15:50:21\",\n" +
                "      \"fitlerFrom\":\"2021-08-30 15:00:00\",\n" +
                "      \"fitlerTo\":\"2021-09-01 15:00:00\"\n" +
                "   },\n" +
                "   \"file\":[\n" +
                "      {\n" +
                "         \"$\":{\n" +
                "            \"type\":\"media\",\n" +
                "            \"id\":\"23\",\n" +
                "            \"size\":\"4832\",\n" +
                "            \"md5\":\"d59f5fc84ef7747f27baddc07fe81487\",\n" +
                "            \"path\":\"http://localhost/xmds.php?file=69ff812a81d936a1bf2ded27c286330e&displayId=3&type=M&itemId=23\",\n" +
                "            \"saveAs\":\"xibo-webpage-render.js\",\n" +
                "            \"download\":\"http\"\n" +
                "         }\n" +
                "      },\n" +
                "      {\n" +
                "         \"$\":{\n" +
                "            \"type\":\"media\",\n" +
                "            \"id\":\"6\",\n" +
                "            \"size\":\"160251\",\n" +
                "            \"md5\":\"67bb26c11dba6c366834e65f5933aff2\",\n" +
                "            \"path\":\"http://localhost/xmds.php?file=69ff812a81d936a1bf2ded27c286330e&displayId=3&type=M&itemId=6\",\n" +
                "            \"saveAs\":\"moment.js\",\n" +
                "            \"download\":\"http\"\n" +
                "         }\n" +
                "      },\n" +
                "      {\n" +
                "         \"$\":{\n" +
                "            \"type\":\"blacklist\"\n" +
                "         }\n" +
                "      }\n" +
                "   ]\n" +
                "}";
        Gson gson = new Gson();
        FileWrapper wrapper = gson.fromJson(text, FileWrapper.class);
        System.out.println(wrapper);
    }

    public static class MetaData {
        @SerializedName("generated")
        @Expose
        private String generated;
        @SerializedName("fitlerFrom")
        @Expose
        private String fitlerFrom;
        @SerializedName("fitlerTo")
        @Expose
        private String fitlerTo;

        public String getGenerated() {
            return generated;
        }

        public void setGenerated(String generated) {
            this.generated = generated;
        }

        public String getFitlerFrom() {
            return fitlerFrom;
        }

        public void setFitlerFrom(String fitlerFrom) {
            this.fitlerFrom = fitlerFrom;
        }

        public String getFitlerTo() {
            return fitlerTo;
        }

        public void setFitlerTo(String fitlerTo) {
            this.fitlerTo = fitlerTo;
        }

        @Override
        public String toString() {
            return "MetaData{" +
                    "generated='" + generated + '\'' +
                    ", fitlerFrom='" + fitlerFrom + '\'' +
                    ", fitlerTo='" + fitlerTo + '\'' +
                    '}';
        }
    }
    public static class FileItem {
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("md5")
        @Expose
        private String md5;
        @SerializedName("path")
        @Expose
        private String path;
        @SerializedName("saveAs")
        @Expose
        private String saveAs;
        @SerializedName("download")
        @Expose
        private String download;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getMd5() {
            return md5;
        }

        public void setMd5(String md5) {
            this.md5 = md5;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getSaveAs() {
            return saveAs;
        }

        public void setSaveAs(String saveAs) {
            this.saveAs = saveAs;
        }

        public String getDownload() {
            return download;
        }

        public void setDownload(String download) {
            this.download = download;
        }

        @Override
        public String toString() {
            return "FileItem{" +
                    "type='" + type + '\'' +
                    ", id='" + id + '\'' +
                    ", size='" + size + '\'' +
                    ", md5='" + md5 + '\'' +
                    ", path='" + path + '\'' +
                    ", saveAs='" + saveAs + '\'' +
                    ", download='" + download + '\'' +
                    '}';
        }
    }
    public static class FileWrapper {

        @SerializedName("$")
        @Expose
        private MetaData metaData;
        @SerializedName("file")
        @Expose
        private List<File> files = null;

        public MetaData getMetaData() {
            return metaData;
        }

        public void setMetaData(MetaData metaData) {
            this.metaData = metaData;
        }

        public List<File> getFiles() {
            return files;
        }

        public void setFiles(List<File> files) {
            this.files = files;
        }

        @Override
        public String toString() {
            return "FileWrapper{" +
                    "metaData=" + metaData +
                    ", files=" + files +
                    '}';
        }
    }

    public static class File {

        @SerializedName("$")
        @Expose
        private FileItem item;

        public void setItem(FileItem item) {
            this.item = item;
        }

        public FileItem getItem() {
            return item;
        }

        @Override
        public String toString() {
            return "File{" +
                    "item=" + item +
                    '}';
        }
    }
}