
PN = "libnetfilter_cthelper"
PE = "0"
PV = "1.0.1"
PR = "1.el10"
PACKAGES = "libnetfilter_cthelper libnetfilter_cthelper-devel"


URI_libnetfilter_cthelper = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnetfilter_cthelper-1.0.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetfilter_cthelper = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libmnl.so.0()(64bit) ( ) libmnl.so.0(LIBMNL_1.0)(64bit) ( )"
RPROVIDES:libnetfilter_cthelper = "libnetfilter_cthelper.so.0()(64bit) ( ) libnetfilter_cthelper.so.0(LIBNETFILTER_CTHELPER_1.0)(64bit) ( ) libnetfilter_cthelper ( =  1.0.1-1.el10) libnetfilter_cthelper(x86-64) ( =  1.0.1-1.el10)"

URI_libnetfilter_cthelper-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnetfilter_cthelper-devel-1.0.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetfilter_cthelper-devel = "/usr/bin/pkg-config ( ) kernel-headers ( ) libnetfilter_cthelper.so.0()(64bit) ( ) libmnl-devel ( >=  1.0.0) libnetfilter_cthelper(x86-64) ( =  1.0.1-1.el10)"
RPROVIDES:libnetfilter_cthelper-devel = "libnetfilter_cthelper-devel ( =  1.0.1-1.el10) libnetfilter_cthelper-devel(x86-64) ( =  1.0.1-1.el10) pkgconfig(libnetfilter_cthelper) ( =  1.0.1)"
