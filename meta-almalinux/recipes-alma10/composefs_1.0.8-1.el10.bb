
PN = "composefs"
PE = "0"
PV = "1.0.8"
PR = "1.el10"
PACKAGES = "composefs composefs-libs composefs-devel"


URI_composefs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/composefs-1.0.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:composefs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libcomposefs.so.1()(64bit) ( ) composefs-libs ( =  1.0.8-1.el10)"
RPROVIDES:composefs = "composefs ( =  1.0.8-1.el10) composefs(x86-64) ( =  1.0.8-1.el10)"

URI_composefs-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/composefs-libs-1.0.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:composefs-libs = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( )"
RPROVIDES:composefs-libs = "libcomposefs.so.1()(64bit) ( ) composefs-libs ( =  1.0.8-1.el10) composefs-libs(x86-64) ( =  1.0.8-1.el10)"

URI_composefs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/composefs-devel-1.0.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:composefs-devel = "/usr/bin/pkg-config ( ) pkgconfig(libcrypto) ( ) libcomposefs.so.1()(64bit) ( ) composefs(x86-64) ( =  1.0.8-1.el10) composefs-libs(x86-64) ( =  1.0.8-1.el10)"
RPROVIDES:composefs-devel = "composefs-devel ( =  1.0.8-1.el10) composefs-devel(x86-64) ( =  1.0.8-1.el10) pkgconfig(composefs) ( =  1.0.8)"
