
PN = "libtraceevent"
PE = "0"
PV = "1.8.4"
PR = "3.el10"
PACKAGES = "libtraceevent libtraceevent-devel"


URI_libtraceevent = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libtraceevent-1.8.4-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtraceevent = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libtraceevent = "libtraceevent.so.1()(64bit) ( ) libtraceevent ( =  1.8.4-3.el10) libtraceevent(x86-64) ( =  1.8.4-3.el10)"

URI_libtraceevent-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtraceevent-devel-1.8.4-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtraceevent-devel = "/usr/bin/pkg-config ( ) libtraceevent.so.1()(64bit) ( ) libtraceevent(x86-64) ( =  1.8.4-3.el10)"
RPROVIDES:libtraceevent-devel = "libtraceevent-devel ( =  1.8.4-3.el10) libtraceevent-devel(x86-64) ( =  1.8.4-3.el10) pkgconfig(libtraceevent) ( =  1.8.4)"
