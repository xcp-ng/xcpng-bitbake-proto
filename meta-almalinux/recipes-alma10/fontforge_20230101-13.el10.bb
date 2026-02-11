
PN = "fontforge"
PE = "0"
PV = "20230101"
PR = "13.el10"
PACKAGES = "fontforge fontforge-devel fontforge-doc"


URI_fontforge = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fontforge-20230101-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fontforge = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libz.so.1()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libreadline.so.8()(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libtiff.so.6()(64bit) ( ) libtiff.so.6(LIBTIFF_4.0)(64bit) ( ) libgcc_s.so.1(GCC_4.0.0)(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libgif.so.7()(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libfreetype.so.6()(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) libwoff2dec.so.1.0.2()(64bit) ( ) libwoff2enc.so.1.0.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) hicolor-icon-theme ( ) libspiro.so.1()(64bit) ( ) xdg-utils ( ) python(abi) ( =  3.12) autotrace ( or  potrace)"
RPROVIDES:fontforge = "application() ( ) metainfo() ( ) application(org.fontforge.FontForge.desktop) ( ) libfontforge.so.4()(64bit) ( ) metainfo(org.fontforge.FontForge.appdata.xml) ( ) mimehandler(application/font-woff) ( ) mimehandler(application/vnd.font-fontforge-sfd) ( ) mimehandler(application/x-font-bdf) ( ) mimehandler(application/x-font-otf) ( ) mimehandler(application/x-font-pcf) ( ) mimehandler(application/x-font-tex) ( ) mimehandler(application/x-font-ttf) ( ) mimehandler(application/x-font-type1) ( ) mimehandler(font/otf) ( ) mimehandler(font/ttf) ( ) mimehandler(font/woff) ( ) mimehandler(font/woff2) ( ) fontforge ( =  20230101-13.el10) fontforge(x86-64) ( =  20230101-13.el10) python-fontforge ( =  20230101-13.el10) python-psMat ( =  20230101-13.el10) python3-fontforge ( =  20230101-13.el10) python3-psMat ( =  20230101-13.el10) python3.12-fontforge ( =  20230101-13.el10) python3.12-psMat ( =  20230101-13.el10)"

URI_fontforge-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fontforge-devel-20230101-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fontforge-devel = "libfontforge.so.4()(64bit) ( ) fontforge-doc ( =  20230101-13.el10) fontforge(x86-64) ( =  20230101-13.el10)"
RPROVIDES:fontforge-devel = "fontforge-devel ( =  20230101-13.el10) fontforge-devel(x86-64) ( =  20230101-13.el10)"

URI_fontforge-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fontforge-doc-20230101-13.el10.noarch.rpm;unpack=0"
RDEPENDS:fontforge-doc = ""
RPROVIDES:fontforge-doc = "fontforge-doc ( =  20230101-13.el10)"
