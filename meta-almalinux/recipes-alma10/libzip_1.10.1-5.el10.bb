
PN = "libzip"
PE = "0"
PV = "1.10.1"
PR = "5.el10"
PACKAGES = "libzip libzip-tools libzip-devel"


URI_libzip = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libzip-1.10.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libzip = "rtld(GNU_HASH) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libzstd.so.1()(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libbz2.so.1()(64bit) ( ) libc.so.6(GLIBC_2.36)(64bit) ( )"
RPROVIDES:libzip = "libzip.so.5()(64bit) ( ) libzip(x86-64) ( =  1.10.1-5.el10) libzip ( =  1.10.1-5.el10)"

URI_libzip-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libzip-tools-1.10.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libzip-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libz.so.1()(64bit) ( ) libzip.so.5()(64bit) ( ) libzip(x86-64) ( =  1.10.1-5.el10)"
RPROVIDES:libzip-tools = "libzip-tools ( =  1.10.1-5.el10) libzip-tools(x86-64) ( =  1.10.1-5.el10)"

URI_libzip-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libzip-devel-1.10.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libzip-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libzip.so.5()(64bit) ( ) libzip(x86-64) ( =  1.10.1-5.el10)"
RPROVIDES:libzip-devel = "cmake(libzip) ( =  1.10.1) libzip-devel ( =  1.10.1-5.el10) libzip-devel(x86-64) ( =  1.10.1-5.el10) pkgconfig(libzip) ( =  1.10.1)"
