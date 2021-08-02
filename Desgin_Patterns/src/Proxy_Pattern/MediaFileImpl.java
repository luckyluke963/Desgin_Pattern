package Proxy_Pattern;

public class MediaFileImpl implements MediaFile {
    private String fileName;
 
    public MediaFileImpl(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
 
    @Override
    public void printName() {
        System.out.println("Tạm Ngưng " + fileName);
    }
 
    private void loadFromDisk(String fileName){
        System.out.println("Đang tải " + fileName);
    }
}