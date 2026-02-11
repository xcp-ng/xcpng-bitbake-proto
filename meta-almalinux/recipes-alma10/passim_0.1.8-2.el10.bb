
PN = "passim"
PE = "0"
PV = "0.1.8"
PR = "2.el10"
PACKAGES = "passim passim-devel passim-libs"


URI_passim = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/passim-0.1.8-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:passim = "/bin/sh ( ) rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libsoup-3.0.so.0()(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_0)(64bit) ( ) libpassim.so.1()(64bit) ( ) libpassim.so.1(LIBPASSIM_0.1.0)(64bit) ( ) libpassim.so.1(LIBPASSIM_0.1.2)(64bit) ( ) libpassim.so.1(LIBPASSIM_0.1.6)(64bit) ( ) passim-libs(x86-64) ( =  0.1.8-2.el10) glib2(x86-64) ( >=  2.45.8)"
RPROVIDES:passim = "metainfo() ( ) group(passim) ( ) metainfo(org.freedesktop.Passim.metainfo.xml) ( ) passim(x86-64) ( =  0.1.8-2.el10) config(passim) ( =  0.1.8-2.el10) passim ( =  0.1.8-2.el10) user(passim) ( =  dSBwYXNzaW0gLSAiTG9jYWwgQ2FjaGluZyBTZXJ2ZXIiIC91c3Ivc2hhcmUvZW1wdHkgLQAA)"

URI_passim-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/passim-devel-0.1.8-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:passim-devel = "/usr/bin/pkg-config ( ) pkgconfig(gio-2.0) ( ) libpassim.so.1()(64bit) ( ) passim(x86-64) ( =  0.1.8-2.el10) pkgconfig(gio-unix-2.0) ( >=  2.68.0)"
RPROVIDES:passim-devel = "passim-devel ( =  0.1.8-2.el10) passim-devel(x86-64) ( =  0.1.8-2.el10) pkgconfig(passim) ( =  0.1.8)"

URI_passim-libs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/passim-libs-0.1.8-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:passim-libs = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.27)(64bit) ( )"
RPROVIDES:passim-libs = "libpassim.so.1()(64bit) ( ) libpassim.so.1(LIBPASSIM_0.1.0)(64bit) ( ) libpassim.so.1(LIBPASSIM_0.1.2)(64bit) ( ) libpassim.so.1(LIBPASSIM_0.1.6)(64bit) ( ) libpassim.so.1(LIBPASSIM_0.1.5)(64bit) ( ) passim-libs(x86-64) ( =  0.1.8-2.el10) passim-libs ( =  0.1.8-2.el10)"
