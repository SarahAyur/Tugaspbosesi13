tugass sesi13 ;

impor  javax . ayunan .*;
impor  jawa . awt .*;
impor  jawa . awt . acara .*;
impor  jawa . menggunakan . Acak ;

 Kuis kelas  publik memperluas JFrame mengimplementasikan ActionListener {    
    
    int  x , y ;
     Masukan JTextField3 = JTextField baru  ();
    JLabel  ket = new  JLabel ();
    JPanel  dsp ;

    Kuis (){
        super ( "Quiz dadakan" );
        setUkuran ( 450 , 200 );
        setDefaultCloseOperation ( EXIT_ON_CLOSE );
        setLayout ( null );

        
        //panel tampilan
        FlowLayout  fl = FlowLayout baru  ( FlowLayout .LEFT ) ;
        dsp = JPanel baru  ( fl );
        dsp . setBounds ( 0 , 0 , 450 , 75 );
        dsp . setOpaque ( palsu );

        setRandom ();
        
         Ikon JLabel = JLabel baru  ( "=" );
        dsp . tambahkan ( ikon );

        dsp . tambahkan ( input3 );
        masukan3 . setPreferredSize ( Dimensi baru  ( 125 , 50 ));
        tambahkan ( dsp );
        
        //memeriksa
        JPanel  btnpanel = JPanel baru  ( FlowLayout baru ( FlowLayout .LEFT ) ) ; 
        btnpanel . setBounds ( 0 , 75 , 450 , 75 );
        btnpanel . setOpaque ( salah );;
        
        JButton  periksa = JButton baru  ( "Periksa" );
        cek . setPreferredSize ( Dimensi baru  ( 250 , 30 ));
        btnpanel . tambahkan ( centang );

        tambahkan ( btnpanel );

        ket . setBounds ( 20 , 125 , 450 , 30 );
        tambahkan ( ket );

        // daftar
        cek . addActionListener ( ini );

        setVisible ( benar );
    }

    public  void  setRandom (){

         Rand acak = Acak baru  ();
        x = rand . nextInt ( 10 );
        y = rand . nextInt ( 10 );

         Masukan JTextField1 = JTextField baru  ();
        masukan1 . setText ( Integer .toString ( x ) );
        dsp . tambahkan ( input1 );
        masukan1 . setPreferredSize ( Dimensi baru  ( 125 , 50 ));
        masukan1 . setEditable ( false );

         Masukan JTextField2 = JTextField baru  ();
        masukan2 . setText ( Integer .toString ( y ) );
        dsp . tambahkan ( input2 );
        masukan2 . setPreferredSize ( Dimensi baru  ( 125 , 50 ));
        masukan2 . setEditable ( false );
    }

    public  static  void  main ( String [] args ) {
        Kuis  edlink = Kuis baru  ();
    }

    @ Menimpa
    public  void  actionPerformed ( ActionEvent  e ) {
        // TODO rintisan metode yang dihasilkan secara otomatis

        coba {

            int  hasil = Bilangan Bulat . parseInt ( input3 . getText ());
            
            if ( x + y == hasil ){
                getContentPane (). setBackground ( Warna .hijau ) ;
                ket . setText ( "Selamat jawaban anda benar!!!" );
            }
            lain {
                getContentPane (). setBackground ( Warna .merah ) ;
                ket . setText ( "Maaf, Jawaban anda salah!!!" );

            }
            
        } tangkap ( Pengecualian  p ) {
            //TODO: menangani masalah
            Sistem . keluar . println ( p.getMessage ( ) );
        }
        
    }
    
}
