
PN = "sysfsutils"
PE = "0"
PV = "2.1.1"
PR = "14.el10"
PACKAGES = "libsysfs sysfsutils libsysfs-devel"


URI_libsysfs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libsysfs-2.1.1-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsysfs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.33)(64bit) ( )"
RPROVIDES:libsysfs = "libsysfs.so.2()(64bit) ( ) libsysfs ( =  2.1.1-14.el10) libsysfs(x86-64) ( =  2.1.1-14.el10)"

URI_sysfsutils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sysfsutils-2.1.1-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sysfsutils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libsysfs.so.2()(64bit) ( ) libsysfs ( =  2.1.1-14.el10)"
RPROVIDES:sysfsutils = "sysfsutils ( =  2.1.1-14.el10) sysfsutils(x86-64) ( =  2.1.1-14.el10)"

URI_libsysfs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsysfs-devel-2.1.1-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsysfs-devel = "/usr/bin/pkg-config ( ) libsysfs.so.2()(64bit) ( ) libsysfs ( =  2.1.1-14.el10)"
RPROVIDES:libsysfs-devel = "libsysfs-devel ( =  2.1.1-14.el10) libsysfs-devel(x86-64) ( =  2.1.1-14.el10) pkgconfig(libsysfs) ( =  2.1.1)"
