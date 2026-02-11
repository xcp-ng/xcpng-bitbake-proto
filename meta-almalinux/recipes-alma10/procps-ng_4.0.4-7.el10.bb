
PN = "procps-ng"
PE = "0"
PV = "4.0.4"
PR = "7.el10"
PACKAGES = "procps-ng procps-ng-i18n procps-ng-devel"


URI_procps-ng = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/procps-ng-4.0.4-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:procps-ng = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libtinfo.so.6()(64bit) ( ) libncursesw.so.6()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_254)(64bit) ( )"
RPROVIDES:procps-ng = "/bin/ps ( ) /sbin/sysctl ( ) libproc2.so.0()(64bit) ( ) libproc2.so.0(LIBPROC_2)(64bit) ( ) procps-ng ( =  4.0.4-7.el10) procps ( =  4.0.4-7.el10) procps-ng(x86-64) ( =  4.0.4-7.el10)"

URI_procps-ng-i18n = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/procps-ng-i18n-4.0.4-7.el10.noarch.rpm;unpack=0"
RDEPENDS:procps-ng-i18n = "procps-ng ( =  4.0.4-7.el10)"
RPROVIDES:procps-ng-i18n = "procps-ng-i18n ( =  4.0.4-7.el10)"

URI_procps-ng-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/procps-ng-devel-4.0.4-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:procps-ng-devel = "/usr/bin/pkg-config ( ) libproc2.so.0()(64bit) ( ) procps-ng(x86-64) ( =  4.0.4-7.el10)"
RPROVIDES:procps-ng-devel = "pkgconfig(libproc2) ( =  4.0.4) procps-devel ( =  4.0.4-7.el10) procps-ng-devel ( =  4.0.4-7.el10) procps-ng-devel(x86-64) ( =  4.0.4-7.el10)"
