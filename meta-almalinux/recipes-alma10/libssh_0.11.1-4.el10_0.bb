
PN = "libssh"
PE = "0"
PV = "0.11.1"
PR = "4.el10_0"
PACKAGES = "libssh libssh-config libssh-devel"


URI_libssh = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libssh-0.11.1-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libssh = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libz.so.1()(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libssh-config ( =  0.11.1-4.el10_0)"
RPROVIDES:libssh = "libssh.so.4()(64bit) ( ) libssh.so.4(LIBSSH_4_5_0)(64bit) ( ) libssh.so.4(LIBSSH_4_8_1)(64bit) ( ) libssh.so.4(LIBSSH_4_10_0)(64bit) ( ) libssh.so.4(LIBSSH_4_6_0)(64bit) ( ) libssh.so.4(LIBSSH_4_7_0)(64bit) ( ) libssh.so.4(LIBSSH_4_8_0)(64bit) ( ) libssh.so.4(LIBSSH_4_9_0)(64bit) ( ) libssh_threads.so.4()(64bit) ( ) libssh ( =  0.11.1-4.el10_0) libssh(x86-64) ( =  0.11.1-4.el10_0)"

URI_libssh-config = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libssh-config-0.11.1-4.el10_0.noarch.rpm;unpack=0"
RDEPENDS:libssh-config = ""
RPROVIDES:libssh-config = "libssh-config ( =  0.11.1-4.el10_0) config(libssh-config) ( =  0.11.1-4.el10_0)"

URI_libssh-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libssh-devel-0.11.1-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libssh-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) cmake-filesystem ( ) libssh.so.4()(64bit) ( ) libssh(x86-64) ( =  0.11.1-4.el10_0)"
RPROVIDES:libssh-devel = "cmake(libssh) ( =  0.11.1) pkgconfig(libssh) ( =  0.11.1) libssh-devel ( =  0.11.1-4.el10_0) libssh-devel(x86-64) ( =  0.11.1-4.el10_0)"
