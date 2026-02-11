
PN = "dlm"
PE = "0"
PV = "4.3.0"
PR = "1.el10"
PACKAGES = "dlm dlm-devel dlm-lib"


URI_dlm = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dlm-4.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dlm = "/bin/sh ( ) systemd-units ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libdlm.so.3()(64bit) ( ) libdlmcontrol.so.3()(64bit) ( ) libcmap.so.4()(64bit) ( ) libcfg.so.7()(64bit) ( ) libcfg.so.7(COROSYNC_CFG_0.82)(64bit) ( ) libcmap.so.4(COROSYNC_CMAP_1.0)(64bit) ( ) libcpg.so.4()(64bit) ( ) libcpg.so.4(COROSYNC_CPG_1.0)(64bit) ( ) libquorum.so.5()(64bit) ( ) libquorum.so.5(COROSYNC_QUORUM_1.0)(64bit) ( ) dlm-lib ( =  4.3.0-1.el10) corosync ( >=  3.1.0)"
RPROVIDES:dlm = "config(dlm) ( =  4.3.0-1.el10) dlm ( =  4.3.0-1.el10) dlm(x86-64) ( =  4.3.0-1.el10)"

URI_dlm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dlm-devel-4.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dlm-devel = "/usr/bin/pkg-config ( ) libdlm.so.3()(64bit) ( ) libdlmcontrol.so.3()(64bit) ( ) libdlm_lt.so.3()(64bit) ( ) dlm-lib ( =  4.3.0-1.el10)"
RPROVIDES:dlm-devel = "dlm-devel ( =  4.3.0-1.el10) dlm-devel(x86-64) ( =  4.3.0-1.el10) pkgconfig(libdlm) ( =  4.0.0) pkgconfig(libdlm_lt) ( =  4.0.0) pkgconfig(libdlmcontrol) ( =  4.0.0)"

URI_dlm-lib = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dlm-lib-4.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dlm-lib = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:dlm-lib = "libdlm.so.3()(64bit) ( ) libdlmcontrol.so.3()(64bit) ( ) libdlm_lt.so.3()(64bit) ( ) dlm-lib ( =  4.3.0-1.el10) dlm-lib(x86-64) ( =  4.3.0-1.el10)"
