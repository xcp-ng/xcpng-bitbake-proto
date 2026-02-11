
PN = "libopenraw"
PE = "0"
PV = "0.1.3"
PR = "19.el10"
PACKAGES = "libopenraw libopenraw-devel libopenraw-gnome libopenraw-gnome-devel libopenraw-pixbuf-loader"


URI_libopenraw = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libopenraw-0.1.3-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libopenraw = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( )"
RPROVIDES:libopenraw = "libopenraw.so.7()(64bit) ( ) libopenraw ( =  0.1.3-19.el10) libopenraw(x86-64) ( =  0.1.3-19.el10)"

URI_libopenraw-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libopenraw-devel-0.1.3-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libopenraw-devel = "/usr/bin/pkg-config ( ) libopenraw.so.7()(64bit) ( ) libopenraw(x86-64) ( =  0.1.3-19.el10)"
RPROVIDES:libopenraw-devel = "libopenraw-devel(x86-64) ( =  0.1.3-19.el10) libopenraw-devel ( =  0.1.3-19.el10) pkgconfig(libopenraw-0.1) ( =  0.1.3)"

URI_libopenraw-gnome = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libopenraw-gnome-0.1.3-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libopenraw-gnome = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libopenraw.so.7()(64bit) ( ) libopenraw(x86-64) ( =  0.1.3-19.el10)"
RPROVIDES:libopenraw-gnome = "libopenrawgnome.so.7()(64bit) ( ) libopenraw-gnome(x86-64) ( =  0.1.3-19.el10) libopenraw-gnome ( =  0.1.3-19.el10)"

URI_libopenraw-gnome-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libopenraw-gnome-devel-0.1.3-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libopenraw-gnome-devel = "/usr/bin/pkg-config ( ) libopenrawgnome.so.7()(64bit) ( ) pkgconfig(libopenraw-0.1) ( ) libopenraw-devel(x86-64) ( =  0.1.3-19.el10) libopenraw-gnome(x86-64) ( =  0.1.3-19.el10)"
RPROVIDES:libopenraw-gnome-devel = "libopenraw-gnome-devel ( =  0.1.3-19.el10) libopenraw-gnome-devel(x86-64) ( =  0.1.3-19.el10) pkgconfig(libopenraw-gnome-0.1) ( =  0.1.3)"

URI_libopenraw-pixbuf-loader = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libopenraw-pixbuf-loader-0.1.3-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libopenraw-pixbuf-loader = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libopenraw.so.7()(64bit) ( ) libopenraw(x86-64) ( =  0.1.3-19.el10)"
RPROVIDES:libopenraw-pixbuf-loader = "libopenraw_pixbuf.so()(64bit) ( ) libopenraw-pixbuf-loader ( =  0.1.3-19.el10) libopenraw-pixbuf-loader(x86-64) ( =  0.1.3-19.el10)"
