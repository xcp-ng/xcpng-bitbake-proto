
PN = "glib-networking"
PE = "0"
PV = "2.80.0"
PR = "3.el10"
PACKAGES = "glib-networking glib-networking-tests"


URI_glib-networking = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/glib-networking-2.80.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:glib-networking = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_3)(64bit) ( ) ca-certificates ( ) gsettings-desktop-schemas ( ) libgnutls.so.30(GNUTLS_3_7_4)(64bit) ( ) libproxy.so.1()(64bit) ( ) libproxy.so.1(LIBPROXY_0.4.16)(64bit) ( ) glib2(x86-64) ( >=  2.73.3)"
RPROVIDES:glib-networking = "libgiognomeproxy.so()(64bit) ( ) libgiognutls.so()(64bit) ( ) libgiolibproxy.so()(64bit) ( ) glib-networking ( =  2.80.0-3.el10) glib-networking(x86-64) ( =  2.80.0-3.el10)"

URI_glib-networking-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/glib-networking-tests-2.80.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:glib-networking-tests = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/bash ( ) libglib-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_0)(64bit) ( ) glib-networking(x86-64) ( =  2.80.0-3.el10)"
RPROVIDES:glib-networking-tests = "glib-networking-tests ( =  2.80.0-3.el10) glib-networking-tests(x86-64) ( =  2.80.0-3.el10)"
