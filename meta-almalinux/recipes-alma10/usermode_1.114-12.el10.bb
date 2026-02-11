
PN = "usermode"
PE = "0"
PV = "1.114"
PR = "12.el10"
PACKAGES = "usermode"


URI_usermode = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/usermode-1.114-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usermode = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) util-linux ( ) pam ( ) libpam_misc.so.0()(64bit) ( ) libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) ( ) passwd ( ) libuser.so.1()(64bit) ( )"
RPROVIDES:usermode = "config(usermode) ( =  1.114-12.el10) usermode ( =  1.114-12.el10) usermode(x86-64) ( =  1.114-12.el10)"
