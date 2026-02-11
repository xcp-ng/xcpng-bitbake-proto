
PN = "libarchive"
PE = "0"
PV = "3.7.7"
PR = "4.el10_0"
PACKAGES = "libarchive bsdtar libarchive-devel bsdcat bsdcpio bsdunzip"


URI_libarchive = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libarchive-3.7.7-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libarchive = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libz.so.1()(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libacl.so.1()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libzstd.so.1()(64bit) ( ) libacl.so.1(ACL_1.0)(64bit) ( ) libbz2.so.1()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.2)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.5)(64bit) ( ) liblz4.so.1()(64bit) ( ) liblzma.so.5(XZ_5.2)(64bit) ( )"
RPROVIDES:libarchive = "libarchive.so.13()(64bit) ( ) libarchive ( =  3.7.7-4.el10_0) libarchive(x86-64) ( =  3.7.7-4.el10_0)"

URI_bsdtar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bsdtar-3.7.7-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:bsdtar = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libarchive.so.13()(64bit) ( ) libarchive(x86-64) ( =  3.7.7-4.el10_0)"
RPROVIDES:bsdtar = "bsdtar ( =  3.7.7-4.el10_0) bsdtar(x86-64) ( =  3.7.7-4.el10_0)"

URI_libarchive-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libarchive-devel-3.7.7-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libarchive-devel = "/usr/bin/pkg-config ( ) libarchive.so.13()(64bit) ( ) pkgconfig(libcrypto) ( ) libarchive(x86-64) ( =  3.7.7-4.el10_0)"
RPROVIDES:libarchive-devel = "pkgconfig(libarchive) ( =  3.7.7) libarchive-devel ( =  3.7.7-4.el10_0) libarchive-devel(x86-64) ( =  3.7.7-4.el10_0)"

URI_bsdcat = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bsdcat-3.7.7-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:bsdcat = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libarchive.so.13()(64bit) ( ) libarchive(x86-64) ( =  3.7.7-4.el10_0)"
RPROVIDES:bsdcat = "bsdcat ( =  3.7.7-4.el10_0) bsdcat(x86-64) ( =  3.7.7-4.el10_0)"

URI_bsdcpio = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bsdcpio-3.7.7-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:bsdcpio = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libarchive.so.13()(64bit) ( ) libarchive(x86-64) ( =  3.7.7-4.el10_0)"
RPROVIDES:bsdcpio = "bsdcpio ( =  3.7.7-4.el10_0) bsdcpio(x86-64) ( =  3.7.7-4.el10_0)"

URI_bsdunzip = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bsdunzip-3.7.7-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:bsdunzip = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libarchive.so.13()(64bit) ( ) libarchive(x86-64) ( =  3.7.7-4.el10_0)"
RPROVIDES:bsdunzip = "bsdunzip ( =  3.7.7-4.el10_0) bsdunzip(x86-64) ( =  3.7.7-4.el10_0)"
