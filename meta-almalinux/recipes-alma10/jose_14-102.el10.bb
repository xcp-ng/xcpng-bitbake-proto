
PN = "jose"
PE = "0"
PV = "14"
PR = "102.el10"
PACKAGES = "jose libjose libjose-devel"


URI_jose = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jose-14-102.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jose = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libjansson.so.4()(64bit) ( ) libjansson.so.4(libjansson.so.4)(64bit) ( ) libjose.so.0()(64bit) ( ) libjose.so.0(LIBJOSE_1.0)(64bit) ( ) libjose(x86-64) ( =  14-102.el10)"
RPROVIDES:jose = "jose ( =  14-102.el10) jose(x86-64) ( =  14-102.el10)"

URI_libjose = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libjose-14-102.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjose = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libjansson.so.4()(64bit) ( ) libjansson.so.4(libjansson.so.4)(64bit) ( )"
RPROVIDES:libjose = "libjose.so.0()(64bit) ( ) libjose.so.0(LIBJOSE_1.0)(64bit) ( ) libjose.so.0(LIBJOSE_OPENSSL_1.0)(64bit) ( ) libjose(x86-64) ( =  14-102.el10) libjose ( =  14-102.el10) libjose-openssl ( =  14-102.el10) libjose-zlib ( =  14-102.el10)"

URI_libjose-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libjose-devel-14-102.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjose-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(zlib) ( ) jansson-devel ( ) libjose.so.0()(64bit) ( ) libjose(x86-64) ( =  14-102.el10) pkgconfig(jansson) ( >=  2.10) pkgconfig(libcrypto) ( >=  1.0.2)"
RPROVIDES:libjose-devel = "libjose-devel ( =  14-102.el10) libjose-devel(x86-64) ( =  14-102.el10) libjose-openssl-devel ( =  14-102.el10) libjose-zlib-devel ( =  14-102.el10) pkgconfig(jose) ( =  14)"
