
PN = "freeipmi"
PE = "0"
PV = "1.6.14"
PR = "4.el10"
PACKAGES = "freeipmi freeipmi-bmc-watchdog freeipmi-ipmidetectd freeipmi-ipmiseld freeipmi-devel"


URI_freeipmi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeipmi-1.6.14-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeipmi = "systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) /bin/sh ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgcrypt.so.20()(64bit) ( ) libgcrypt.so.20(GCRYPT_1.6)(64bit) ( ) libm.so.6(GLIBC_2.39)(64bit) ( )"
RPROVIDES:freeipmi = "libfreeipmi.so.17()(64bit) ( ) libipmiconsole.so.2()(64bit) ( ) libipmidetect.so.0()(64bit) ( ) libipmimonitoring.so.6()(64bit) ( ) freeipmi(x86-64) ( =  1.6.14-4.el10) config(freeipmi) ( =  1.6.14-4.el10) freeipmi ( =  1.6.14-4.el10)"

URI_freeipmi-bmc-watchdog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeipmi-bmc-watchdog-1.6.14-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeipmi-bmc-watchdog = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libfreeipmi.so.17()(64bit) ( ) freeipmi(x86-64) ( =  1.6.14-4.el10)"
RPROVIDES:freeipmi-bmc-watchdog = "config(freeipmi-bmc-watchdog) ( =  1.6.14-4.el10) freeipmi-bmc-watchdog ( =  1.6.14-4.el10) freeipmi-bmc-watchdog(x86-64) ( =  1.6.14-4.el10)"

URI_freeipmi-ipmidetectd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeipmi-ipmidetectd-1.6.14-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeipmi-ipmidetectd = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libfreeipmi.so.17()(64bit) ( ) freeipmi(x86-64) ( =  1.6.14-4.el10)"
RPROVIDES:freeipmi-ipmidetectd = "config(freeipmi-ipmidetectd) ( =  1.6.14-4.el10) freeipmi-ipmidetectd ( =  1.6.14-4.el10) freeipmi-ipmidetectd(x86-64) ( =  1.6.14-4.el10)"

URI_freeipmi-ipmiseld = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeipmi-ipmiseld-1.6.14-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeipmi-ipmiseld = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libfreeipmi.so.17()(64bit) ( ) freeipmi(x86-64) ( =  1.6.14-4.el10)"
RPROVIDES:freeipmi-ipmiseld = "config(freeipmi-ipmiseld) ( =  1.6.14-4.el10) freeipmi-ipmiseld ( =  1.6.14-4.el10) freeipmi-ipmiseld(x86-64) ( =  1.6.14-4.el10)"

URI_freeipmi-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freeipmi-devel-1.6.14-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeipmi-devel = "/usr/bin/pkg-config ( ) libfreeipmi.so.17()(64bit) ( ) libipmiconsole.so.2()(64bit) ( ) libipmidetect.so.0()(64bit) ( ) libipmimonitoring.so.6()(64bit) ( ) freeipmi(x86-64) ( =  1.6.14-4.el10)"
RPROVIDES:freeipmi-devel = "freeipmi-devel ( =  1.6.14-4.el10) freeipmi-devel(x86-64) ( =  1.6.14-4.el10) pkgconfig(libfreeipmi) ( =  1.6.14) pkgconfig(libipmiconsole) ( =  1.6.14) pkgconfig(libipmidetect) ( =  1.6.14) pkgconfig(libipmimonitoring) ( =  1.6.14)"
