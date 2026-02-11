
PN = "libnetfilter_cttimeout"
PE = "0"
PV = "1.0.0"
PR = "27.el10"
PACKAGES = "libnetfilter_cttimeout libnetfilter_cttimeout-devel"


URI_libnetfilter_cttimeout = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnetfilter_cttimeout-1.0.0-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetfilter_cttimeout = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libmnl.so.0()(64bit) ( ) libmnl.so.0(LIBMNL_1.0)(64bit) ( )"
RPROVIDES:libnetfilter_cttimeout = "libnetfilter_cttimeout.so.1()(64bit) ( ) libnetfilter_cttimeout.so.1(LIBNETFILTER_CTTIMEOUT_1.0)(64bit) ( ) libnetfilter_cttimeout.so.1(LIBNETFILTER_CTTIMEOUT_1.1)(64bit) ( ) libnetfilter_cttimeout ( =  1.0.0-27.el10) libnetfilter_cttimeout(x86-64) ( =  1.0.0-27.el10)"

URI_libnetfilter_cttimeout-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnetfilter_cttimeout-devel-1.0.0-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetfilter_cttimeout-devel = "/usr/bin/pkg-config ( ) kernel-headers ( ) libnetfilter_cttimeout.so.1()(64bit) ( ) libmnl-devel ( >=  1.0.0) libnetfilter_cttimeout(x86-64) ( =  1.0.0-27.el10)"
RPROVIDES:libnetfilter_cttimeout-devel = "libnetfilter_cttimeout-devel ( =  1.0.0-27.el10) libnetfilter_cttimeout-devel(x86-64) ( =  1.0.0-27.el10) pkgconfig(libnetfilter_cttimeout) ( =  1.0.0)"
