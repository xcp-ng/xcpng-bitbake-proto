
PN = "libserf"
PE = "0"
PV = "1.3.10"
PR = "7.el10"
PACKAGES = "libserf libserf-devel"


URI_libserf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libserf-1.3.10-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libserf = "rtld(GNU_HASH) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libapr-1.so.0()(64bit) ( ) libaprutil-1.so.0()(64bit) ( )"
RPROVIDES:libserf = "libserf-1.so.0()(64bit) ( ) libserf ( =  1.3.10-7.el10) libserf(x86-64) ( =  1.3.10-7.el10)"

URI_libserf-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libserf-devel-1.3.10-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libserf-devel = "/usr/bin/pkg-config ( ) libserf-1.so.0()(64bit) ( ) pkgconfig(libcrypto) ( ) pkgconfig(libssl) ( ) apr-devel(x86-64) ( ) libserf(x86-64) ( =  1.3.10-7.el10)"
RPROVIDES:libserf-devel = "libserf-devel ( =  1.3.10-7.el10) libserf-devel(x86-64) ( =  1.3.10-7.el10) pkgconfig(serf) ( =  1.3.0)"
