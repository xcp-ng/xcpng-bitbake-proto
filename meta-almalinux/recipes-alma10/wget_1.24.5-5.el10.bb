
PN = "wget"
PE = "0"
PV = "1.24.5"
PR = "5.el10"
PACKAGES = "wget"


URI_wget = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wget-1.24.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:wget = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libuuid.so.1()(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libidn2.so.0()(64bit) ( ) libidn2.so.0(IDN2_0.0.0)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_3)(64bit) ( ) libpsl.so.5()(64bit) ( )"
RPROVIDES:wget = "webclient ( ) bundled(gnulib) ( ) config(wget) ( =  1.24.5-5.el10) wget ( =  1.24.5-5.el10) wget(x86-64) ( =  1.24.5-5.el10)"
