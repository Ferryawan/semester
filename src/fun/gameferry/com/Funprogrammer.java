package fun.gameferry.com;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Funprogrammer extends WindowAdapter implements ActionListener,TextListener {
    Frame f;
    MenuBar mb;
    Menu m1,m2;
    MenuItem nw,opn,sv,sva,ext,fd,fdr;
    TextArea ta;
    Button b1,b2,b3;
    Label l1;
    int flag=1,count=1;
    String fname,fdir,fpn;
    FileDialog fdialog;
    boolean o=false,r=false;
    int cursor,ss,t=0;
    public Funprogrammer()
    {
        f=new Frame();
        f.addWindowListener(this);
        f.setSize(500,500);
        f.setVisible(true);
        mb=new MenuBar();
        m1=new Menu("File");
        m2=new Menu("Edit");

        nw=new MenuItem("New");
        opn=new MenuItem("Open");
        sv=new MenuItem("Save");
        sva=new MenuItem("Save As");
        ext=new MenuItem("Exit");
        fd=new MenuItem("Find");
        fdr=new MenuItem("Find And Replace");

        nw.addActionListener(this);
        opn.addActionListener(this);
        sv.addActionListener(this);
        sva.addActionListener(this);
        ext.addActionListener(this);
        fd.addActionListener(this);
        fdr.addActionListener(this);

        ta=new TextArea();
        ta.addTextListener(this);

        m1.add(nw); m1.add(opn);  m1.add(sv); m1.add(sva);  m1.addSeparator();  m1.add(ext);
        m2.add(fd); m2.add(fdr);
        mb.add(m1); mb.add(m2);

        f.add(ta);
        f.setMenuBar(mb);

    }

    public void actionPerformed(ActionEvent e1)
    {
        String str;
        str=e1.getActionCommand();

        switch(str)
        {
            case "New": if(flag==1)
            {
                newfile();

            }
            else
            {
                Dialog d=new Dialog(f,"Want to save?",true);
                d.setSize(200,200);
                d.setLayout(new GridLayout(2,1));

                b1=new Button("Save");
                b2=new Button("Don't Save");
                b3=new Button("Cancel");

                Panel p1,p2;
                p1=new Panel();
                l1=new Label("Do You Want To Save File?");
                p1.add(l1);

                p2=new Panel();
                p2.setLayout(new GridLayout(1,3));
                p2.add(b1); p2.add(b2); p2.add(b3);

                d.add(p1);
                d.add(p2);

                d.setLocationRelativeTo(f);


                b1.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e2)
                    {
                        System.out.println("b1"+flag);
                        if(o==false)
                            saveas();
                        else
                            save();
                        if(o==true)
                        {
                            newfile();
                        }
                        d.setVisible(false);
                        d.dispose();
                        System.out.println("b1"+flag);

                    }
                });
                b2.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e3)
                    {
                        System.out.println("b2"+flag);
                        newfile();
                        d.setVisible(false);
                        d.dispose();
                        System.out.println("b2"+flag);
                    }
                });
                b3.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e4)
                    {
                        d.setVisible(false);
                        d.dispose();
                    }
                });
                d.setVisible(true);
            }

                break;
            case "Open":

                if(flag==1)
                {

                    openfile();
                }
                else
                {
                    Dialog d=new Dialog(f,"Want to save?",true);
                    d.setSize(200,200);
                    d.setLayout(new GridLayout(2,1));

                    b1=new Button("Save");
                    b2=new Button("Don't Save");
                    b3=new Button("Cancel");

                    Panel p1,p2;
                    p1=new Panel();
                    l1=new Label("Do You Want To Save File?");
                    p1.add(l1);

                    p2=new Panel();
                    p2.setLayout(new GridLayout(1,3));
                    p2.add(b1); p2.add(b2); p2.add(b3);

                    d.add(p1);
                    d.add(p2);

                    d.setLocationRelativeTo(f);


                    b1.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e2)
                        {
                            if(o==false)
                                saveas();
                            else
                                save();
                            openfile();
                            d.setVisible(false);
                            d.dispose();
                        }
                    });
                    b2.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e3)
                        {
                            System.out.println("b2"+flag);
                            openfile();
                            d.setVisible(false);
                            d.dispose();
                            System.out.println("b2"+flag);
                        }
                    });
                    b3.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e4)
                        {
                            d.setVisible(false);
                            d.dispose();
                        }
                    });
                    d.setVisible(true);
                }

                break;
            case "Save": if(o==false)
            {
                saveas();
            }
            else
            {
                save();
            }
                break;
            case "Save As":  saveas();
                break;

            case "Exit":
                if(flag==1)
                {
                    f.setVisible(false);
                    f.dispose();
                    System.exit(0);
                }
                else
                {
                    Dialog de = new Dialog(f,"Want to save?",true);
                    de.setSize(200,200);
                    de.setLayout(new GridLayout(2,1));
                    de.setLocationRelativeTo(f);
                    Label l1= new Label("Do you want to save your file?");
                    Button b1= new Button("Save");
                    Button b2 = new Button("Dont Save");
                    Button b3 = new Button("Cancel");
                    Panel p = new Panel();
                    p.add(b1);
                    p.add(b2);
                    p.add(b3);
                    de.add(l1);
                    de.add(p);
                    b1.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            if(o==true)
                            {
                                save();
                            }
                            else
                            {
                                saveas();
                            }
                            System.exit(0);
                        }
                    });
                    b2.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            System.exit(0);
                        }
                    });

                    b3.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            de.setVisible(false);
                            de.dispose();
                        }
                    });
                    de.setVisible(true);
                }
                break;
            case "Find": find();
                break;
            case "Find And Replace":
                findreplace();
                break;
        }
    }
    public void windowClosing(WindowEvent e)
    {
        if(flag==1)
        {
            Window w=e.getWindow();
            w.setVisible(false);
            w.dispose();
        }
        else
        {
            Dialog de = new Dialog(f,"Want to save?",true);
            de.setSize(200,200);
            de.setLayout(new GridLayout(2,1));
            de.setLocationRelativeTo(f);
            Label l1= new Label("Do you want to save your file?");
            Button b1= new Button("Save");
            Button b2 = new Button("Dont Save");
            Button b3 = new Button("Cancel");
            Panel p = new Panel();
            p.add(b1);
            p.add(b2);
            p.add(b3);
            de.add(l1);
            de.add(p);
            b1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if(o==true)
                    {
                        save();
                    }
                    else
                    {
                        saveas();
                    }
                    System.exit(0);
                }
            });
            b2.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    System.exit(0);
                }
            });

            b3.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    de.setVisible(false);
                    de.dispose();
                }
            });
            de.setVisible(true);
        }
    }
    public void findreplace()
    {
        Dialog drf=new Dialog(f,"Find And Replace");
        drf.setSize(300,200);
        drf.setLayout(new GridLayout(5,1));

        Label l1,l2;
        l1=new Label("Enter Word For Find");
        l2=new Label("Replace With");

        TextField tf1,tf2;
        tf1=new TextField(100);
        tf2=new TextField(100);

        Panel p=new Panel();
        p.setLayout(new GridLayout(1,4));
        Button b1,b2,b3,b4;
        b1=new Button("Find Next");
        b2=new Button("Replace");
        b3=new Button("Replace All");
        b4=new Button("Close");
        p.add(b1);p.add(b2);p.add(b3);p.add(b4);

        drf.add(l1);  drf.add(tf1);
        drf.add(l2);  drf.add(tf2);
        drf.add(p);

        drf.setLocationRelativeTo(f);

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                r=false;
                findone(tf1.getText());
            }
        });
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                replaceone(tf1.getText(),tf2.getText());
            }
        });
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                replaceall(tf1.getText(),tf2.getText());
            }
        });
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                drf.setVisible(false);
                drf.dispose();
                cursor=ta.getCaretPosition();
                ss=0;
            }
        });

        drf.setVisible(true);
    }
    public void replaceall(String fi,String re)
    {
        String str;
        str=ta.getText();

        Pattern p=Pattern.compile(fi);
        Matcher m=p.matcher(str);
        String temp=ta.getText();

        if(m.find())
            temp=m.replaceAll(re);
        ta.setText(temp);
    }
    public void replaceone(String fi,String re)
    {
        System.out.print("replace"+cursor);
        String str;
        str=ta.getText();



        Pattern p=Pattern.compile(fi);
        Matcher m=p.matcher(str);

        if(fi.equals(ta.getSelectedText()))
        {
            int i=ta.getSelectionStart();
            StringBuffer sb=new StringBuffer();
            m.find(i);
            m.appendReplacement(sb,re);
            m.appendTail(sb);
            ta.setText(sb.toString());
            r=true;


        }
        t=cursor+re.length();
        System.out.print("replace"+cursor);
        findone(fi);


    }
    public void find()
    {
        Dialog dfind=new Dialog(f,"Find");
        dfind.setSize(300,250);
        dfind.setLayout(new GridLayout(3,1));
        Label l1=new Label("Enter The Word You Want To Find");
        TextField tf=new TextField(100);
        Button b1,b2;
        b1=new Button("Find Next");
        b2=new Button("Close");

        dfind.add(l1);
        dfind.add(tf);
        Panel p=new Panel();
        p.setLayout(new GridLayout(1,2));
        p.add(b1);  p.add(b2);
        dfind.add(p);

        dfind.setLocationRelativeTo(f);
        dfind.setVisible(true);

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e1)
            {
                System.out.print("findb1");
                r=false;
                findone(tf.getText());
                System.out.print("findb1");


            }
        });
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e2)
            {
                dfind.setVisible(false);
                dfind.dispose();
                cursor=ta.getCaretPosition();
                ss=0;
            }
        });


    }
    public void findone(String s)
    {
        System.out.println("findone"+cursor);
        String str;
        str=ta.getText();

        Pattern p=Pattern.compile(s);
        Matcher m=p.matcher(str);

        cursor=ta.getCaretPosition()+ta.getSelectedText().length();
        System.out.println("findone"+cursor);
        String temp = ta.getText();
        temp=temp.replaceAll("\r\n","\n");
        ta.setText(temp);
        if(r==true)
            cursor=t;

        if(m.find(cursor))
        {
            System.out.print("find:"+cursor);
            cursor=m.start();
            ss=m.end();
            f.toFront();
            ta.select(cursor,ss);
            System.out.print("Find"+cursor);
        }
        else
        {
            System.out.println("a");
            Dialog d1 = new Dialog(f,"Cannot Find",true);
            d1.setSize(100,100);
            d1.setLayout(new GridLayout(2,1));
            Label l1 = new Label("Cannot find '"+s+"'");
            b1 = new Button("OK");
            b1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e1)
                {
                    d1.setVisible(false);
                    d1.dispose();
                    cursor=ta.getCaretPosition();

                }
            });
            d1.add(l1);
            Panel p1 = new Panel();
            p1.add(b1);
            d1.add(p1);
            d1.setLocationRelativeTo(f);
            d1.setVisible(true);
        }
        System.out.println("findone"+cursor);
    }
    public void saveas()
    {
        String test,s="";
        try
        {
            fdialog=new FileDialog(f,"Save File",FileDialog.SAVE);
            fdialog.setVisible(true);
            test=fdialog.getDirectory();
            if(test!=null)
            {
                fdir=fdialog.getDirectory();
                fname=fdialog.getFile();
                fpn=fdir+fname;

                File f=new File(fpn);
                f.createNewFile();
                FileOutputStream fos=new FileOutputStream(f);
                s=ta.getText();
                char c;

                for(int i=0;i<s.length();i++)
                {
                    c=s.charAt(i);
                    fos.write(c);
                }
                fos.close();
                flag=1;
                o=true;
            }
        }
        catch(IOException e)
        {
            System.out.print(e.getMessage());
        }
    }
    public void save()
    {
        String s="";
        s=ta.getText();
        try
        {
            FileOutputStream fos=new FileOutputStream(fpn);

            char c;
            for(int i=0;i<s.length();i++)
            {
                c=s.charAt(i);
                fos.write(c);
            }
            fos.close();
            flag=1;
            o=true;
        }
        catch(IOException e)
        {
            System.out.print(e.getMessage());
        }
    }
    public void openfile()
    {
        String test,s="";
        try
        {
            fdialog = new FileDialog(f,"Opening a file",FileDialog.LOAD);
            fdialog.setVisible(true);
            test=fdialog.getDirectory();
            if(test!=null)
            {
                fdir=fdialog.getDirectory();
                fname=fdialog.getFile();
                fpn=fdir+fname;
                System.out.println(fdir+"\t"+fname);
                FileInputStream fis = new FileInputStream(fpn);

                int ch;
                while((ch=fis.read()) != -1)
                {
                    char c = (char)ch;
                    s=s+c;
                }
                ta.setText(s);
                o=true;
                count=0;
                fis.close();
                flag=1;
            }
            else
            {
                return;
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.print("open"+flag);
    }

    public void newfile()
    {
        System.out.println("newfile"+flag);
        ta.setText(" ");
        flag=1;
        o=false;
        System.out.println("newfile"+flag);
    }

    public void textValueChanged(TextEvent te1)
    {
        System.out.println("textchange"+flag);
        boolean c;
        String temp=ta.getText();
        temp=temp.trim();
        if(temp.length()==0)
            c=true;
        else
            c=false;

        if(o==true&&count==0)
        {
            flag=1;
            count++;
        }

        else if(c&&o==false)
            flag=1;
        else
            flag=0;
        System.out.println("textchange"+flag);

    }
    public static void main(String args[])
    {
        Funprogrammer d=new Funprogrammer();
    }
}
