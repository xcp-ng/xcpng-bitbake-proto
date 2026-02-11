
PN = "libtracecmd"
PE = "0"
PV = "1.5.2"
PR = "1.el10"
PACKAGES = "libtracecmd libtracecmd-devel"


URI_libtracecmd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libtracecmd-1.5.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtracecmd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( ) libzstd.so.1()(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( ) libtraceevent.so.1()(64bit) ( ) libtracefs.so.1()(64bit) ( )"
RPROVIDES:libtracecmd = "libtracecmd.so.1()(64bit) ( ) libtracecmd ( =  1.5.2-1.el10) libtracecmd(x86-64) ( =  1.5.2-1.el10)"

URI_libtracecmd-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtracecmd-devel-1.5.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtracecmd-devel = "/usr/bin/pkg-config ( ) libtracecmd.so.1()(64bit) ( ) libtracecmd(x86-64) ( =  1.5.2-1.el10) pkgconfig(libtracefs) ( >=  1.8)"
RPROVIDES:libtracecmd-devel = "libtracecmd-devel ( =  1.5.2-1.el10) libtracecmd-devel(x86-64) ( =  1.5.2-1.el10) pkgconfig(libtracecmd) ( =  1.5.2)"
