package UserInterface;

import java.io.File;
import javax.swing.*;
import javax.swing.JFrame;

public class LoadFrame extends JFrame{
    
    private String path;
    
    //метод для получения пути к файлам
    LoadFrame()
    {
        try{
            setBounds(0,0,500,500);
            JFileChooser dialog = new JFileChooser();
            dialog.setFileSelectionMode(JFileChooser.FILES_ONLY);
            dialog.setApproveButtonText("Выбрать");//выбрать название для кнопки согласия
            dialog.setDialogTitle("Выберите пациента для загрузки");// выбрать название
            dialog.setDialogType(JFileChooser.OPEN_DIALOG);// выбрать тип диалога Open или Save
            dialog.showOpenDialog(this);
            File file = dialog.getSelectedFile();
            path=file.getPath();
            }
        catch (NullPointerException ignore){}
    }
        
    //метод для перезаписи строки
    private void rewrite()
    {
        System.out.println("Start path");
        System.out.println(path);
        if(!path.isEmpty()){
            String RPath = new String("");
            for(int i = 0; i < path.length(); i++){
                if( path.charAt(i)!= '/' ){
                    RPath += path.charAt(i);
                }
                else{
                    RPath += path.charAt(i);
                    RPath += "/";
                }
            }
            path = RPath;
            System.out.println("After rewrite");
            System.out.println(path);
        }
        else
            System.out.println("Path is empty!");
        
    }
    
    //проверка разрешения файла
    private boolean checkExtension()
    {
        if(!path.isEmpty())
        {
            String extension = new String(path.substring(path.length()-4, path.length()));            
            if(".dcm".equals(extension))
            {
                System.out.println("extension .dcm");
                return true;
            }
        }
        return false;
    }
    
    //обрезает ненужную часть от пути
    private void cut ()
    {
        if(!path.isEmpty()){
            int counter = path.length()-1;
            boolean found = false;
            while(!found){
                if(path.charAt(counter)!= '/'){
                    counter--;
                }
                else{
                    if(path.charAt(counter-1)=='/'){
                        found = true;
                        path = path.substring(0, counter-1);
                    }
                }
            }
            System.out.println("New Path");
            System.out.println(path);
        }
        else
            System.out.println("Path is empty!");
    }
    
    //геттер для пути
    public String GetPath(){
        rewrite();
        if (checkExtension() == true){
            cut();
            return path;
        }
        else{
            LoadFrame load = new LoadFrame();            
            return null;
        }
    }
}