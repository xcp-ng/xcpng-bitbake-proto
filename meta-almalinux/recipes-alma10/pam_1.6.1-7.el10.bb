
PN = "pam"
PE = "0"
PV = "1.6.1"
PR = "7.el10"
PACKAGES = "pam pam-libs pam-devel pam-doc"


URI_pam = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pam-1.6.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pam = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libcrypto.so.3()(64bit) ( ) /usr/bin/sh ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libaudit.so.1()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) ( ) libgdbm.so.6()(64bit) ( ) setup ( ) gdbm ( ) libeconf.so.0()(64bit) ( ) libeconf.so.0(LIBECONF_0.2)(64bit) ( ) libpam.so.0(LIBPAM_MODUTIL_1.0)(64bit) ( ) libeconf.so.0(LIBECONF_0.4)(64bit) ( ) libpam.so.0(LIBPAM_MODUTIL_1.1.9)(64bit) ( ) libcrypt.so.2(XCRYPT_4.3)(64bit) ( ) libpam.so.0(LIBPAM_EXTENSION_1.1)(64bit) ( ) libpam.so.0(LIBPAM_MODUTIL_1.1)(64bit) ( ) libpam.so.0(LIBPAM_MODUTIL_1.1.3)(64bit) ( ) libpam.so.0(LIBPAM_MODUTIL_1.3.2)(64bit) ( ) libpam.so.0(LIBPAM_MODUTIL_1.4.1)(64bit) ( ) libpwquality(x86-64) ( ) pam-libs(x86-64) ( =  1.6.1-7.el10) authselect ( >=  1.3)"
RPROVIDES:pam = "rpm_macro(_pam_confdir) ( ) rpm_macro(_pam_libdir) ( ) rpm_macro(_pam_moduledir) ( ) rpm_macro(_pam_secconfdir) ( ) rpm_macro(_pam_vendordir) ( ) config(pam) ( =  1.6.1-7.el10) pam ( =  1.6.1-7.el10) pam(x86-64) ( =  1.6.1-7.el10)"

URI_pam-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pam-libs-1.6.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pam-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( ) libaudit.so.1()(64bit) ( ) libeconf.so.0()(64bit) ( ) libeconf.so.0(LIBECONF_0.2)(64bit) ( )"
RPROVIDES:pam-libs = "libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) ( ) libpam_misc.so.0()(64bit) ( ) libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) ( ) libpam.so.0(LIBPAM_MODUTIL_1.0)(64bit) ( ) libpam.so.0(LIBPAM_MODUTIL_1.1.9)(64bit) ( ) libpam.so.0(LIBPAM_EXTENSION_1.1)(64bit) ( ) libpam.so.0(LIBPAM_EXTENSION_1.1.1)(64bit) ( ) libpam.so.0(LIBPAM_MODUTIL_1.1)(64bit) ( ) libpam.so.0(LIBPAM_MODUTIL_1.1.3)(64bit) ( ) libpam.so.0(LIBPAM_MODUTIL_1.3.2)(64bit) ( ) libpam.so.0(LIBPAM_MODUTIL_1.4.1)(64bit) ( ) libpam.so.0(LIBPAM_1.4)(64bit) ( ) libpamc.so.0()(64bit) ( ) libpamc.so.0(LIBPAMC_1.0)(64bit) ( ) pam-libs(x86-64) ( =  1.6.1-7.el10) pam-libs ( =  1.6.1-7.el10)"

URI_pam-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pam-devel-1.6.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pam-devel = "/usr/bin/pkg-config ( ) libpam.so.0()(64bit) ( ) libpam_misc.so.0()(64bit) ( ) libpamc.so.0()(64bit) ( ) pam-libs(x86-64) ( =  1.6.1-7.el10)"
RPROVIDES:pam-devel = "pam-devel ( =  1.6.1-7.el10) pam-devel(x86-64) ( =  1.6.1-7.el10) pkgconfig(pam) ( =  1.6.1) pkgconfig(pam_misc) ( =  1.6.1) pkgconfig(pamc) ( =  1.6.1)"

URI_pam-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pam-doc-1.6.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:pam-doc = "pam ( =  1.6.1-7.el10)"
RPROVIDES:pam-doc = "pam-doc ( =  1.6.1-7.el10) pam-docs ( =  1.6.1-7.el10)"
