
PN = "mod_authnz_pam"
PE = "0"
PV = "1.2.3"
PR = "9.el10"
PACKAGES = "mod_authnz_pam"


URI_mod_authnz_pam = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_authnz_pam-1.2.3-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_authnz_pam = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) pam ( ) httpd-mmn ( =  20120211x8664)"
RPROVIDES:mod_authnz_pam = "config(mod_authnz_pam) ( =  1.2.3-9.el10) mod_authnz_pam ( =  1.2.3-9.el10) mod_authnz_pam(x86-64) ( =  1.2.3-9.el10)"
