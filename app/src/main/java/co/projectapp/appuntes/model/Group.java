package co.projectapp.appuntes.model;

/**
 * Created by User on 3/7/2015.
 */
public class Group {
    int cursoImagenRes;
    String cursoTitulo;
    String cursoDesc;

    public Group(int cursoImagenRes, String cursoTitulo, String cursoDesc) {
        this.cursoImagenRes = cursoImagenRes;
        this.cursoTitulo = cursoTitulo;
        this.cursoDesc = cursoDesc;
    }

    public int getCursoImagenRes() {
        return cursoImagenRes;
    }

    public void setCursoImagenRes(int cursoImagenRes) {
        this.cursoImagenRes = cursoImagenRes;
    }

    public String getCursoTitulo() {
        return cursoTitulo;
    }

    public void setCursoTitulo(String cursoTitulo) {
        this.cursoTitulo = cursoTitulo;
    }

    public String getCursoDesc() {
        return cursoDesc;
    }

    public void setCursoDesc(String cursoDesc) {
        this.cursoDesc = cursoDesc;
    }
}
