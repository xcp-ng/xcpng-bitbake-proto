
PN = "librhsm"
PE = "0"
PV = "0.0.3"
PR = "16.el10"
PACKAGES = "librhsm librhsm-devel"


URI_librhsm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/librhsm-0.0.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librhsm = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( )"
RPROVIDES:librhsm = "librhsm.so.0()(64bit) ( ) librhsm ( =  0.0.3-16.el10) librhsm(x86-64) ( =  0.0.3-16.el10)"

URI_librhsm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/librhsm-devel-0.0.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librhsm-devel = "/usr/bin/pkg-config ( ) pkgconfig(openssl) ( ) librhsm.so.0()(64bit) ( ) pkgconfig(glib-2.0) ( >=  2.44) pkgconfig(gio-2.0) ( >=  2.44) pkgconfig(gobject-2.0) ( >=  2.44) librhsm(x86-64) ( =  0.0.3-16.el10) pkgconfig(glib-2.0) ( >=  1.2) pkgconfig(json-glib-1.0) ( >=  1.2)"
RPROVIDES:librhsm-devel = "librhsm-devel ( =  0.0.3-16.el10) librhsm-devel(x86-64) ( =  0.0.3-16.el10) pkgconfig(librhsm) ( =  0.0.3)"
