package xluki17.library.io.file;

import xluki17.library.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}
