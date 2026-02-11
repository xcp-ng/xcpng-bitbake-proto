
PN = "fprintd"
PE = "0"
PV = "1.94.5"
PR = "1.el10_0"
PACKAGES = "fprintd fprintd-pam fprintd-devel"


URI_fprintd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fprintd-1.94.5-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:fprintd = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libpolkit-gobject-1.so.0()(64bit) ( ) libfprint-2.so.2()(64bit) ( ) libfprint-2.so.2(LIBFPRINT_2.0.0)(64bit) ( )"
RPROVIDES:fprintd = "fprintd ( =  1.94.5-1.el10_0) fprintd(x86-64) ( =  1.94.5-1.el10_0)"

URI_fprintd-pam = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fprintd-pam-1.94.5-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:fprintd-pam = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_221)(64bit) ( ) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_237)(64bit) ( ) fprintd ( =  1.94.5-1.el10_0) authselect ( >=  0.3)"
RPROVIDES:fprintd-pam = "fprintd-pam ( =  1.94.5-1.el10_0) fprintd-pam(x86-64) ( =  1.94.5-1.el10_0) pam_fprint ( =  1.94.5-1.el10_0)"

URI_fprintd-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fprintd-devel-1.94.5-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:fprintd-devel = "fprintd ( =  1.94.5-1.el10_0)"
RPROVIDES:fprintd-devel = "fprintd-devel ( =  1.94.5-1.el10_0)"
