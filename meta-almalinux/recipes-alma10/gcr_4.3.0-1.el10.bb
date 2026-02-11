
PN = "gcr"
PE = "0"
PV = "4.3.0"
PR = "1.el10"
PACKAGES = "gcr gcr-devel gcr-libs"


URI_gcr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcr-4.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcr = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libsecret-1.so.0()(64bit) ( ) libgcr-4.so.4()(64bit) ( ) libgck-2.so.2()(64bit) ( ) /usr/bin/ssh-add ( ) /usr/bin/ssh-agent ( ) /usr/bin/gpg2 ( ) gcr-libs(x86-64) ( =  4.3.0-1.el10)"
RPROVIDES:gcr = "gcr ( =  4.3.0-1.el10) gcr(x86-64) ( =  4.3.0-1.el10)"

URI_gcr-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcr-devel-4.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcr-devel = "/usr/bin/pkg-config ( ) libgcr-4.so.4()(64bit) ( ) libgck-2.so.2()(64bit) ( ) pkgconfig(gck-2) ( ) gcr-libs(x86-64) ( =  4.3.0-1.el10) pkgconfig(gio-2.0) ( >=  2.68) pkgconfig(glib-2.0) ( >=  2.68) pkgconfig(gobject-2.0) ( >=  2.68) pkgconfig(p11-kit-1) ( >=  0.19.0)"
RPROVIDES:gcr-devel = "gcr-devel ( =  4.3.0-1.el10) gcr-devel(x86-64) ( =  4.3.0-1.el10) pkgconfig(gck-2) ( =  4.3.0) pkgconfig(gcr-4) ( =  4.3.0)"

URI_gcr-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcr-libs-4.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcr-libs = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_13)(64bit) ( ) libc.so.6(GLIBC_2.28)(64bit) ( ) libp11-kit.so.0()(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_3)(64bit) ( ) libp11-kit.so.0(LIBP11_KIT_1.0)(64bit) ( ) libgnutls.so.30(GNUTLS_3_8_2)(64bit) ( )"
RPROVIDES:gcr-libs = "libgcr-4.so.4()(64bit) ( ) libgck-2.so.2()(64bit) ( ) gcr-libs(x86-64) ( =  4.3.0-1.el10) gcr-base ( =  4.3.0-1.el10) gcr-base(x86-64) ( =  4.3.0-1.el10) gcr-libs ( =  4.3.0-1.el10)"
