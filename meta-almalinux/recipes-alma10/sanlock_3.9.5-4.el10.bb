
PN = "sanlock"
PE = "0"
PV = "3.9.5"
PR = "4.el10"
PACKAGES = "sanlock sanlock-lib sanlock-devel"


URI_sanlock = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sanlock-3.9.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sanlock = "/bin/sh ( ) systemd-units ( ) systemd-sysv ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/bash ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libblkid.so.1()(64bit) ( ) libaio.so.1()(64bit) ( ) libaio.so.1(LIBAIO_0.1)(64bit) ( ) libaio.so.1(LIBAIO_0.4)(64bit) ( ) libblkid.so.1(BLKID_2.17)(64bit) ( ) libblkid.so.1(BLKID_2.15)(64bit) ( ) libsanlock.so.1()(64bit) ( ) libwdmd.so.1()(64bit) ( ) sanlock-lib ( =  3.9.5-4.el10)"
RPROVIDES:sanlock = "group(sanlock) ( ) config(sanlock) ( =  3.9.5-4.el10) sanlock ( =  3.9.5-4.el10) sanlock(x86-64) ( =  3.9.5-4.el10) user(sanlock) ( =  dSBzYW5sb2NrIDE3OSBzYW5sb2NrIC92YXIvcnVuL3NhbmxvY2sA)"

URI_sanlock-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sanlock-lib-3.9.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sanlock-lib = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libblkid.so.1()(64bit) ( ) libaio.so.1()(64bit) ( ) libaio.so.1(LIBAIO_0.1)(64bit) ( ) libaio.so.1(LIBAIO_0.4)(64bit) ( ) libblkid.so.1(BLKID_2.17)(64bit) ( ) libblkid.so.1(BLKID_2.15)(64bit) ( )"
RPROVIDES:sanlock-lib = "libsanlock.so.1()(64bit) ( ) libsanlock_client.so.1()(64bit) ( ) libwdmd.so.1()(64bit) ( ) sanlock-lib ( =  3.9.5-4.el10) sanlock-lib(x86-64) ( =  3.9.5-4.el10)"

URI_sanlock-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sanlock-devel-3.9.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sanlock-devel = "/usr/bin/pkg-config ( ) libsanlock_client.so.1()(64bit) ( ) libsanlock.so.1()(64bit) ( ) libwdmd.so.1()(64bit) ( ) sanlock-lib ( =  3.9.5-4.el10)"
RPROVIDES:sanlock-devel = "pkgconfig(libsanlock) ( =  3.9.5) pkgconfig(libsanlock_client) ( =  3.9.5) sanlock-devel ( =  3.9.5-4.el10) sanlock-devel(x86-64) ( =  3.9.5-4.el10)"
