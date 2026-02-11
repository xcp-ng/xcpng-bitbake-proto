
PN = "parted"
PE = "0"
PV = "3.6"
PR = "7.el10"
PACKAGES = "parted parted-devel"


URI_parted = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/parted-3.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:parted = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libtinfo.so.6()(64bit) ( ) libreadline.so.8()(64bit) ( ) libuuid.so.1()(64bit) ( ) libdevmapper.so.1.02()(64bit) ( ) libdevmapper.so.1.02(Base)(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libdevmapper.so.1.02(DM_1_02_197)(64bit) ( ) libblkid.so.1()(64bit) ( ) libblkid.so.1(BLKID_2.15)(64bit) ( ) libblkid.so.1(BLKID_2.17)(64bit) ( ) libdevmapper.so.1.02(DM_1_02_97)(64bit) ( )"
RPROVIDES:parted = "bundled(gnulib) ( ) libparted-fs-resize.so.0()(64bit) ( ) libparted-fs-resize.so.0(LIBPARTED_FS_RESIZE_0.0.0)(64bit) ( ) libparted.so.2()(64bit) ( ) parted ( =  3.6-7.el10) parted(x86-64) ( =  3.6-7.el10)"

URI_parted-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/parted-devel-3.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:parted-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libparted-fs-resize.so.0()(64bit) ( ) libparted.so.2()(64bit) ( ) parted ( =  3.6-7.el10)"
RPROVIDES:parted-devel = "parted-devel ( =  3.6-7.el10) parted-devel(x86-64) ( =  3.6-7.el10) pkgconfig(libparted) ( =  3.6) pkgconfig(libparted-fs-resize) ( =  3.6)"
