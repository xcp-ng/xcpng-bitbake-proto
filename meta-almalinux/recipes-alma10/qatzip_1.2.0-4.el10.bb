
PN = "qatzip"
PE = "0"
PV = "1.2.0"
PR = "4.el10"
PACKAGES = "qatzip qatzip-libs qatzip-devel"


URI_qatzip = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qatzip-1.2.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qatzip = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( ) liblz4.so.1()(64bit) ( ) libz.so.1(ZLIB_1.2.2)(64bit) ( ) libqat.so.4()(64bit) ( ) libusdm.so.0()(64bit) ( )"
RPROVIDES:qatzip = "qatzip ( =  1.2.0-4.el10) qatzip(x86-64) ( =  1.2.0-4.el10)"

URI_qatzip-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qatzip-libs-1.2.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qatzip-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libz.so.1()(64bit) ( ) liblz4.so.1()(64bit) ( ) libz.so.1(ZLIB_1.2.2)(64bit) ( ) libqat.so.4()(64bit) ( ) libusdm.so.0()(64bit) ( )"
RPROVIDES:qatzip-libs = "libqatzip.so.3()(64bit) ( ) qatzip-libs ( =  1.2.0-4.el10) qatzip-libs(x86-64) ( =  1.2.0-4.el10)"

URI_qatzip-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qatzip-devel-1.2.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qatzip-devel = "/usr/bin/pkg-config ( ) pkgconfig(zlib) ( ) pkgconfig(liblz4) ( ) libqatzip.so.3()(64bit) ( ) qatzip-libs(x86-64) ( =  1.2.0-4.el10)"
RPROVIDES:qatzip-devel = "pkgconfig(qatzip) ( =  1.2.0) qatzip-devel ( =  1.2.0-4.el10) qatzip-devel(x86-64) ( =  1.2.0-4.el10)"
