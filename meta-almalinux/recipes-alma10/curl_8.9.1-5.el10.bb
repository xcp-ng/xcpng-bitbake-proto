
PN = "curl"
PE = "0"
PV = "8.9.1"
PR = "5.el10"
PACKAGES = "curl libcurl libcurl-minimal libcurl-devel"


URI_curl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/curl-8.9.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:curl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcurl.so.4()(64bit) ( ) libcurl(x86-64) ( >=  8.9.1-5.el10)"
RPROVIDES:curl = "webclient ( ) curl ( =  8.9.1-5.el10) curl(x86-64) ( =  8.9.1-5.el10) curl-full ( =  8.9.1-5.el10) curl-minimal ( =  8.9.1-5.el10)"

URI_libcurl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcurl-8.9.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcurl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libz.so.1()(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) liblber.so.2()(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libidn2.so.0()(64bit) ( ) libidn2.so.0(IDN2_0.0.0)(64bit) ( ) libssl.so.3(OPENSSL_3.2.0)(64bit) ( ) libbrotlidec.so.1()(64bit) ( ) libnghttp2.so.14()(64bit) ( ) libssh.so.4()(64bit) ( ) libssh.so.4(LIBSSH_4_5_0)(64bit) ( ) libssh.so.4(LIBSSH_4_8_1)(64bit) ( ) libpsl.so.5()(64bit) ( ) libnghttp2(x86-64) ( >=  1.64.0) openssl-libs(x86-64) ( >=  1:3.2.2) libpsl(x86-64) ( >=  0.21.5) libssh(x86-64) ( >=  0.11.1)"
RPROVIDES:libcurl = "libcurl.so.4()(64bit) ( ) libcurl ( =  8.9.1-5.el10) libcurl(x86-64) ( =  8.9.1-5.el10) libcurl-full ( =  8.9.1-5.el10) libcurl-full(x86-64) ( =  8.9.1-5.el10)"

URI_libcurl-minimal = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcurl-minimal-8.9.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcurl-minimal = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libz.so.1()(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libidn2.so.0()(64bit) ( ) libidn2.so.0(IDN2_0.0.0)(64bit) ( ) libssl.so.3(OPENSSL_3.2.0)(64bit) ( ) libnghttp2.so.14()(64bit) ( ) libnghttp2(x86-64) ( >=  1.64.0) openssl-libs(x86-64) ( >=  1:3.2.2)"
RPROVIDES:libcurl-minimal = "libcurl.so.4()(64bit) ( ) libcurl ( =  8.9.1-5.el10) libcurl(x86-64) ( =  8.9.1-5.el10) libcurl-minimal ( =  8.9.1-5.el10) libcurl-minimal(x86-64) ( =  8.9.1-5.el10)"

URI_libcurl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcurl-devel-8.9.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcurl-devel = "/usr/bin/sh ( ) /usr/bin/pkg-config ( ) libcurl.so.4()(64bit) ( ) pkgconfig(zlib) ( ) pkgconfig(libbrotlidec) ( ) pkgconfig(libnghttp2) ( ) pkgconfig(libidn2) ( ) pkgconfig(openssl) ( ) pkgconfig(libpsl) ( ) pkgconfig(libssh) ( ) libcurl(x86-64) ( =  8.9.1-5.el10)"
RPROVIDES:libcurl-devel = "curl-devel ( =  8.9.1-5.el10) curl-devel(x86-64) ( =  8.9.1-5.el10) libcurl-devel ( =  8.9.1-5.el10) libcurl-devel(x86-64) ( =  8.9.1-5.el10) pkgconfig(libcurl) ( =  8.9.1)"
