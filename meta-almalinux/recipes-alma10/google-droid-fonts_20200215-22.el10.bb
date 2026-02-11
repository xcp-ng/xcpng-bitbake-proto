
PN = "google-droid-fonts"
PE = "0"
PV = "20200215"
PR = "22.el10"
PACKAGES = "google-droid-sans-fonts google-droid-sans-mono-fonts google-droid-serif-fonts google-droid-fonts-all"


URI_google-droid-sans-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-droid-sans-fonts-20200215-22.el10.noarch.rpm;unpack=0"
RDEPENDS:google-droid-sans-fonts = "fontpackages-filesystem ( )"
RPROVIDES:google-droid-sans-fonts = "metainfo() ( ) font(droidarabickufi) ( ) font(droidsans) ( ) font(droidsansarmenian) ( ) font(droidsansdevanagari) ( ) font(droidsansethiopic) ( ) font(droidsansfallback) ( ) font(droidsansgeorgian) ( ) font(droidsanshebrew) ( ) font(droidsansjapanese) ( ) font(droidsanstamil) ( ) font(droidsansthai) ( ) metainfo(org.fedoraproject.google-droid-sans-fonts.metainfo.xml) ( ) config(google-droid-sans-fonts) ( =  20200215-22.el10) google-droid-sans-fonts ( =  20200215-22.el10)"

URI_google-droid-sans-mono-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-droid-sans-mono-fonts-20200215-22.el10.noarch.rpm;unpack=0"
RDEPENDS:google-droid-sans-mono-fonts = "fontpackages-filesystem ( )"
RPROVIDES:google-droid-sans-mono-fonts = "metainfo() ( ) font(droidsansmono) ( ) metainfo(org.fedoraproject.google-droid-sans-mono-fonts.metainfo.xml) ( ) config(google-droid-sans-mono-fonts) ( =  20200215-22.el10) google-droid-sans-mono-fonts ( =  20200215-22.el10)"

URI_google-droid-serif-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-droid-serif-fonts-20200215-22.el10.noarch.rpm;unpack=0"
RDEPENDS:google-droid-serif-fonts = "fontpackages-filesystem ( )"
RPROVIDES:google-droid-serif-fonts = "metainfo() ( ) font(droidarabicnaskh) ( ) font(droidserif) ( ) metainfo(org.fedoraproject.google-droid-serif-fonts.metainfo.xml) ( ) config(google-droid-serif-fonts) ( =  20200215-22.el10) google-droid-serif-fonts ( =  20200215-22.el10)"

URI_google-droid-fonts-all = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/google-droid-fonts-all-20200215-22.el10.noarch.rpm;unpack=0"
RDEPENDS:google-droid-fonts-all = "google-droid-sans-fonts ( =  20200215-22.el10) google-droid-sans-mono-fonts ( =  20200215-22.el10) google-droid-serif-fonts ( =  20200215-22.el10)"
RPROVIDES:google-droid-fonts-all = "google-droid-fonts-all ( =  20200215-22.el10)"
