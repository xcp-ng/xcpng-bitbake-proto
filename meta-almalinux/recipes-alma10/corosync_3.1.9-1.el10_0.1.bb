
PN = "corosync"
PE = "0"
PV = "3.1.9"
PR = "1.el10_0.1"
PACKAGES = "corosynclib corosync-vqsim"


URI_corosynclib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/corosynclib-3.1.9-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:corosynclib = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libqb.so.100()(64bit) ( )"
RPROVIDES:corosynclib = "libcpg.so.4()(64bit) ( ) libcpg.so.4(COROSYNC_CPG_1.0)(64bit) ( ) libcmap.so.4()(64bit) ( ) libcmap.so.4(COROSYNC_CMAP_1.0)(64bit) ( ) libcfg.so.7()(64bit) ( ) libcorosync_common.so.4()(64bit) ( ) libquorum.so.5()(64bit) ( ) libquorum.so.5(COROSYNC_QUORUM_1.0)(64bit) ( ) libvotequorum.so.8()(64bit) ( ) libvotequorum.so.8(COROSYNC_VOTEQUORUM_1.0)(64bit) ( ) libcfg.so.7(COROSYNC_CFG_0.82)(64bit) ( ) libsam.so.4()(64bit) ( ) libsam.so.4(COROSYNC_SAM_1.0)(64bit) ( ) corosynclib ( =  3.1.9-1.el10_0.1) corosynclib(x86-64) ( =  3.1.9-1.el10_0.1)"

URI_corosync-vqsim = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/corosync-vqsim-3.1.9-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:corosync-vqsim = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) pkgconfig ( ) libreadline.so.8()(64bit) ( ) libknet.so.1()(64bit) ( ) libknet.so.1(LIBKNET)(64bit) ( ) libcorosync_common.so.4()(64bit) ( ) libqb.so.100()(64bit) ( ) corosynclib(x86-64) ( =  3.1.9-1.el10_0.1)"
RPROVIDES:corosync-vqsim = "corosync-vqsim ( =  3.1.9-1.el10_0.1) corosync-vqsim(x86-64) ( =  3.1.9-1.el10_0.1)"
