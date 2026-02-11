
PN = "m17n-lib"
PE = "0"
PV = "1.8.4"
PR = "7.el10"
PACKAGES = "m17n-lib m17n-lib-devel m17n-lib-tools"


URI_m17n-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/m17n-lib-1.8.4-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:m17n-lib = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libz.so.1()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) liblzma.so.5()(64bit) ( ) libthai.so.0()(64bit) ( ) libthai.so.0(LIBTHAI_0.1)(64bit) ( ) m17n-db ( )"
RPROVIDES:m17n-lib = "bundled(gnulib) ( ) libm17n-core.so.0()(64bit) ( ) libm17n-flt.so.0()(64bit) ( ) libm17n.so.0()(64bit) ( ) m17n-lib ( =  1.8.4-7.el10) m17n-lib(x86-64) ( =  1.8.4-7.el10)"

URI_m17n-lib-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/m17n-lib-devel-1.8.4-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:m17n-lib-devel = "/usr/bin/pkg-config ( ) libm17n-core.so.0()(64bit) ( ) libm17n-flt.so.0()(64bit) ( ) libm17n-gui.so.0()(64bit) ( ) libm17n.so.0()(64bit) ( ) m17n-lib-tools ( =  1.8.4-7.el10)"
RPROVIDES:m17n-lib-devel = "m17n-lib-devel ( =  1.8.4-7.el10) m17n-lib-devel(x86-64) ( =  1.8.4-7.el10) pkgconfig(m17n-core) ( =  1.8.4) pkgconfig(m17n-flt) ( =  1.8.4) pkgconfig(m17n-gui) ( =  1.8.4) pkgconfig(m17n-shell) ( =  1.8.4)"

URI_m17n-lib-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/m17n-lib-tools-1.8.4-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:m17n-lib-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libz.so.1()(64bit) ( ) libxml2.so.2()(64bit) ( ) libX11.so.6()(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libfreetype.so.6()(64bit) ( ) libXaw.so.7()(64bit) ( ) libXt.so.6()(64bit) ( ) libICE.so.6()(64bit) ( ) libSM.so.6()(64bit) ( ) libgd.so.3()(64bit) ( ) liblzma.so.5()(64bit) ( ) libm17n-core.so.0()(64bit) ( ) libm17n-flt.so.0()(64bit) ( ) libotf.so.1()(64bit) ( ) m17n-db-extras ( ) libfribidi.so.0()(64bit) ( ) libm17n.so.0()(64bit) ( ) libXft.so.2()(64bit) ( ) libthai.so.0()(64bit) ( ) m17n-lib(x86-64) ( =  1.8.4-7.el10)"
RPROVIDES:m17n-lib-tools = "libm17n-gui.so.0()(64bit) ( ) libm17n-X.so()(64bit) ( ) libm17n-gd.so()(64bit) ( ) m17n-lib-tools ( =  1.8.4-7.el10) m17n-lib-tools(x86-64) ( =  1.8.4-7.el10)"
