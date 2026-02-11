
PN = "sbd"
PE = "0"
PV = "1.5.2"
PR = "1.el10.5"
PACKAGES = "sbd sbd-tests"


URI_sbd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sbd-1.5.2-1.el10.5.x86_64_v2.rpm;unpack=0"
RDEPENDS:sbd = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) /usr/bin/pkg-config ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libaio.so.1()(64bit) ( ) libaio.so.1(LIBAIO_0.1)(64bit) ( ) libaio.so.1(LIBAIO_0.4)(64bit) ( ) libqb.so.100()(64bit) ( ) libcrmcommon.so.68()(64bit) ( ) libcmap.so.4()(64bit) ( ) libcmap.so.4(COROSYNC_CMAP_1.0)(64bit) ( ) libcib.so.54()(64bit) ( ) libcrmcluster.so.53()(64bit) ( ) libpe_status.so.56()(64bit) ( ) libvotequorum.so.8()(64bit) ( ) libvotequorum.so.8(COROSYNC_VOTEQUORUM_1.0)(64bit) ( )"
RPROVIDES:sbd = "config(sbd) ( =  1.5.2-1.el10.5) pkgconfig(sbd) ( =  1.5.2) sbd ( =  1.5.2-1.el10.5) sbd(x86-64) ( =  1.5.2-1.el10.5)"

URI_sbd-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sbd-tests-1.5.2-1.el10.5.x86_64_v2.rpm;unpack=0"
RDEPENDS:sbd-tests = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/bash ( ) libglib-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libuuid.so.1()(64bit) ( ) libaio.so.1()(64bit) ( ) libcmap.so.4()(64bit) ( ) libqb.so.100()(64bit) ( ) libcib.so.54()(64bit) ( ) libcrmcluster.so.53()(64bit) ( ) libcrmcommon.so.68()(64bit) ( ) libpe_rules.so.51()(64bit) ( ) libpe_status.so.56()(64bit) ( ) libvotequorum.so.8()(64bit) ( )"
RPROVIDES:sbd-tests = "libsbdtestbed.so.0()(64bit) ( ) sbd-tests ( =  1.5.2-1.el10.5) sbd-tests(x86-64) ( =  1.5.2-1.el10.5)"
