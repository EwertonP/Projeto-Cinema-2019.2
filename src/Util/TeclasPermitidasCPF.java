package Util;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TeclasPermitidasCPF extends PlainDocument {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void campocpf(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException {
        super.insertString(offset, str.replaceAll("[^0-9]", ""), attr);
    }

    public void replace(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException {
        super.insertString(offset, str.replaceAll("[^0-9]", ""), attr);
    }




}