
PN = "libgit2"
PE = "0"
PV = "1.7.2"
PR = "3.el10"
PACKAGES = "libgit2 libgit2-devel"


URI_libgit2 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libgit2-1.7.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgit2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libllhttp.so.9.1()(64bit) ( )"
RPROVIDES:libgit2 = "libgit2.so.1.7()(64bit) ( ) bundled(libxdiff) ( ) libgit2(x86-64) ( =  1.7.2-3.el10) libgit2 ( =  1.7.2-3.el10)"

URI_libgit2-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libgit2-devel-1.7.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgit2-devel = "/usr/bin/pkg-config ( ) libgit2.so.1.7()(64bit) ( ) pkgconfig(zlib) ( ) pkgconfig(libpcre2-8) ( ) pkgconfig(openssl) ( ) libgit2(x86-64) ( =  1.7.2-3.el10)"
RPROVIDES:libgit2-devel = "libgit2-devel ( =  1.7.2-3.el10) libgit2-devel(x86-64) ( =  1.7.2-3.el10) pkgconfig(libgit2) ( =  1.7.2)"
