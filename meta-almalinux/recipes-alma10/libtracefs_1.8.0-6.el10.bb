
PN = "libtracefs"
PE = "0"
PV = "1.8.0"
PR = "6.el10"
PACKAGES = "libtracefs libtracefs-devel"


URI_libtracefs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libtracefs-1.8.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtracefs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libtraceevent.so.1()(64bit) ( )"
RPROVIDES:libtracefs = "libtracefs.so.1()(64bit) ( ) libtracefs ( =  1.8.0-6.el10) libtracefs(x86-64) ( =  1.8.0-6.el10)"

URI_libtracefs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtracefs-devel-1.8.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtracefs-devel = "/usr/bin/pkg-config ( ) libtracefs.so.1()(64bit) ( ) libtracefs(x86-64) ( =  1.8.0-6.el10) pkgconfig(libtraceevent) ( >  1.8)"
RPROVIDES:libtracefs-devel = "libtracefs-devel ( =  1.8.0-6.el10) libtracefs-devel(x86-64) ( =  1.8.0-6.el10) pkgconfig(libtracefs) ( =  1.8.0)"
