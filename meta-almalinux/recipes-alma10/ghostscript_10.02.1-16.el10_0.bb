
PN = "ghostscript"
PE = "0"
PV = "10.02.1"
PR = "16.el10_0"
PACKAGES = "ghostscript ghostscript-doc ghostscript-tools-fonts ghostscript-tools-printing libgs ghostscript-tools-dvipdf libgs-devel ghostscript-gtk"


URI_ghostscript = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ghostscript-10.02.1-16.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ghostscript = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libgs.so.10()(64bit) ( ) ghostscript-tools-fonts ( =  10.02.1-16.el10_0) ghostscript-tools-printing ( =  10.02.1-16.el10_0) libgs(x86-64) ( =  10.02.1-16.el10_0) jbig2dec-libs ( =  0.20)"
RPROVIDES:ghostscript = "ghostscript ( =  10.02.1-16.el10_0) ghostscript(x86-64) ( =  10.02.1-16.el10_0) ghostscript-core ( =  10.02.1-16.el10_0) ghostscript-x11 ( =  10.02.1-16.el10_0)"

URI_ghostscript-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ghostscript-doc-10.02.1-16.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ghostscript-doc = "ghostscript ( =  10.02.1-16.el10_0)"
RPROVIDES:ghostscript-doc = "ghostscript-doc ( =  10.02.1-16.el10_0)"

URI_ghostscript-tools-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ghostscript-tools-fonts-10.02.1-16.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ghostscript-tools-fonts = "/usr/bin/sh ( ) ghostscript ( =  10.02.1-16.el10_0)"
RPROVIDES:ghostscript-tools-fonts = "ghostscript-tools-fonts ( =  10.02.1-16.el10_0)"

URI_ghostscript-tools-printing = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ghostscript-tools-printing-10.02.1-16.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ghostscript-tools-printing = "/usr/bin/sh ( ) ghostscript ( =  10.02.1-16.el10_0)"
RPROVIDES:ghostscript-tools-printing = "ghostscript-tools-printing ( =  10.02.1-16.el10_0)"

URI_libgs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgs-10.02.1-16.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgs = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libfreetype.so.6()(64bit) ( ) libpng16.so.16()(64bit) ( ) libcups.so.2()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libtiff.so.6()(64bit) ( ) libtiff.so.6(LIBTIFF_4.0)(64bit) ( ) liblcms2.so.2()(64bit) ( ) urw-base35-fonts ( ) adobe-mappings-cmap ( ) libopenjp2.so.7()(64bit) ( ) adobe-mappings-cmap-deprecated ( ) adobe-mappings-pdf ( ) google-droid-sans-fonts ( ) libpaper.so.2()(64bit) ( ) libijs-0.35.so()(64bit) ( ) libjbig2dec.so.0()(64bit) ( )"
RPROVIDES:libgs = "libgs.so.10()(64bit) ( ) libgs(x86-64) ( =  10.02.1-16.el10_0) libgs ( =  10.02.1-16.el10_0)"

URI_ghostscript-tools-dvipdf = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ghostscript-tools-dvipdf-10.02.1-16.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ghostscript-tools-dvipdf = "/usr/bin/sh ( ) /usr/bin/dvips ( ) ghostscript ( =  10.02.1-16.el10_0)"
RPROVIDES:ghostscript-tools-dvipdf = "ghostscript-tools-dvipdf ( =  10.02.1-16.el10_0)"

URI_libgs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgs-devel-10.02.1-16.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgs-devel = "libgs.so.10()(64bit) ( ) libgs(x86-64) ( =  10.02.1-16.el10_0)"
RPROVIDES:libgs-devel = "ghostscript-devel ( =  10.02.1-16.el10_0) ghostscript-devel(x86-64) ( =  10.02.1-16.el10_0) libgs-devel ( =  10.02.1-16.el10_0) libgs-devel(x86-64) ( =  10.02.1-16.el10_0)"

URI_ghostscript-gtk = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ghostscript-gtk-10.02.1-16.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ghostscript-gtk = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libgs.so.10()(64bit) ( ) libgs(x86-64) ( =  10.02.1-16.el10_0)"
RPROVIDES:ghostscript-gtk = "ghostscript-gtk ( =  10.02.1-16.el10_0) ghostscript-gtk(x86-64) ( =  10.02.1-16.el10_0)"
