
PN = "HdrHistogram_c"
PE = "0"
PV = "0.11.8"
PR = "7.el10"
PACKAGES = "HdrHistogram_c HdrHistogram_c-devel"


URI_HdrHistogram_c = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/HdrHistogram_c-0.11.8-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:HdrHistogram_c = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( )"
RPROVIDES:HdrHistogram_c = "libhdr_histogram.so.6()(64bit) ( ) HdrHistogram_c ( =  0.11.8-7.el10) HdrHistogram_c(x86-64) ( =  0.11.8-7.el10)"

URI_HdrHistogram_c-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/HdrHistogram_c-devel-0.11.8-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:HdrHistogram_c-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) pkgconfig(zlib) ( ) libhdr_histogram.so.6()(64bit) ( ) HdrHistogram_c(x86-64) ( =  0.11.8-7.el10)"
RPROVIDES:HdrHistogram_c-devel = "HdrHistogram_c-devel ( =  0.11.8-7.el10) HdrHistogram_c-devel(x86-64) ( =  0.11.8-7.el10) cmake(hdr_histogram) ( =  0.11.8) pkgconfig(hdr_histogram) ( =  0.11.8)"
