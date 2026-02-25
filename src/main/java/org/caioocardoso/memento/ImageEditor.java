package org.caioocardoso.memento;

import java.util.Date;

public class ImageEditor {
    private String filePath;
    private String fileFormat;

    public ImageEditor(String filePath, String fileFormat) {
        this.filePath = filePath;
        this.fileFormat = fileFormat;
    }

    public void convertImageTo(String format){
        this.fileFormat = format;
        this.filePath = this.filePath.substring(0, this.filePath.lastIndexOf('.'));
        this.filePath += '.' + format;
    }

    public Memento save(){
        Date date = new Date();

        return new ConcreteMemento(date.toString(), date, this.filePath, this.fileFormat);
    }

    public void restore (Memento memento){
        ConcreteMemento concreteMemento = (ConcreteMemento)memento;
        this.fileFormat = concreteMemento.getFileFormat();
        this.filePath = concreteMemento.getFilePath();
    }

    @Override
    public String toString() {
        return this.filePath + " " + this.fileFormat;
    }
}
