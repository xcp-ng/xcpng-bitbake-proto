
PN = "libsecret"
PE = "0"
PV = "0.21.2"
PR = "7.el10"
PACKAGES = "libsecret libsecret-devel"


URI_libsecret = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsecret-0.21.2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsecret = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_13)(64bit) ( ) libgnutls.so.30(GNUTLS_3_8_2)(64bit) ( )"
RPROVIDES:libsecret = "libsecret-1.so.0()(64bit) ( ) bundled(egglib) ( ) libsecret(x86-64) ( =  0.21.2-7.el10) libsecret ( =  0.21.2-7.el10)"

URI_libsecret-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsecret-devel-0.21.2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsecret-devel = "/usr/bin/pkg-config ( ) libsecret-1.so.0()(64bit) ( ) pkgconfig(libsecret-1) ( ) pkgconfig(gio-unix-2.0) ( >=  2.44) libsecret(x86-64) ( =  0.21.2-7.el10) pkgconfig(gio-2.0) ( >=  2.44) pkgconfig(glib-2.0) ( >=  2.44) pkgconfig(gnutls) ( >=  3.8.2)"
RPROVIDES:libsecret-devel = "libsecret-devel ( =  0.21.2-7.el10) libsecret-devel(x86-64) ( =  0.21.2-7.el10) pkgconfig(libsecret-1) ( =  0.21.2) pkgconfig(libsecret-unstable) ( =  0.21.2)"
