
PN = "libjcat"
PE = "0"
PV = "0.2.2"
PR = "2.el10"
PACKAGES = "libjcat libjcat-devel libjcat-tests"


URI_libjcat = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libjcat-0.2.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjcat = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_0)(64bit) ( ) libgpgme.so.11()(64bit) ( ) libgpgme.so.11(GPGME_1.0)(64bit) ( ) libgpgme.so.11(GPGME_1.1)(64bit) ( ) glib2(x86-64) ( >=  2.45.8)"
RPROVIDES:libjcat = "libjcat.so.1()(64bit) ( ) libjcat.so.1(LIBJCAT_0.1.0)(64bit) ( ) libjcat.so.1(LIBJCAT_0.1.11)(64bit) ( ) libjcat.so.1(LIBJCAT_0.1.12)(64bit) ( ) libjcat.so.1(LIBJCAT_0.1.3)(64bit) ( ) libjcat.so.1(LIBJCAT_0.1.1)(64bit) ( ) libjcat.so.1(LIBJCAT_0.1.9)(64bit) ( ) libjcat.so.1(LIBJCAT_0.2.0)(64bit) ( ) libjcat ( =  0.2.2-2.el10) libjcat(x86-64) ( =  0.2.2-2.el10)"

URI_libjcat-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libjcat-devel-0.2.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjcat-devel = "/usr/bin/pkg-config ( ) libjcat.so.1()(64bit) ( ) pkgconfig(gnutls) ( >=  3.6.0) pkgconfig(json-glib-1.0) ( >=  1.1.1) pkgconfig(gio-2.0) ( >=  2.45.8) libjcat(x86-64) ( =  0.2.2-2.el10)"
RPROVIDES:libjcat-devel = "libjcat-devel ( =  0.2.2-2.el10) libjcat-devel(x86-64) ( =  0.2.2-2.el10) pkgconfig(jcat) ( =  0.2.2)"

URI_libjcat-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libjcat-tests-0.2.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjcat-tests = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libgpgme.so.11()(64bit) ( ) libgpgme.so.11(GPGME_1.0)(64bit) ( ) libgpgme.so.11(GPGME_1.1)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_0)(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( )"
RPROVIDES:libjcat-tests = "libjcat-tests ( =  0.2.2-2.el10) libjcat-tests(x86-64) ( =  0.2.2-2.el10)"
