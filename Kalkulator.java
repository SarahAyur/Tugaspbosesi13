Tugass  sesi13 ;

impor  javax . ayunan .*;
impor  jawa . awt .*;
impor  jawa . awt . acara .*;

public  class  Kalkulator  extends  JFrame  mengimplementasikan  ActionListener {
    
     Masukan JTextField1 = JTextField baru  ();
     Masukan JTextField2 = JTextField baru  ();

    JButton  tambah = JButton baru  ( "+" );
    JButton  kurang = new  JButton ( "-" );
    JButton  bagi = new  JButton ( "/" );
    JButton  penambahan = JButton baru  ( "*" );
     Modul JButton = new JButton ( "mod" ); 

    JLabel  sama = JLabel baru  ( "\t\t=\t" );
    JLabel  hasil = new  JLabel ( "Hasil" );


    Kalkulator (){
        super ( "Kalkulator Sederhana" );
        setUkuran ( 450 , 375 );
        setVisible ( benar );
        setDefaultCloseOperation ( EXIT_ON_CLOSE );
        setLayout ( null );
    
        //panel masukan
        FlowLayout  fl = FlowLayout baru  ( FlowLayout .LEFT ) ;
         masukan panel JPanel = JPanel baru  ( fl );
        input panel . setBounds ( 0 , 0 , 450 , 75 );

        input panel . tambahkan ( input1 );
        masukan1 . setPreferredSize ( Dimensi baru  ( 150 , 50 ));

        input panel . tambahkan ( input2 );
        masukan2 . setPreferredSize ( Dimensi baru  ( 150 , 50 ));

        //label
        
        input panel . tambahkan ( sama dengan );
        input panel . tambah ( hasil );

        tambahkan ( masukan panel );

        //panel tombol
         panel tombol JPanel = JPanel baru  ();
        panel tombol . setLayout ( BoxLayout baru  ( buttonpanel , BoxLayout . Y_AXIS ));
        panel tombol . setBackground ( Warna .merah ) ;
        panel tombol . setBounds ( 0 , 75 , 300 , 250 );

        panel tombol . tambahkan ( tambah );
        panel tombol . tambah ( kurang );
        panel tombol . tambah ( pertambahan );
        panel tombol . tambah ( bagi );
        panel tombol . tambahkan ( modulus );

        tambah . setMaximumSize ( Dimensi baru  ( 300 , 50 ));
        kurang . setMaximumSize ( Dimensi baru  ( 300 , 50 ));
        pertambahan . setMaximumSize ( Dimensi baru  ( 300 , 50 ));
        bagi . setMaximumSize ( Dimensi baru  ( 300 , 50 ));
        modulus . setMaximumSize ( Dimensi baru  ( 300 , 50 ));
        
        tambahkan ( panel tombol );

        // daftarkan sumber acara
        tambah . addActionListener ( ini );
        kurang . addActionListener ( ini );
        pertambahan . addActionListener ( ini );
        bagi . addActionListener ( ini );
        modulus . addActionListener ( ini );
    }


    @ Menimpa
    public  void  actionPerformed ( ActionEvent  e ) {
        // TODO rintisan metode yang dihasilkan secara otomatis
        
        coba {

            int  x = bilangan bulat . parseInt ( input1 . getText ());
            int  y = Bilangan Bulat . parseInt ( input2 . getText ());

            if ( e .getActionCommand (). sama dengan ( "+" )){
                hasil . setText ( Integer .toString ( x + y ) );
            }
            lain  jika ( e .getActionCommand (). sama dengan ( "-" )){
                hasil . setText ( Integer .toString ( x - y ) );
            }
            lain  jika ( e .getActionCommand (). sama dengan ( "*" )){
                hasil . setText ( Integer .toString ( x * y ) );
            }
            lain  jika ( e .getActionCommand (). sama dengan ( "/" )){
                hasil . setText ( Integer .toString ( x / y ) );
            }
            lain  jika ( e .getActionCommand (). sama dengan ( "mod" )){
                hasil . setText ( Integer .toString ( x % y ) );
            }
            
        } tangkap ( Pengecualian  m ) {
            //TODO: menangani masalah
            hasil . setText ( m .getMessage ( ));
            
            
        }
        
    }
    public  static  void  main ( String [] args ) {
        Kalkulator  kl = Kalkulator baru  ();
    }
}
